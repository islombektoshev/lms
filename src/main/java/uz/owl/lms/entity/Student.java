package uz.owl.lms.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student extends User {
    @ManyToOne
    private Faculty faculty;

    @OneToMany(mappedBy = "profileOwner")
    private final List<StudentProfile> studentProfiles = new ArrayList<>();

    private Long activeProfileId;
}
