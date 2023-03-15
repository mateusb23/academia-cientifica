package br.com.mateusbispo.academiacientifica.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "curso")
public class Curso implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    @OneToMany(mappedBy = "curso")
    private List<Modulo> modulos;
    @ManyToMany
    @JoinTable(name = "matricula",
        joinColumns = {@JoinColumn(name = "curso_id")},
        inverseJoinColumns = {@JoinColumn(name = "aluno_id")})
    private List<Aluno> alunos;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
