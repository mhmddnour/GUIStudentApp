/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course.model;

/**
 *
 * @author mohamed
 */
public class course {
    private int id , hours_numnber;
    private String label;

    //////////////////////////////  Grades Model//////////////////////////////////////////////
    private int student_id , course_id;
    private float student_grade;
    private String description;
    //////////////////////////////////////////////////////////////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getHours_numnber() {
        return hours_numnber;
    }

    public void setHours_numnber(int hours_numnber) {
        this.hours_numnber = hours_numnber;
    }

    public int getStudent_id() {
        return student_id;
    }
//////////////////////////////////////////////////////////////////////////////////////////////
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
