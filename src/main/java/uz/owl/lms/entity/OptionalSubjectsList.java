package uz.owl.lms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class OptionalSubjectsList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "optionalSubjectsLists")
    private final List<Subject> subjects = new ArrayList<>();

    @OneToOne
    private Faculty faculty;

    @OneToOne
    private Semester semester;
}
