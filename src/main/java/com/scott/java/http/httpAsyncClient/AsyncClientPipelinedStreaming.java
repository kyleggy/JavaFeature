package com.scott.java.http.httpAsyncClient;

import org.apache.http.*;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.CloseableHttpPipeliningClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.IOControl;
import org.apache.http.nio.client.methods.AsyncCharConsumer;
import org.apache.http.nio.entity.HttpAsyncContentProducer;
import org.apache.http.nio.protocol.BasicAsyncRequestProducer;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by lizhaok on 2016/7/22.
 */
public class AsyncClientPipelinedStreaming {

    public static void main(final String[] args) throws Exception {
        CloseableHttpPipeliningClient httpClient = HttpAsyncClients.createPipelining();
        try {
            httpClient.start();

            HttpHost targetHost = new HttpHost("www.163.com");
            HttpGet[] requests = {
                    new HttpGet("/docs/index.html"),
                    new HttpGet("/docs/introduction.html"),
                    new HttpGet("/docs/setup.html"),
                    new HttpGet("/docs/config/index.html")
            };

            List<MyRequestProducer> requestProducerList = new ArrayList<>();
            List<MyResponseConsumer> responseConsumers = new ArrayList<>();
            for (HttpGet request : requests) {
                requestProducerList.add(new MyRequestProducer(targetHost, request));
                responseConsumers.add(new MyResponseConsumer(request));
            }

            Future<List<Boolean>> future = httpClient.execute(targetHost, requestProducerList, responseConsumers, null);
            future.get();
            System.out.println("Shutting down");

        } finally {
            httpClient.close();
        }
        System.out.println("Done");
    }

    static class MyRequestProducer extends BasicAsyncRequestProducer {
        private final HttpRequest request;

        public MyRequestProducer(HttpHost target, HttpRequest request) {
            super(target, request);
            this.request = request;
        }

        @Override
        public void requestCompleted(final HttpContext context) {
            super.requestCompleted(context);
            System.out.println();
            System.out.println("Request sent: " + this.request.getRequestLine());
            System.out.println("================================");
        }
    }

    static class MyResponseConsumer extends AsyncCharConsumer<Boolean> {

        private final HttpRequest request;

        MyResponseConsumer(final HttpRequest request) {
            this.request = request;
        }

        @Override
        protected void onCharReceived(CharBuffer buf, IOControl ioctrl) throws IOException {
            while(buf.hasRemaining()) {
                System.out.println(buf.get());
            }
        }

        @Override
        protected void onResponseReceived(HttpResponse response) throws HttpException, IOException {
            System.out.println();
            System.out.println("Response received: " + response.getStatusLine() + " -> " + this.request.getRequestLine());
            System.out.println("=========================");
        }

        @Override
        protected Boolean buildResult(HttpContext context) throws Exception {
            System.out.println();
            System.out.println("=====================");
            System.out.println();
            return Boolean.TRUE;
        }
    }
}
