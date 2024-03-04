package org.gabkt.GymApp.Services;


import org.gabkt.GymApp.Entities.Aluno;
import org.gabkt.GymApp.Repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public Aluno insertAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }
}
