package springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springboot.app.model.Usuario;

@Component
public class SistemaUsuario implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setEmail("ariel@teste.com");
		usuario.setLogin("ariel");
		usuario.setNomeCompleto("ARIEL FRANÇA");
		usuario.setSenha("teste123");
		//repositório de persistência ??
	}
}
