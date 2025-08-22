package springboot.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springboot.app.model.Usuario;

@Component
public class SistemaUsuario implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		Usuario ariel = criarUsuarioAriel();
		Usuario admin = criarUsuarioAdmin();

		Iterable<Usuario> usuarios = null;
		usuarios.forEach(u -> System.out.println(u.getNomeCompleto() + " - " + u.getLogin()));

	}

	private Usuario criarUsuarioAriel() {
		Usuario usuario = new Usuario();
		usuario.setEmail("ariel@com.br");
		usuario.setLogin("ariel");
		usuario.setNomeCompleto("ARIEL FRANÇA");
		usuario.setSenha("teste123");
		return usuario;
	}

	private Usuario criarUsuarioAdmin() {
		Usuario usuario = new Usuario();
		usuario.setEmail("admin@com.br");
		usuario.setLogin("admin");
		usuario.setNomeCompleto("ADMINISTRADOR");
		usuario.setSenha("admin123");
		return usuario;
	}

}
