package com.school.sptech.grupo3.gobread.controller.request;

public record ClientRequest (
    String nome,
    String cpf,
    String telefone,
    String email,
    String senha,
    AddressRequest endereco
) {}
