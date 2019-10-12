package uz.owl.lms.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TimeTableForSubGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private final Time time;

    @ManyToOne
    @JoinColumn(nullable = false)
    private SubGroup subGroup;

}
