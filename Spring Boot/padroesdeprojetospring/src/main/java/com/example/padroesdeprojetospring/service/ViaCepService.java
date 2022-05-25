package com.example.padroesdeprojetospring.service;

import com.example.padroesdeprojetospring.model.Endereco;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {

    // @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json/")
    @GetMapping("/{cep}/json/")
    Endereco consultaCep(@PathVariable("cep") String cep);
}
