package com.spring_estudos.estudos.SpringBoot.handler;

public class CampoObrigatorioException extends BusinessException {

    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatório ", campo);
    }

}
