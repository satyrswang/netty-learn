package com.wyq.netty.rpckids.client;

public class RPCException extends RuntimeException{
    public RPCException() {
        super();
    }

    public RPCException(String message) {
        super(message);
        System.out.println("here in RpcException constractor");
        System.out.println(message);
    }

    public RPCException(String message, Throwable cause) {
        super(message, cause);
    }

    public RPCException(Throwable cause) {
        super(cause);
    }

    protected RPCException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
