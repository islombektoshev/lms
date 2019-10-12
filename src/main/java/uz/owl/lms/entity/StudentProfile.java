package uz.owl.lms.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private LocalDateTime profileCreateDate;

    @ManyToMany
    private final List<Subject> studentSubjects = new ArrayList<>();

    @ManyToMany(mappedBy = "students")
    private final List<Group> studentGroups = new ArrayList<>();

    @ManyToOne
    private Student profileOwner;

    @OneToMany(mappedBy = "studentProfile")
    private final List<StudentTask> studentTasks = new ArrayList<>();

}
