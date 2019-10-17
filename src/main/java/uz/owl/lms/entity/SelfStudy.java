package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * O'qituvchi {@link SubGroup}ga qo'ygan vazifasi
 * Bu barcha subguruh studentlariga ko'rinadi
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelfStudy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String path;
    private String fileName;

    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private LocalDateTime deadline;

    @OneToMany
    private final List<StudentTask> studentTasks = new ArrayList<>();

    @JoinColumn(nullable = false)
    @ManyToOne
    private SubGroup subGroup;

}
