package com.ots.entity;
import javax.persistence.*;
import  java.util.Date;
import java.util.Set;

/*院系表*/
@Entity
@Table(name = "faculty")
public class Faculty {
    private int fid;    //表唯一ID
    private String fname;  //院系名称
    private Date fdate;  //创办时间
    private  String fdes;  //描述

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "fid")
    private Set<Professional> professionals;  //一方持有多方的集合

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Column(length = 15)
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Temporal(TemporalType.DATE)
    public Date getFdate() {
        return fdate;
    }

    public void setFdate(Date fdate) {
        this.fdate = fdate;
    }

    public String getFdes() {
        return fdes;
    }

    public void setFdes(String fdes) {
        this.fdes = fdes;
    }

    public Faculty(int fid, String fname, Date fdate, String fdes) {
        this.fid = fid;
        this.fname = fname;
        this.fdate = fdate;
        this.fdes = fdes;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", fdate=" + fdate +
                ", fdes='" + fdes + '\'' +
                '}';
    }
}
