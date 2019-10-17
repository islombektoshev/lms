package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Student extends User {
    public Student(String name, String lastName, String username,
                   String password, Boolean enabled,
                   Faculty faculty, Long activeProfileId) {
        super(name, lastName, username, password, enabled);
        this.faculty = faculty;
        this.activeProfileId = activeProfileId;
    }

    @ManyToOne
    private Faculty faculty;

    /**
     * Student uchun profile bu studentda barcha semster hatto qaytib oqigan sesmterlariniham
     * ko'rish imkonini beradi
     */
    @OneToMany(mappedBy = "profileOwner")
    private final List<StudentProfile> studentProfiles = new ArrayList<>();

    /**
     * ayni paytda qaysi profile student uchun active ligni bildiradi
     */
    private Long activeProfileId;
}
