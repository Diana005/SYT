package com.example.syt.Class;

public class CourseClass {
    private String courseName,lessonsText,imageUrl;

    public CourseClass(String courseName, String lessonsText, String imageUrl) {
        this.courseName = courseName;
        this.lessonsText = lessonsText;
        this.imageUrl = imageUrl;
    }

    public CourseClass() {
    }

    public String getLessonsText() {
        return lessonsText;
    }

    public void setLessonsText(String lessonsText) {
        this.lessonsText = lessonsText;
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
