package ar.com.leo.cursos.repository;

import ar.com.leo.cursos.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "profesores", path = "profesores")
@CrossOrigin("http://localhost:4200")
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {

}
