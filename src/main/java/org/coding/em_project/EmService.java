package org.coding.em_project;

import java.util.List;

public interface EmService {
    
    // Method to create a new course
    Courses createCourse(Courses course);

    // Method to retrieve all courses
    List<Courses> getAllCourses();

    // Method to retrieve a course by its ID
    Courses getCourseById(int id);

    // Method to delete a course by its ID
    boolean deleteCourseById(int id);

    // Method to create a new instance of a course delivery
    Courses createCourseInstance(Courses instance);

    // Method to retrieve courses by year and semester
    List<Courses> getCoursesByYearAndSemester(int year, int semester);

    // Method to retrieve a specific course instance by year, semester, and course ID
    Courses getCourseInstance(int year, int semester, int id);

    // Method to delete a specific course instance by year, semester, and course ID
    boolean deleteCourseInstance(int year, int semester, int id);
}
