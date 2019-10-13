package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.SelfStudy;

@Repository
public interface SelfStudyDao extends CrudRepository<SelfStudy, Long> {
}