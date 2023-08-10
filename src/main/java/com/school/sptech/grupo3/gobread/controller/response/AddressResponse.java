package com.school.sptech.grupo3.gobread.controller.response;



public record AddressResponse(
        String cep,
        String rua,
        Integer numero,
        String complemento,
        String bairro,
        String cidade,
        String estado
) {}
