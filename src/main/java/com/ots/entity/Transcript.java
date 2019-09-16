package com.ots.entity;

import javax.persistence.*;

//成绩表
@Entity
@Table(name = "transcript")
public class Transcript {
    private int rid;  //表唯一ID
    private String rno;  //学号
    private String rname;  //姓名
    private String rprofessional;  //所属专业
    private String rclass;  //所属班级
    private String results;  //成绩
    private String rclassification;  //分类

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Column(length = 11)
    public String getRno() {
        return rno;
    }

    public void setRno(String rno) {
        this.rno = rno;
    }

    @Column(length = 10)
    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    @Column(length = 15)
    public String getRprofessional() {
        return rprofessional;
    }

    public void setRprofessional(String rprofessional) {
        this.rprofessional = rprofessional;
    }

    @Column(length = 15)
    public String getRclass() {
        return rclass;
    }

    public void setRclass(String rclass) {
        this.rclass = rclass;
    }

    @Column(length = 6)
    public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public String getRclassification() {
		return rclassification;
	}

	public void setRclassification(String rclassification) {
		this.rclassification = rclassification;
	}

	public Transcript(int rid, String rno, String rname, String rprofessional, String rclass, String results,
			String rclassification) {
		super();
		this.rid = rid;
		this.rno = rno;
		this.rname = rname;
		this.rprofessional = rprofessional;
		this.rclass = rclass;
		this.results = results;
		this.rclassification = rclassification;
	}

	public Transcript() {
		//super();
	}

	@Override
	public String toString() {
		return "Transcript [rid=" + rid + ", rno=" + rno + ", rname=" + rname + ", rprofessional=" + rprofessional
				+ ", rclass=" + rclass + ", results=" + results + ", rclassification=" + rclassification + "]";
	}
}
