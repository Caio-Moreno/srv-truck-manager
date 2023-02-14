package com.br.canix.srvtruckmanager.domain.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String message, Throwable e) {
        super(message, e);
    }

    public BusinessException(String message) {
        super(message);
    }

}
