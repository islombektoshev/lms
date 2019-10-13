package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Student;

@Repository
public interface StudentDao extends CrudRepository<Student, Long> {
}