package org.gabkt.GymApp.Repositories;

import org.gabkt.GymApp.Entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, String> {

}
