package uz.owl.lms.service;

import org.springframework.stereotype.Service;
import uz.owl.lms.dao.*;
import uz.owl.lms.entity.Faculty;
import uz.owl.lms.entity.Student;
import uz.owl.lms.entity.Subject;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class InitTestService {
    private final FacultyDao facultyDao;
    private final GroupDao groupDao;
    private final LessonDao lessonDao;
    private final RoleDao roleDao;
    private final RoomDao roomDao;
    private final SelfStudyDao selfStudyDao;
    private final SemesterDao semesterDao;
    private final SubjectDao subjectDao;
    private final StudentProfileDao studentProfileDao;
    private final StudentTaskDao studentTaskDao;
    private final SubGroupDao subGroupDao;
    private final TeacherDao teacherDao;
    private final TopicDao topicDao;
    private final UserDao userDao;
    private final TeacherProfileDao teacherProfileDao;


    public InitTestService(FacultyDao facultyDao, GroupDao groupDao, LessonDao lessonDao, RoleDao roleDao, RoomDao roomDao, SelfStudyDao selfStudyDao, SemesterDao semesterDao, SubjectDao subjectDao, StudentProfileDao studentProfileDao, StudentTaskDao studentTaskDao, SubGroupDao subGroupDao, TeacherDao teacherDao, TopicDao topicDao, UserDao userDao, TeacherProfileDao teacherProfileDao) {
        this.facultyDao = facultyDao;
        this.groupDao = groupDao;
        this.lessonDao = lessonDao;
        this.roleDao = roleDao;
        this.roomDao = roomDao;
        this.selfStudyDao = selfStudyDao;
        this.semesterDao = semesterDao;
        this.subjectDao = subjectDao;
        this.studentProfileDao = studentProfileDao;
        this.studentTaskDao = studentTaskDao;
        this.subGroupDao = subGroupDao;
        this.teacherDao = teacherDao;
        this.topicDao = topicDao;
        this.userDao = userDao;
        this.teacherProfileDao = teacherProfileDao;
    }

    @Transactional
    public void init() {
        System.out.println("\n=====================================================================\n");
        test1();
    }

    private void test1() {
        /**
         * Saving some subjects
         */
        List<Subject> subjects = Arrays.asList(
                Subject.builder().subjectName("Matematika-1").build(),
                Subject.builder().subjectName("Fizika-1").build(),
                Subject.builder().subjectName("Dasturlash-1").build(),

                Subject.builder().subjectName("Matematika-2").build(),
                Subject.builder().subjectName("Fizika-2").build(),
                Subject.builder().subjectName("Dasturlash-2").build(),

                Subject.builder().subjectName("Dinshunoslik").build(),
                Subject.builder().subjectName("Tarix").build(),
                Subject.builder().subjectName("Falsafa").build(),

                Subject.builder().subjectName("Ingiliz tili").build(),
                Subject.builder().subjectName("Fransuz tili").build(),
                Subject.builder().subjectName("Nemis tili").build()
        );
        subjectDao.saveAll(subjects);

        List<Subject> mandatorySubjects_1 = new ArrayList<>();
        mandatorySubjects_1.add(subjectDao.findBySubjectName("Matematika-1"));
        mandatorySubjects_1.add(subjectDao.findBySubjectName("Fizika-1"));
        mandatorySubjects_1.add(subjectDao.findBySubjectName("Dasturlash-1"));

        List<Subject> mandatorySubjects_2 = new ArrayList<>();
        mandatorySubjects_2.add(subjectDao.findBySubjectName("Matematika-2"));
        mandatorySubjects_2.add(subjectDao.findBySubjectName("Fizika-2"));
        mandatorySubjects_2.add(subjectDao.findBySubjectName("Dasturlash-2"));

        List<Subject> optionalSubjects_1 = new ArrayList<>();
        optionalSubjects_1.add(subjectDao.findBySubjectName("Dinshunoslik"));
        optionalSubjects_1.add(subjectDao.findBySubjectName("Tarix"));
        optionalSubjects_1.add(subjectDao.findBySubjectName("Falsafa"));

        optionalSubjects_1.add(subjectDao.findBySubjectName("Ingiliz tili"));
        optionalSubjects_1.add(subjectDao.findBySubjectName("Fransuz tili"));
        optionalSubjects_1.add(subjectDao.findBySubjectName("Nemis tili"));

        List<Subject> optionalSubjects_2 = new ArrayList<>();
        optionalSubjects_2.add(subjectDao.findBySubjectName("Ingiliz tili"));
        optionalSubjects_2.add(subjectDao.findBySubjectName("Fransuz tili"));
        optionalSubjects_2.add(subjectDao.findBySubjectName("Nemis tili"));

    }

}
