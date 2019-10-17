package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "room")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = false, nullable = false)
    private String roomId;

    @Column(nullable = false)
    private Integer size;

    /**
     * Bu listda shu xonaga dars bo'lishi mumkinmas kunlarni ko'rsatilgan
     */
    @OneToMany(mappedBy = "room")
    private final List<RoomRejectedDayList> roomRejectedDays = new ArrayList<>();

    /**
     * Bu xonada qaysi fanlar bo'lishini bildiradi
     * bu orqali shu xonadan dars bo'ladigan kularni olish mumkin
     */
    @OneToMany(mappedBy = "onRoom")
    private final List<Lesson> lessons = new ArrayList<>();
}
