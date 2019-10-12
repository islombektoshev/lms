package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "group_lms")
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Subject subject;

    @ManyToMany
    private final List<StudentProfile> students = new ArrayList<>();


    @OneToMany(mappedBy = "parentGroup")
    private final List<SubGroup> subGroups = new ArrayList<>();

}