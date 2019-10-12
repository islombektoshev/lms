package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class StudentTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer rate;

    @JoinColumn(nullable = false)
    @ManyToOne
    private StudentProfile studentProfile;

    @JoinColumn(nullable = false)
    @ManyToOne
    private SelfStudy selfStudy;


}
