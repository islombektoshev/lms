package uz.owl.lms.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TeacherProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Teacher parent;

    @CreationTimestamp
    public LocalDateTime createdDateTime;


}
