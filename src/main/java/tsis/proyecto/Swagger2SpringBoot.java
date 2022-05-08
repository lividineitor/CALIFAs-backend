package tsis.proyecto;

import tsis.proyecto.configuration.LocalDateConverter;
import tsis.proyecto.configuration.LocalDateTimeConverter;
import tsis.proyecto.datos.UsuarioRepository;
import tsis.proyecto.negocio.modelo.Usuario;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.oas.annotations.EnableOpenApi;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import tsis.proyecto.datos.UsuarioRepository;
import tsis.proyecto.negocio.modelo.Usuario;

@SpringBootApplication
@EnableOpenApi
@ComponentScan(basePackages = { "tsis.proyecto", "tsis.proyecto.api" , "tsis.proyecto.configuration"})
public class Swagger2SpringBoot implements CommandLineRunner {

    @Override
    public void run(String... arg0) throws Exception {
        if (arg0.length > 0 && arg0[0].equals("exitcode")) {
            throw new ExitException();
        }
    }

	@Autowired
	UsuarioRepository usuarioRepository ;
    
    public static void main(String[] args) throws Exception {
        new SpringApplication(Swagger2SpringBoot.class).run(args);
    }
    
    @PostConstruct
    public void inicia () {
        Usuario prueba1 = new Usuario () ;
		
		prueba1.setNombre("Liv");
		prueba1.setEmail("liv@liv.liv");
		prueba1.setRol("Admin");
		prueba1.setPassword("liv");
		
		this.usuarioRepository.save(prueba1) ;
		
		Usuario prueba2 = new Usuario () ;
		
		prueba2.setNombre("Ale");
		prueba2.setEmail("ale@ale.ale");
		prueba2.setRol("Admin");
		prueba2.setPassword("ale");
		
		this.usuarioRepository.save(prueba2) ;
		
    }

    @Configuration
    static class CustomDateConfig extends WebMvcConfigurerAdapter {
        @Override
        public void addFormatters(FormatterRegistry registry) {
            registry.addConverter(new LocalDateConverter("yyyy-MM-dd"));
            registry.addConverter(new LocalDateTimeConverter("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        }
    }

    class ExitException extends RuntimeException implements ExitCodeGenerator {
        private static final long serialVersionUID = 1L;

        @Override
        public int getExitCode() {
            return 10;
        }

    }
}
