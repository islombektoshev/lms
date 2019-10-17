package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * O'qituvhi berga {@link SelfStudy}ga qoyilgan javob
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
