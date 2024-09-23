package br.com.lorenzopazin.MS_Aluno.dto;

import br.com.lorenzopazin.MS_Aluno.model.Aluno;
import br.com.lorenzopazin.MS_Aluno.model.Status;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlunoDTO {

    private Long id;
    @Size(min = 3, max = 120, message = "Máximo de 120 caracteres")
    private String nome;
    @Size(max = 50, message = "Máximo de 50 caracteres")
    private String email;
    @Size(min = 8, max = 100, message = "Mínimo de 8 caracteres e máximo de 100.")
    private String password;
    @Size(min = 5, max = 6, message = "Mínimo de 5 caracteres e máximo de 6")
    @Positive(message = "O número do RM deve ser positivo")
    private String rm;
    @Enumerated(value = EnumType.STRING)
    private Status status;
    private String turma;

    public AlunoDTO(Aluno entity) {
        id = entity.getId();
        nome = entity.getNome();
        email = entity.getEmail();
        password= entity.getPassword();
        rm = entity.getRm();
        status = entity.getStatus();
        turma = entity.getTurma();
    }
}
