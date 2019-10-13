package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String subjectName;

    @OneToMany(mappedBy = "subject")
    private final List<Group> groups = new ArrayList<>();

    /**
     * this gives specialist teacher
     */
    @ManyToMany
        private final List<Teacher> specialists = new ArrayList<>();

    @ManyToMany
    private final List<StudentProfile> studentProfiles = new ArrayList<>();

    @ManyToMany
    private final List<MandatorySubjectsList> mandatorySubjectsLists = new ArrayList<>();

    @ManyToMany
    private final List<OptionalSubjectsList> optionalSubjectsLists = new ArrayList<>();
}
