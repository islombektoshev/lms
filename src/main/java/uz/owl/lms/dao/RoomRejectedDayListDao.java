package uz.owl.lms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.owl.lms.entity.RoomRejectedDayList;

@Repository
public interface RoomRejectedDayListDao extends CrudRepository<RoomRejectedDayList, Long> {
}