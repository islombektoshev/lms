package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
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

    @OneToMany
    private final List<SelfStudy> selfStudies = new ArrayList<>();

    @OneToMany
    private final List<TimeTableForSubGroup> timeTableForSubGroups = new ArrayList<>();

    public static enum GroupType {
        LECTURE,
        PRACTICE,
        LABORATORY;
        private GroupType() {
        }
    }
}
