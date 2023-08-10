package com.school.sptech.grupo3.gobread.apiviacep;

import lombok.Builder;

public record AddressViaCep(
        String cep,
        String logradouro,
        String localidade,
        String complemento,
        String bairro,
        String uf
) {}
