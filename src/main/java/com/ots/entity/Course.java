package com.ots.entity;

import javax.persistence.*;
import java.util.Set;

//课程表
@Entity
@Table(name = "course")
public class Course {
    private int kid;  //表唯一ID
    private String kname;  //课程名称
    private String kdes	;  //描述

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "kid")
    private Set<Qgsq> qgsqs;  //题库选择题表
    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "kid")
    private Set<Qlfb> qlfbs;  //题库填空题表
    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "kid")
    private Set<Qljq> qljqs;  //题库判断题表
    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "kid")
    private  Set<Qlsaq> qlsaqs;  //题库简答题表

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getKid() {
        return kid;
    }

    public void setKid(int kid) {
        this.kid = kid;
    }

    @Column(length = 15)
    public String getKname() {
        return kname;
    }

    public void setKname(String kname) {
        this.kname = kname;
    }

    public String getKdes() {
        return kdes;
    }

    public void setKdes(String kdes) {
        this.kdes = kdes;
    }

    public Course(int kid, String kname, String kdes) {
        this.kid = kid;
        this.kname = kname;
        this.kdes = kdes;
    }

    @Override
    public String toString() {
        return "Course{" +
                "kid=" + kid +
                ", kname='" + kname + '\'' +
                ", kdes='" + kdes + '\'' +
                '}';
    }
}
