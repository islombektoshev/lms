package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Lesson Bir {@link SubGroup} subguruhni Bir haftada bo'ladigan darslarini
 * ro'yxat qilish uchun kerak bunda Time va Room bor
 */
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Time time;

    private Integer currentTopicId;

    @ManyToOne
    private SubGroup parent;

    @ManyToOne
    private Room onRoom;
}
