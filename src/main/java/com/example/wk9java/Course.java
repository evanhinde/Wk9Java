package com.example.wk9java;

public class Course {
    private int crn;
    private String courseCode ,courseName;

    public Course(int crn, String courseCode, String courseName) {
        setCrn(crn);
        setCourseCode(courseCode);
        setCourseName(courseName);
    }

    public void setCrn(int crn) {
        if (crn >= 10000 && crn <= 99999)
            this.crn = crn;
        else
            throw new IllegalArgumentException("CRN must be in range of 10000-99999");
    }

    public void setCourseCode(String courseCode) {
        String courseCodePattern = "[A-Z]{4}\\s[0-9]{4}";
        courseCode = courseCode.toUpperCase();
        if (courseCode.matches(courseCodePattern))
            this.courseCode = courseCode;
        else
            throw new IllegalArgumentException("Course code must have 4 upper case letters, a space, and 4 digits(i.e COMP 1006)");
    }

    public void setCourseName(String courseName) {
        courseName.trim();
        if (courseName.length()>=2 && courseName.length() <= 30)
            this.courseName = courseName;
        else
            throw new IllegalArgumentException("Course name must be 2-30 characters");
    }


}
