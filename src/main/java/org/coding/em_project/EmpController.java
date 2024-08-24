package org.coding.em_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:5173")
public class EmpController {

    private final EmService courseService;

    @Autowired
    public EmpController(EmService courseService) {
        this.courseService = courseService;
    }

    // Get all courses
    @GetMapping
    public List<Courses> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Create a new course
    @PostMapping
    public Courses createCourse(@RequestBody Courses course) {
        return courseService.createCourse(course);
    }

    // Get a specific course by ID
    @GetMapping("/{id}")
    public Courses getCourseById(@PathVariable int id) {
        return courseService.getCourseById(id);
    }

    // Delete a course by ID
    @DeleteMapping("/{id}")
    public void deleteCourseById(@PathVariable int id) {
        courseService.deleteCourseById(id);
    }

    // Create a new course instance
    @PostMapping("/instances")
    public Courses createCourseInstance(@RequestBody Courses instance) {
        return courseService.createCourseInstance(instance);
    }

    // Get courses by year and semester
    @GetMapping("/instances/{year}/{semester}")
    public List<Courses> getCoursesByYearAndSemester(@PathVariable int year, @PathVariable int semester) {
        return courseService.getCoursesByYearAndSemester(year, semester);
    }

    // Get a specific course instance by year, semester, and ID
    @GetMapping("/instances/{year}/{semester}/{id}")
    public Courses getCourseInstance(@PathVariable int year, @PathVariable int semester, @PathVariable int id) {
        return courseService.getCourseInstance(year, semester, id);
    }

    // Delete a course instance by year, semester, and ID
    @DeleteMapping("/instances/{year}/{semester}/{id}")
    public void deleteCourseInstance(@PathVariable int year, @PathVariable int semester, @PathVariable int id) {
        courseService.deleteCourseInstance(year, semester, id);
    }
}
