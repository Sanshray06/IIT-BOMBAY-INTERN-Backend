package org.coding.em_project;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements EmService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Courses createCourse(Courses course) {
        CourseEntity courseEntity = new CourseEntity();
        BeanUtils.copyProperties(course, courseEntity);
        courseRepository.save(courseEntity);
        return course;
    }

    @Override
    public List<Courses> getAllCourses() {
        List<CourseEntity> coursesList = courseRepository.findAll();
        List<Courses> courses = new ArrayList<>();
        for (CourseEntity courseEntity : coursesList) {
            Courses cr = new Courses(null, null, null, 0, 0, 0);
            BeanUtils.copyProperties(courseEntity, cr);
            courses.add(cr);
        }
        return courses;
    }

    @Override
    public Courses getCourseById(int id) {
        CourseEntity courseEntity = courseRepository.findById(id).orElse(null);
        if (courseEntity == null) {
            return null;
        }
        Courses course = new Courses(null, null, null, 0, 0, 0);
        BeanUtils.copyProperties(courseEntity, course);
        return course;
    }

    @Override
    public boolean deleteCourseById(int id) {
        if (courseRepository.existsById(id)) {
            courseRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Courses createCourseInstance(Courses instance) {
        CourseEntity courseEntity = new CourseEntity();
        BeanUtils.copyProperties(instance, courseEntity);
        courseRepository.save(courseEntity);
        return instance;
    }

    @Override
    public List<Courses> getCoursesByYearAndSemester(int year, int semester) {
        List<CourseEntity> courseEntities = courseRepository.findByYearOfDeliveryAndSemesterOfDelivery(year, semester);
        List<Courses> courses = new ArrayList<>();
        for (CourseEntity courseEntity : courseEntities) {
            Courses cr = new Courses(null, null, null, 0, 0, 0);
            BeanUtils.copyProperties(courseEntity, cr);
            courses.add(cr);
        }
        return courses;
    }

    @Override
    public Courses getCourseInstance(int year, int semester, int id) {
        List<CourseEntity> courseEntities = courseRepository.findByYearOfDeliveryAndSemesterOfDelivery(year, semester);
        for (CourseEntity courseEntity : courseEntities) {
            if (courseEntity.getCourseId() == id) {
                Courses course = new Courses(null, null, null, 0, 0, 0);
                BeanUtils.copyProperties(courseEntity, course);
                return course;
            }
        }
        return null;
    }

    @Override
    public boolean deleteCourseInstance(int year, int semester, int id) {
        List<CourseEntity> courseEntities = courseRepository.findByYearOfDeliveryAndSemesterOfDelivery(year, semester);
        for (CourseEntity courseEntity : courseEntities) {
            if (courseEntity.getCourseId() == id) {
                courseRepository.delete(courseEntity);
                return true;
            }
        }
        return false;
    }
}
