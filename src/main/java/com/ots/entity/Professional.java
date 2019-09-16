package com.ots.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/*专业表*/
@Entity
@Table(name = "professional")
public class Professional {
    private int pid;  //表唯一ID
    private String pname;  //专业名称
    private String pdept;  //所属院系
    private Date pdate;  //创办时间
    private String pdes;  //描述

    private Faculty faculty;  //多方持有一方的引用

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "pid")
    private Set<Class> classes;  //一方持有多方的集合

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Column(length = 15)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Column(length = 15)
    public String getPdept() {
        return pdept;
    }

    public void setPdept(String pdept) {
        this.pdept = pdept;
    }

    @Temporal(TemporalType.DATE)
    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public String getPdes() {
        return pdes;
    }

    public void setPdes(String pdes) {
        this.pdes = pdes;
    }

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    @JoinColumn(name = "fid")
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Professional(int pid, String pname, String pdept, Date pdate, String pdes, Faculty faculty) {
        this.pid = pid;
        this.pname = pname;
        this.pdept = pdept;
        this.pdate = pdate;
        this.pdes = pdes;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Professional{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", pdept=" + pdept +
                ", pdate=" + pdate +
                ", pdes='" + pdes + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}
