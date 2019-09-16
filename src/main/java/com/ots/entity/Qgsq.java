package com.ots.entity;

import javax.persistence.*;

//题库选择题表
@Entity
@Table(name = "qgsq")
public class Qgsq {
    private int gid;  //表唯一ID
    private String gquestion;  //题目
    private String a_options;  //A选项
    private String b_options;  //B选项
    private String c_options;  //C选项
    private String d_options;  //D选项
    private String ganswer;  //标准答案
    private String gteachername;  //出题老师

    private Course course;  //多方持有一方的引用(所属课程)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGquestion() {
        return gquestion;
    }

    public void setGquestion(String gquestion) {
        this.gquestion = gquestion;
    }

    public String getA_options() {
        return a_options;
    }

    public void setA_options(String a_options) {
        this.a_options = a_options;
    }

    public String getB_options() {
        return b_options;
    }

    public void setB_options(String b_options) {
        this.b_options = b_options;
    }

    public String getC_options() {
        return c_options;
    }

    public void setC_options(String c_options) {
        this.c_options = c_options;
    }

    public String getD_options() {
        return d_options;
    }

    public void setD_options(String d_options) {
        this.d_options = d_options;
    }

    public String getGanswer() {
        return ganswer;
    }

    public void setGanswer(String ganswer) {
        this.ganswer = ganswer;
    }

    @Column(length = 10)
    public String getGteachername() {
        return gteachername;
    }

    public void setGteachername(String gteachername) {
        this.gteachername = gteachername;
    }

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "kid")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Qgsq(int gid, String gquestion, String a_options, String b_options, String c_options, String d_options, String ganswer, String gteachername, Course course) {
        this.gid = gid;
        this.gquestion = gquestion;
        this.a_options = a_options;
        this.b_options = b_options;
        this.c_options = c_options;
        this.d_options = d_options;
        this.ganswer = ganswer;
        this.gteachername = gteachername;
        this.course = course;
    }
    

    public Qgsq() {
		//super();
	}

	@Override
    public String toString() {
        return "Qgsq{" +
                "gid=" + gid +
                ", gquestion='" + gquestion + '\'' +
                ", a_options='" + a_options + '\'' +
                ", b_options='" + b_options + '\'' +
                ", c_options='" + c_options + '\'' +
                ", d_options='" + d_options + '\'' +
                ", ganswer='" + ganswer + '\'' +
                ", gteachername='" + gteachername + '\'' +
                ", course=" + course +
                '}';
    }
}
