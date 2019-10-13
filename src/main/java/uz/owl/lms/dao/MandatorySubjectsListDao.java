package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.MandatorySubjectsList;

@Repository
public interface MandatorySubjectsListDao extends CrudRepository<MandatorySubjectsList, Long> {
}
