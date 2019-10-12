package uz.owl.lms.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "faculty")
    private final List<Student> students = new ArrayList<>();
}
