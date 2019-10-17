package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * {@link Faculty} bu {@link Student}ning bir xususiayti bo'lib u fanlarni tanlash ucun kerak bo'ladi
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "faculty")
    private final List<Student> students = new ArrayList<>();

    @ManyToMany
    private final List<Course> courses = new ArrayList<>();
}
