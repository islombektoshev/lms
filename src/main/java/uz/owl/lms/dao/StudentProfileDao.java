package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.StudentProfile;

@Repository
public interface StudentProfileDao extends CrudRepository<StudentProfile, Long> {
}