package com.scott.java.design.pattern.behavior.chainofresponsibility.sample;

/**
 * Created by lizhaok on 5/13/2018.
 */
public abstract class AbstractHandler implements Handler{
    AbstractHandler successor;

    public AbstractHandler(AbstractHandler successor) {
        this.successor = successor;
    }

    public void handlerRequest(Request request) {
//        if (successor != null) {
//            successor.handlerRequest(request);
//        }
        switch (request.getType()) {
            case Handler1:
                request.print();
                successor.handlerRequest(request);
                break;
            case Hander2:
                request.print();
                System.out.println("Hander2");
                break;
        }
    }

}
