package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Student profile li student ning har semester o'zgaradigan
 * ma'lumotlari shu yerda saqlanadi
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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

    @ManyToOne
    private Semester semester;

    // TODO: 10/17/2019 yana bir tekxhirish kerak
    @OneToMany(mappedBy = "studentProfile")
    private final List<StudentTask> studentTasks = new ArrayList<>();

}
