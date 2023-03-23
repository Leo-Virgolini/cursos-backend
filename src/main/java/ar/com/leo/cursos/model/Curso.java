package ar.com.leo.cursos.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.util.List;

@Entity
@Table(name = "cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 2, max = 32)
    @Pattern(regexp = "^[a-zA-Zá-úñÑ ]+$")
    private String materia;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_profesor", nullable = false)
    private Profesor profesor;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "inscripciones",
            joinColumns = {@JoinColumn(name = "id_curso")},
            inverseJoinColumns = {@JoinColumn(name = "id_alumno")}
    )
    @Valid
    private List<Alumno> alumnos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
