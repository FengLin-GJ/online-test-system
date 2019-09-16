package com.ots.entity;

import javax.persistence.*;

//题库简答题表
@Entity
@Table(name = "qlsaq")
public class Qlsaq {
    private int aid;  //表唯一ID
    private String aquestion;  //题目
    private String aanswer;  //标准答案
    private String ateachername;  //出题老师

    private Course course;  //多方持有一方的引用(所属课程)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAquestion() {
        return aquestion;
    }

    public void setAquestion(String aquestion) {
        this.aquestion = aquestion;
    }

    public String getAanswer() {
        return aanswer;
    }

    public void setAanswer(String aanswer) {
        this.aanswer = aanswer;
    }

    @Column(length = 10)
    public String getAteachername() {
        return ateachername;
    }

    public void setAteachername(String ateachername) {
        this.ateachername = ateachername;
    }

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "kid")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Qlsaq(int aid, String aquestion, String aanswer, String ateachername, Course course) {
        this.aid = aid;
        this.aquestion = aquestion;
        this.aanswer = aanswer;
        this.ateachername = ateachername;
        this.course = course;
    }
    
    public Qlsaq() {
		//super();
	}

	@Override
    public String toString() {
        return "Qlsaq{" +
                "aid=" + aid +
                ", aquestion='" + aquestion + '\'' +
                ", aanswer='" + aanswer + '\'' +
                ", ateachername='" + ateachername + '\'' +
                ", course=" + course +
                '}';
    }
}
