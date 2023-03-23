package ar.com.leo.cursos.model;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "alumnos")
@PrimaryKeyJoinColumn(name = "id")
public class Alumno extends Usuario implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 2, max = 32)
    @Pattern(regexp = "^[a-zA-Zá-úñÑ ]+$")
    private String nombre;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 2, max = 32)
    @Pattern(regexp = "^[a-zA-Zá-úñÑ ']+$")
    private String apellido;

    @Column(name = "fecha_nacimiento", nullable = false)
    @NotNull
    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaNacimiento;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 7, max = 9)
    @Pattern(regexp = "^[0-9]+$")
    private String dni;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 3, max = 32)
    @Pattern(regexp = "^[a-zA-Zá-úñÑ ']+$")
    private String provincia;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 3, max = 32)
    @Pattern(regexp = "^[a-zA-Zá-úñÑ ']+$")
    private String localidad;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 3, max = 32)
    @Pattern(regexp = "^[a-zA-Zá-úñÑ ']+$")
    private String calle;

    @ManyToMany(mappedBy = "alumnos")
    @Valid
    private List<Curso> cursos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
