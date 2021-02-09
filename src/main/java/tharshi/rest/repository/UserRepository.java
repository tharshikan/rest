package tharshi.rest.repository;

import org.springframework.data.repository.CrudRepository;
import tharshi.rest.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> { }
