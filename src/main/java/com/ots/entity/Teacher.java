package com.ots.entity;

import javax.persistence.*;
import java.util.Date;

//教师表
@Entity
@Table(name = "teacher")
public class Teacher {
    private int tid;  //表唯一ID
    private String tno;  //教师编号
    private String tpassword;  //密码
    private String tname;  //姓名
    private Date birthday;  //出生日期
    private String tnation;  //民族
    private String ttel;  //电话
    private String temail;  //邮箱
    private String taddress;  //地址
    private String tposition;  //职位
    private String tpowerId;  //权限
    private String tdes	;  //描述

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Column(length = 11)
    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    @Column(length = 20)
    public String getTpassword() {
        return tpassword;
    }

    public void setTpassword(String tpassword) {
        this.tpassword = tpassword;
    }

    @Column(length = 10)
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Column(length = 5)
    public String getTnation() {
        return tnation;
    }

    public void setTnation(String tnation) {
        this.tnation = tnation;
    }

    @Column(length = 11)
    public String getTtel() {
        return ttel;
    }

    public void setTtel(String ttel) {
        this.ttel = ttel;
    }

    public String getTemail() {
        return temail;
    }

    public void setTemail(String temail) {
        this.temail = temail;
    }

    public String getTaddress() {
        return taddress;
    }

    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    @Column(length = 15)
    public String getTposition() {
        return tposition;
    }

    public void setTposition(String tposition) {
        this.tposition = tposition;
    }

    public String getTpowerId() {
        return tpowerId;
    }

    public void setTpowerId(String tpowerId) {
        this.tpowerId = tpowerId;
    }

    public String getTdes() {
        return tdes;
    }

    public void setTdes(String tdes) {
        this.tdes = tdes;
    }

    public Teacher(int tid, String tno, String tpassword, String tname, Date birthday, String tnation, String ttel, String temail, String taddress, String tposition, String tpowerId, String tdes) {
        this.tid = tid;
        this.tno = tno;
        this.tpassword = tpassword;
        this.tname = tname;
        this.birthday = birthday;
        this.tnation = tnation;
        this.ttel = ttel;
        this.temail = temail;
        this.taddress = taddress;
        this.tposition = tposition;
        this.tpowerId = tpowerId;
        this.tdes = tdes;
    }

    public Teacher() {
	}

	@Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tno='" + tno + '\'' +
                ", tpassword='" + tpassword + '\'' +
                ", tname='" + tname + '\'' +
                ", birthday=" + birthday +
                ", tnation='" + tnation + '\'' +
                ", ttel='" + ttel + '\'' +
                ", temail='" + temail + '\'' +
                ", taddress='" + taddress + '\'' +
                ", tposition='" + tposition + '\'' +
                ", tpowerId='" + tpowerId + '\'' +
                ", tdes='" + tdes + '\'' +
                '}';
    }
}
