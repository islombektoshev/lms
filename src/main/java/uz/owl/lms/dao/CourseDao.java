package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Course;

@Repository
public interface CourseDao extends CrudRepository<Course, Long> {
}
