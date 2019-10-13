package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String theme;
    private String abstractOfTheme;

    @ManyToOne
    @JoinColumn(nullable = false,name = "subgroup_id")
    private SubGroup subGroup;
}
