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
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private GroupType groupType;

    @ManyToOne
    private Group parentGroup;

    @ManyToOne
    private Teacher teacher;

    @Column(nullable = false)
    private Integer lessonCount;

    @OneToMany
    private final List<SelfStudy> selfStudies = new ArrayList<>();

    @OneToMany
    private final List<Lesson> lessons = new ArrayList<>();

    public enum GroupType {
        LECTURE,
        PRACTICE,
        LABORATORY;

        private GroupType() {
        }
    }
}
