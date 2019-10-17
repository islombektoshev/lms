package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Studentnig xususiyatlaridan biri bo'lib fan tanlash uchun ishlatiladi
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dateString;

    @ManyToMany
    private final List<Course> courses = new ArrayList<>();

    @OneToMany(mappedBy = "semester")
    private final List<StudentProfile> studentProfiles = new ArrayList<>();
}
