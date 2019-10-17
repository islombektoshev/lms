package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Mavzula
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * mavzu nomi
     */
    private String theme;
    /**
     * qisqacha tushuncha
     */
    private String abstractOfTheme;

    @ManyToOne
    @JoinColumn(nullable = false, name = "subgroup_id")
    private SubGroup subGroup;
}
