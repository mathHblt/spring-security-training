package arhs.training.springsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import arhs.training.springsecurity.domain.User;
import arhs.training.springsecurity.repository.UserRepository;

@SpringBootApplication
public class SpringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
            User adminUser = new User();
            adminUser.setEmail("admin@mail.com");
            adminUser.setFirstName("John the Admin");
            adminUser.setLastName("Doe");
            adminUser.setPassword("password");
            adminUser.setRole("ADMIN");
            userRepository.save(adminUser);
        };
    }
}
