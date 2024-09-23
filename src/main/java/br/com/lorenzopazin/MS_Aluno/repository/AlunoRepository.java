package br.com.lorenzopazin.MS_Aluno.repository;

import br.com.lorenzopazin.MS_Aluno.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
