package com.example.syt.Class;

public class CourseClass {
    private String courseName,imageUrl;

    public CourseClass(String courseName, String imageUrl) {
        this.courseName = courseName;
        this.imageUrl = imageUrl;
    }

    public CourseClass() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
