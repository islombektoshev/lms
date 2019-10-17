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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "course")
    private final List<Subject> subjects = new ArrayList<>();

    @ManyToMany(mappedBy = "courses")
    private final List<Faculty>  faculties = new ArrayList<>();

    @ManyToMany(mappedBy = "courses")
    private final List<Semester>  semesters = new ArrayList<>();
}
