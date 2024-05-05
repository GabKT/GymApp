package org.gabkt.GymApp.Entities;


import java.io.Serializable;

public record RequestAlunoDTO(
        String nome,
        Long cpf,
        Long rg,
        Long datanasc,
        Long celular,
        String endereco,
        Integer datapag,
        String obs,
        Long ingresso
) {}
