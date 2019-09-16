package com.ots.entity;

import javax.persistence.*;

//题库填空题表
@Entity
@Table(name = "qlfb")
public class Qlfb {
    private int fid;  //表唯一ID
    private String fquestion;  //题目
    private String fanswer;  //标准答案
    private String fteachername;  //出题老师

    private Course course;  //多方持有一方的引用(所属课程)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFquestion() {
        return fquestion;
    }

    public void setFquestion(String fquestion) {
        this.fquestion = fquestion;
    }

    public String getFanswer() {
        return fanswer;
    }

    public void setFanswer(String fanswer) {
        this.fanswer = fanswer;
    }

    @Column(length = 10)
    public String getFteachername() {
        return fteachername;
    }

    public void setFteachername(String fteachername) {
        this.fteachername = fteachername;
    }

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "kid")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Qlfb(int fid, String fquestion, String fanswer, String fteachername, Course course) {
        this.fid = fid;
        this.fquestion = fquestion;
        this.fanswer = fanswer;
        this.fteachername = fteachername;
        this.course = course;
    }

    public Qlfb() {
		//super();
	}

	@Override
    public String toString() {
        return "Qlfb{" +
                "fid=" + fid +
                ", fquestion='" + fquestion + '\'' +
                ", fanswer='" + fanswer + '\'' +
                ", fteachername='" + fteachername + '\'' +
                ", course=" + course +
                '}';
    }
}
