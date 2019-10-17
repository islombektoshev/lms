package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Bu har bir guruhni turlarga bo'lish uchun ishlatiladi {@this#GroupType} ga qarang
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private GroupType groupType;

    @Column(nullable = false)
    private Integer lessonCount;

    /**
     * agar active bo'lsa teacher SelfStudy yuklashi mumkin bo'ladi
     */
    @Column(nullable = false)
    @ColumnDefault("true")
    public Boolean active;

    @ManyToOne
    private Group parentGroup;

    @ManyToOne
    private TeacherProfile teacherProfile;

    @OneToMany
    private final List<SelfStudy> selfStudies = new ArrayList<>();

    /**
     * Shu guruhga bo'ladigan paralik mavzular ro'yhati
     */
    @OneToMany(mappedBy = "subGroup")
    private final List<Topic> topics = new ArrayList<>();

    /**
     * Lessonlar haftasiga suguruhga bo'ladigan darslarni saqlaydi
     * masalan Fizika001 dushanba 2-para va seshanba 3-para bo'lishi mumkin
     */
    @OneToMany(mappedBy = "parent")
    private final List<Lesson> lessons = new ArrayList<>();

    public enum GroupType {
        LECTURE,
        PRACTICE,
        LABORATORY;

        private GroupType() {
        }
    }
}
