package com.engineering.microservice.awsdynamodb.exception;

/**
 * trigger for data not found exception
 */
public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String msg) {
        super(msg);
    }
}
