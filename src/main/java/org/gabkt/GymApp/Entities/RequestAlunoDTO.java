package org.gabkt.GymApp.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record RequestAlunoDTO(
        String nome,
        Long cpf,
        Long rg,
        @JsonFormat(pattern = "dd/MM/yyyy") LocalDate dataNasc,
        Long celular,
        String endereco,
        String plano,
        Integer dataPag,
        String obs,
        String professor,
        @JsonFormat(pattern = "dd/MM/yyyy") LocalDate ingresso
) {}
