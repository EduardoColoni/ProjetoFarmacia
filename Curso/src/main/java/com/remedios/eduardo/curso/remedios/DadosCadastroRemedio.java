package com.remedios.eduardo.curso.remedios;

public record DadosCadastroRemedio(
        String nome,
        Via via,
        String lote,
        String Quantidade,
        String validade,
        Laboratorio laboratorio
) {

}
