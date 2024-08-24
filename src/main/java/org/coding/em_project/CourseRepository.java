package org.coding.em_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {

    // Find all courses delivered in a specific year and semester
    List<CourseEntity> findByYearOfDeliveryAndSemesterOfDelivery(int year, int semester);
    
    // Find a course by its title
    List<CourseEntity> findByTitle(String title);
    
    // Delete a course by its ID
    void deleteByCourseId(int id);
    
}
