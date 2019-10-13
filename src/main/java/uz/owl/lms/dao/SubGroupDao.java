package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.SubGroup;

@Repository
public interface SubGroupDao extends CrudRepository<SubGroup, Long> {
}