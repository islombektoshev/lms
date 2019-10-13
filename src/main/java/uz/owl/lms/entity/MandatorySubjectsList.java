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
public class MandatorySubjectsList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "mandatorySubjectsLists")
    private final List<Subject> subjects = new ArrayList<>();

    @OneToOne(mappedBy = "mandatorySubjectsList")
    private Faculty faculty;

    @OneToOne(mappedBy = "mandatorySubjectsList")
    private Semester semester;
}
