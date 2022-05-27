package kota.student.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private String name;
    @Column(nullable = false,updatable = false)
    private String clgId;
    private String emailid;
    private String branch;
    private char batch;
    private String currYear;
    @Column(nullable = false, updatable = false)
    private String joinYear;
    private String graduationYear;
    private String semester;

    public Student(){}

    public Student(int id, String name, String clgId, String emailid, String branch, char batch, String currYear, String joinYear, String graduationYear, String semester) {
        this.id = id;
        this.name = name;
        this.clgId = clgId;
        this.emailid = emailid;
        this.branch = branch;
        this.batch = batch;
        this.currYear = currYear;
        this.joinYear = joinYear;
        this.graduationYear = graduationYear;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClgId() {
        return clgId;
    }

    public void setClgId(String clgId) {
        this.clgId = clgId;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public char getBatch() {
        return batch;
    }

    public void setBatch(char batch) {
        this.batch = batch;
    }

    public String getCurrYear() {
        return currYear;
    }

    public void setCurrYear(String currYear) {
        this.currYear = currYear;
    }

    public String getJoinYear() {
        return joinYear;
    }

    public void setJoinYear(String joinYear) {
        this.joinYear = joinYear;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clgId='" + clgId + '\'' +
                ", emailid='" + emailid + '\'' +
                ", branch='" + branch + '\'' +
                ", batch=" + batch +
                ", currYear='" + currYear + '\'' +
                ", joinYear='" + joinYear + '\'' +
                ", graduationYear='" + graduationYear + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
