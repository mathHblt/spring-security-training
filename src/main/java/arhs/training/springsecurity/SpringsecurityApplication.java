package arhs.training.springsecurity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import arhs.training.springsecurity.domain.User;
import arhs.training.springsecurity.repository.UserRepository;

@SpringBootApplication
public class SpringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return (args) -> {
            User adminUser = new User();
            adminUser.setEmail("admin@mail.com");
            adminUser.setFirstName("John the Admin");
            adminUser.setLastName("Doe");
            adminUser.setPassword(passwordEncoder.encode("password"));
            adminUser.setRole("ROLE_ADMIN");
            userRepository.save(adminUser);
        };
    }
}
