package uz.owl.lms.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Teacher extends User {
    private Long activeTeacherProfile;

    @Column(nullable = false)
    private Boolean canWork;

    @OneToMany(mappedBy = "parent")
    private final List<TeacherProfile> teacherProfiles = new ArrayList<>();

    @ManyToMany(mappedBy = "specialists")
    private final List<Subject> specializations = new ArrayList<>();
}
