package com.school.sptech.grupo3.gobread.controller.request;

public record AddressRequest(
        String cep,
        Integer numero,
        String complemento
) {}
