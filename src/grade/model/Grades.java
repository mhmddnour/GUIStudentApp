/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.model;

/**
 *
 * @author mohamed
 */
public class Grades {
    private int student_id , course_id;
    private float student_grade;
    private String description;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public float getStudent_grade() {
        return student_grade;
    }

    public void setStudent_grade(float student_grade) {
        this.student_grade = student_grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
