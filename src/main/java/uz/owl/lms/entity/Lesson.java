package uz.owl.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Time time;

    private Integer currentTopicId;

    @ManyToOne
    private SubGroup parent;

    @OneToMany
    private final List<Topic> topics = new ArrayList<>();

    @ManyToOne
    private Room onRoom;
}
