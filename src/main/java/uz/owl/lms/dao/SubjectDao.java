package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Subject;

@Repository
public interface SubjectDao extends CrudRepository<Subject, Long> {
    Subject findBySubjectName(String name);
}
