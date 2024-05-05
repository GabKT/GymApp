package org.gabkt.GymApp.Controllers;


import org.gabkt.GymApp.Entities.Aluno;
import org.gabkt.GymApp.Entities.RequestAlunoDTO;
import org.gabkt.GymApp.Services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/aluno")
@CrossOrigin(origins = "*")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
    @PostMapping
    public ResponseEntity<Aluno> insertAluno(@RequestBody RequestAlunoDTO raAluno){
        Aluno aluno = alunoService.insertAluno(raAluno);
        return ResponseEntity.ok(aluno);
    }
}
