package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Group Bu fanlarning guruhlarga bo'lishdan kelib chiqqan narsa
 * misol uchun Fizika fanidan guruhlar
 */
@Entity
@Table(name = "group_lms")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Subject subject;

    @ManyToMany
    private final List<StudentProfile> students = new ArrayList<>();

    @Column(nullable = false)
    public Integer lectureCount;

    @Column(nullable = false)
    public Integer practiceCount;

    @Column(nullable = false)
    public Integer laboratoryCount;

    /**
     * Bu sub guruhlarni saqlaydi Sub guruhlar Lecture Labaratory va pratice bo'lishi mumlin
     * bir huruhda bir lecture va bittadan ko'p laboratory va practice
     * bo'lishi kerak
     * example
     * Fizika001:
     * Fizika001 lecture
     *
     * Fizika001-1 practice
     * Fizika001-2 practice
     *
     * Fizika001-L1 laboratory
     * Fizika001-L2 laboratory
     * Fizika001-L3 laboratory
     * Fizika001-L4 laboratory
     */
    @OneToMany(mappedBy = "parentGroup")
    private final List<SubGroup> subGroups = new ArrayList<>();

}
