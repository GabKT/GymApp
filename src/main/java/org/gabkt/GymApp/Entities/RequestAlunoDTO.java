package org.gabkt.GymApp.Entities;

import java.time.Instant;

public record RequestAlunoDTO(String nome, Integer cpf, Integer rg, Instant dataNasc, Integer celular, String endereco, String plano, Instant dataPag, String obs, Professor professor, Instant ingresso) {
}
