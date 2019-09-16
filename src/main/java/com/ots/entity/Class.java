package com.ots.entity;

import javax.persistence.*;
import java.util.Set;

//班级表
@Entity
@Table(name = "class")
public class Class {
    private int cid;  //表唯一ID
    private String cname;  //班级名称
    private String cteacher;  //班主任
    private String cprofessionalID;  //所属专业
    private String cdes;  //描述

    private Professional professional;  //多方持有一方的引用

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "cid")
    private Set<Student> students;  //一方持有多方的集合

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Column(length = 15)
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Column(length = 10)
    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public String getCprofessionalID() {
        return cprofessionalID;
    }

    public void setCprofessionalID(String cprofessionalID) {
        this.cprofessionalID = cprofessionalID;
    }

    public String getCdes() {
        return cdes;
    }

    public void setCdes(String cdes) {
        this.cdes = cdes;
    }

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "pid")
    public Professional getProfessional() {
        return professional;
    }

    public void setProfessional(Professional professional) {
        this.professional = professional;
    }

    public Class(int cid, String cname, String cteacher, String cprofessionalID, String cdes, Professional professional) {
        this.cid = cid;
        this.cname = cname;
        this.cteacher = cteacher;
        this.cprofessionalID = cprofessionalID;
        this.cdes = cdes;
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "Class{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", cteacher=" + cteacher +
                ", cprofessionalID='" + cprofessionalID + '\'' +
                ", cdes='" + cdes + '\'' +
                ", professional=" + professional +
                '}';
    }
}
