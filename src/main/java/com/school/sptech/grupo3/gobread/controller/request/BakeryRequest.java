package com.school.sptech.grupo3.gobread.controller.request;

import lombok.Builder;

public record BakeryRequest (
    String nomePadaria,
    String email,
    String senha,
    AddressRequest endereco
) {}
