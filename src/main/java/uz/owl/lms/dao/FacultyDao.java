package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Faculty;

@Repository
public interface FacultyDao extends CrudRepository<Faculty, Long> {
}
