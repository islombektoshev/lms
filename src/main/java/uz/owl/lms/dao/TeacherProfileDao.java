package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.TeacherProfile;

@Repository
public interface TeacherProfileDao extends CrudRepository<TeacherProfile, Long> {
}