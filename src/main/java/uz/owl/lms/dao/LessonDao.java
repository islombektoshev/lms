package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Lesson;

@Repository
public interface LessonDao extends CrudRepository<Lesson, Long> {
}