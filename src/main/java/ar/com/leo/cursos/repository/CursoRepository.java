package ar.com.leo.cursos.repository;

import ar.com.leo.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "cursos", path = "cursos")
@CrossOrigin("http://localhost:4200")
public interface CursoRepository extends JpaRepository<Curso, Long> {

}
