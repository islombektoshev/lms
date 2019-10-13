package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Group;

@Repository
public interface GroupDao extends CrudRepository<Group, Long> {
}