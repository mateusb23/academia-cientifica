package br.com.mateusbispo.academiacientifica.dtos;

import br.com.mateusbispo.academiacientifica.models.Curso;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.RepresentationModel;
import com.github.dozermapper.core.Mapping;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class AlunoDto extends RepresentationModel<AlunoDto> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @JsonProperty("id")
    @Mapping("id")
    private UUID key;
    private String nome;
    private String cpf;
    private List<Curso> cursos;

    public AlunoDto() {
    }

    public UUID getKey() {
        return key;
    }

    public void setKey(UUID key) {
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AlunoDto alunoDto = (AlunoDto) o;
        return Objects.equals(key, alunoDto.key) && Objects.equals(nome, alunoDto.nome) && Objects.equals(cpf, alunoDto.cpf) && Objects.equals(cursos, alunoDto.cursos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), key, nome, cpf, cursos);
    }
}
