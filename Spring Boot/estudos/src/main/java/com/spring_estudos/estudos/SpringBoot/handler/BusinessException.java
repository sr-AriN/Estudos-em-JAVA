package com.spring_estudos.estudos.SpringBoot.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String mensagem) {
        super(mensagem);
    }

    public BusinessException(String mensagem, Object... params) {
        super(String.format(mensagem, params));
    }
}
