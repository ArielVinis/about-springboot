package aula;

import aula.model.User;
import aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        insertUser();

        List<User> users = repository.findByNameContaining("ARIEL");
        for (User u : users) {
            System.out.println(u);
        }
    }

    private void insertUser() {
        User user = new User();
        user.setName("ARIEL FRANÇA");
        user.setUsername("ariel");
        user.setPassword("teste123");
        repository.save(user);

        for (User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
