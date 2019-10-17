package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeacherProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Teacher parent;

    @CreationTimestamp
    public LocalDateTime createdDateTime;

    /**
     * Bu shu profileda qanchalik dars olishini kuchi borligii berlgilash uchun ishlatiladi
     */
    @Column(nullable = false)
    @ColumnDefault("999999")
    public Integer laboratoryCount;

    @Column(nullable = false)
    @ColumnDefault("999999")
    public Integer lectureCount;

    @Column(nullable = false)
    @ColumnDefault("999999")
    public Integer practiceCount;

    @OneToMany(mappedBy = "teacherProfile")
    private final List<SubGroup> teacherGroups = new ArrayList<>();
}
