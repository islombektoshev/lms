package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Xonada Bo'lishi dars mumkin bo'lmagan  timlarni saqlaydi
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomRejectedDayList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Room room;

    private Time time;
}
