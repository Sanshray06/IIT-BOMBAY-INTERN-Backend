package org.coding.em_project;

public class Courses {
    private String title;
    private String courseCode;
    private String description;
    private int yearOfDelivery;
    private int semesterOfDelivery;
    private int courseId;

    public Courses(String title, String courseCode, String description, int yearOfDelivery, int semesterOfDelivery, int courseId) {
        this.title = title;
        this.courseCode = courseCode;
        this.description = description;
        this.yearOfDelivery = yearOfDelivery;
        this.semesterOfDelivery = semesterOfDelivery;
        this.courseId = courseId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYearOfDelivery() {
        return yearOfDelivery;
    }

    public void setYearOfDelivery(int yearOfDelivery) {
        this.yearOfDelivery = yearOfDelivery;
    }

    public int getSemesterOfDelivery() {
        return semesterOfDelivery;
    }

    public void setSemesterOfDelivery(int semesterOfDelivery) {
        this.semesterOfDelivery = semesterOfDelivery;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Title: " + title);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Description: " + description);
        System.out.println("Year of Delivery: " + yearOfDelivery);
        System.out.println("Semester of Delivery: " + semesterOfDelivery);
        System.out.println("Course ID: " + courseId);
    }
}
