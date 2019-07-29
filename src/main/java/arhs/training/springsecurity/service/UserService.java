package arhs.training.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import arhs.training.springsecurity.domain.User;
import arhs.training.springsecurity.domain.dto.request.SignUpFormRequestDTO;
import arhs.training.springsecurity.repository.UserRepository;


@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void saveUser(SignUpFormRequestDTO signUpFormRequestDTO) {

        User user = new User();
        user.setEmail(signUpFormRequestDTO.getEmail());
        user.setLastName(signUpFormRequestDTO.getLastName());
        user.setFirstName(signUpFormRequestDTO.getFirstName());
        user.setPassword(signUpFormRequestDTO.getPassword());
        userRepository.save(user);
    }
}
