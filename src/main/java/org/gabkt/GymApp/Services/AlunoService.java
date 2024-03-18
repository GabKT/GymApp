package org.gabkt.GymApp.Services;


import org.gabkt.GymApp.Entities.Aluno;
import org.gabkt.GymApp.Entities.RequestAlunoDTO;
import org.gabkt.GymApp.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno insertAluno(RequestAlunoDTO dto){
        Aluno aluno = new Aluno(dto);
        return alunoRepository.save(aluno);
    }

}
