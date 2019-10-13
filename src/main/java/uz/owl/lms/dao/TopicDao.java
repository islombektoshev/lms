package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Topic;

@Repository
public interface TopicDao extends CrudRepository<Topic, Long> {
}
