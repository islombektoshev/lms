package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String dateString;

    @OneToOne
    private MandatorySubjectsList mandatorySubjectsList;

    @OneToOne
    private OptionalSubjectsList optionalSubjectsList   ;
}
