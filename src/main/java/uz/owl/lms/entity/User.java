package uz.owl.lms.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "user_lms")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    @ColumnDefault("true")
    private Boolean enabled;

    @CreationTimestamp
    private LocalDateTime createdDateTime;

    @ManyToMany
    private final List<Role> roles = new ArrayList<>();
}
