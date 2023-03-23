package ar.com.leo.cursos.repository;

import ar.com.leo.cursos.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "alumnos", path = "alumnos")
@CrossOrigin("http://localhost:4200")
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
