package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Semester;

@Repository
public interface SemesterDao extends CrudRepository<Semester, Long> {
}