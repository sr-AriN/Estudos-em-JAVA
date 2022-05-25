package com.example.projetofeign2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private ConsumindoAPI consumindoAPI;

    @GetMapping
    public Contato retornaContato() {
        return consumindoAPI.retornaContato();
    }
}
