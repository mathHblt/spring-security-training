package arhs.training.springsecurity.repository;


import org.springframework.data.repository.CrudRepository;

import arhs.training.springsecurity.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {


}
