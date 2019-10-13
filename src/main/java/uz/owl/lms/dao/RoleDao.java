package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, Long> {
}
