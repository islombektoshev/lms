package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Course bu bir o'xshash fanlarni birlashtirib turadigan entity
 * bunga misol qilib Dasturlash kursini misol qilish mumkin
 * Dasturlash: Java C++ Python kabi Subjectlar bo'ladi
 * agar subjects bittadan ko'p bo'lsa uni o'quvchi tanlay oladi agar bitta bo'lsa automatic
 * ravishda tanlanadi,<strong>subjects empty bo'lmasiligi shart</strong>
 */
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
    private final List<Faculty> faculties = new ArrayList<>();

    @ManyToMany(mappedBy = "courses")
    private final List<Semester> semesters = new ArrayList<>();
}
