package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OptionalSubjectsList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "optionalSubjectsLists")
    private final List<Subject> subjects = new ArrayList<>();

    @OneToOne(mappedBy = "optionalSubjectsList")
    private Faculty faculty;

    @OneToOne(mappedBy = "optionalSubjectsList")
    private Semester semester;
}
