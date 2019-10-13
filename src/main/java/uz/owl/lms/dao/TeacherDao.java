package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Teacher;

@Repository
public interface TeacherDao extends CrudRepository<Teacher, Long> {
}