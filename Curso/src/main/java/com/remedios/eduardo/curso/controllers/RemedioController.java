package com.remedios.eduardo.curso.controllers;

import com.remedios.eduardo.curso.remedios.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemedio dados) {
        System.out.println(dados);
    }
}
