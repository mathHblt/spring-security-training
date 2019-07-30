package arhs.training.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringsecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }

    /*@Bean
    public CommandLineRunner demo(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return (args) -> {
            User adminUser = new User();
            adminUser.setEmail("admin@mail.com");
            adminUser.setFirstName("John the Admin");
            adminUser.setLastName("Doe");
            adminUser.setPassword(passwordEncoder.encode("password"));
            adminUser.setRole("ROLE_ADMIN");
            adminUser.setPermission("READ_WRITE");
            userRepository.save(adminUser);
        };
    }*/
}
