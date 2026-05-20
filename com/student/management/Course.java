package com.student.management;

public class Course {
    private String course;

    public Course(String course){
        this.course=course;
    }

    public void CDisplay(){
        System.out.println("Course: "+course);
    }
}
