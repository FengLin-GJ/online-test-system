package com.ots.entity;

import javax.persistence.*;

//题库判断题表
@Entity
@Table(name = "qljq")
public class Qljq {
    private int lid;  //表唯一ID
    private String lquestion;  //题目
    private String lanswer;  //标准答案(对或错)
    private String lanswerAnalysis;  //答案解析
    private String lteachername;  //出题老师

    private Course course;  //多方持有一方的引用(所属课程)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLquestion() {
        return lquestion;
    }

    public void setLquestion(String lquestion) {
        this.lquestion = lquestion;
    }

    @Column(length = 2)
    public String getLanswer() {
        return lanswer;
    }

    public void setLanswer(String lanswer) {
        this.lanswer = lanswer;
    }

    public String getLanswerAnalysis() {
        return lanswerAnalysis;
    }

    public void setLanswerAnalysis(String lanswerAnalysis) {
        this.lanswerAnalysis = lanswerAnalysis;
    }

    @Column(length = 10)
    public String getLteachername() {
        return lteachername;
    }

    public void setLteachername(String lteachername) {
        this.lteachername = lteachername;
    }

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "kid")
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Qljq(int lid, String lquestion, String lanswer, String lanswerAnalysis, String lteachername, Course course) {
        this.lid = lid;
        this.lquestion = lquestion;
        this.lanswer = lanswer;
        this.lanswerAnalysis = lanswerAnalysis;
        this.lteachername = lteachername;
        this.course = course;
    }
    
    public Qljq() {
		//super();
	}

	@Override
    public String toString() {
        return "Qljq{" +
                "lid=" + lid +
                ", lquestion='" + lquestion + '\'' +
                ", lanswer='" + lanswer + '\'' +
                ", lanswerAnalysis='" + lanswerAnalysis + '\'' +
                ", lteachername='" + lteachername + '\'' +
                ", course=" + course +
                '}';
    }
}
