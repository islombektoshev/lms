package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.Room;

@Repository
public interface RoomDao extends CrudRepository<Room, Long> {
}