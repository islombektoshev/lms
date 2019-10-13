package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class MandatorySubjectsList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "mandatorySubjectsLists")
    private final List<Subject> subjects = new ArrayList<>();

    @OneToOne
    private Faculty faculty;

    @OneToOne
    private Semester semester;
}
