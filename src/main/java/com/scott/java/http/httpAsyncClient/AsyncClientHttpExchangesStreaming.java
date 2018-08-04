package com.scott.java.http.httpAsyncClient;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.IOControl;
import org.apache.http.nio.client.methods.AsyncCharConsumer;
import org.apache.http.nio.client.methods.HttpAsyncMethods;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by lizhaok on 2016/7/22.
 */
public class AsyncClientHttpExchangesStreaming {

    public static void main(String[] args) {
        CloseableHttpAsyncClient httpClient = HttpAsyncClients.createDefault();

        httpClient.start();
        Future<Boolean> future = httpClient.execute(HttpAsyncMethods.createGet("http://www.163.com"), new MyResponseConsumer(), null);
        try {
            Boolean result = future.get();
            if (result != null && result.booleanValue()) {
                System.out.println("Request successfully executed");
            } else {
                System.out.println("Request failed");
            }
            System.out.println("Shutting down");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Done");
    }



    static class MyResponseConsumer extends AsyncCharConsumer<Boolean> {

        @Override
        protected void onCharReceived(CharBuffer charBuffer, IOControl ioControl) throws IOException {
            while(charBuffer.hasRemaining()) {
                System.out.print(charBuffer.get());
            }
        }

        @Override
        protected void onResponseReceived(HttpResponse response) throws HttpException, IOException {
            System.out.print(response.getStatusLine());

        }

        @Override
        protected Boolean buildResult(HttpContext context) throws Exception {
            return Boolean.TRUE;
        }
    }
}
