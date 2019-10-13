package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.OptionalSubjectsList;

@Repository
public interface OptionalSubjectsListDao extends CrudRepository<OptionalSubjectsList, Long> {
}
