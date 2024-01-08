package com.example.cashregister.execption;

public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
    public CustomException() { }

    /**
     * 丢出一个异常
     *
     * @param message
     */
    public static void fail(String message) {
        throw new CustomException(message);
    }
}
