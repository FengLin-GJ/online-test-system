package com.ots.entity;

import javax.persistence.*;
import java.util.Date;

//学生表
@Entity
@Table(name = "student")
public class Student {
    private int sid;  //表唯一ID
    private String sno;  //学号
    private String spassword;  //密码
    private String sname;  //姓名
    private Date birthday;  //出生日期
    private String snation;  //民族
    private String stel;  //电话
    private String semail;  //邮箱
    private String saddress;  //地址
    private String sclass;  //所属班级
    private String spowerId;  //权限
    private String sdes	;  //描述

    private Class sClass;  //多方持有一方的引用

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Column(length = 11)
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    @Column(length = 20)
    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    @Column(length = 15)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(length = 5)
    public String getSnation() {
        return snation;
    }

    public void setSnation(String snation) {
        this.snation = snation;
    }

    @Column(length = 11)
    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    @Column(length = 15)
    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getSpowerId() {
        return spowerId;
    }

    public void setSpowerId(String spowerId) {
        this.spowerId = spowerId;
    }

    public String getSdes() {
        return sdes;
    }

    public void setSdes(String sdes) {
        this.sdes = sdes;
    }

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "cid")
    public Class getsClass() {
        return sClass;
    }

    public void setsClass(Class sClass) {
        this.sClass = sClass;
    }

    public Student(int sid, String sno, String spassword, String sname, Date birthday, String snation, String stel, String semail, String saddress, String sclass, String spowerId, String sdes, Class sClass) {
        this.sid = sid;
        this.sno = sno;
        this.spassword = spassword;
        this.sname = sname;
        this.birthday = birthday;
        this.snation = snation;
        this.stel = stel;
        this.semail = semail;
        this.saddress = saddress;
        this.sclass = sclass;
        this.spowerId = spowerId;
        this.sdes = sdes;
        this.sClass = sClass;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sno='" + sno + '\'' +
                ", spassword='" + spassword + '\'' +
                ", sname='" + sname + '\'' +
                ", birthday=" + birthday +
                ", snation='" + snation + '\'' +
                ", stel='" + stel + '\'' +
                ", semail='" + semail + '\'' +
                ", saddress='" + saddress + '\'' +
                ", sclass='" + sclass + '\'' +
                ", spowerId='" + spowerId + '\'' +
                ", sdes='" + sdes + '\'' +
                ", sClass=" + sClass +
                '}';
    }
}
