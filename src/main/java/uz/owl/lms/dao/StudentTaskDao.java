package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.StudentTask;

@Repository
public interface StudentTaskDao extends CrudRepository<StudentTask, Long> {
}