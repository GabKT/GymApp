package org.gabkt.GymApp.Controllers;


import org.gabkt.GymApp.Entities.RequestAlunoDTO;
import org.gabkt.GymApp.Services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pro")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
    @PostMapping
    public ResponseEntity<RequestAlunoDTO> insertAluno(@RequestBody RequestAlunoDTO raAluno){
        System.out.println(raAluno);
        return ResponseEntity.ok(raAluno);
    }
}
