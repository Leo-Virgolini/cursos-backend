package ar.com.leo.cursos.conf;

import ar.com.leo.cursos.model.Alumno;
import ar.com.leo.cursos.model.Curso;
import ar.com.leo.cursos.model.Profesor;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Component
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
//        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
//        config.useHalAsDefaultJsonMediaType(false);

        config.exposeIdsFor(Alumno.class, Profesor.class, Curso.class);
    }

}