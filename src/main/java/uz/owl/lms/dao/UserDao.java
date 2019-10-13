package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
}