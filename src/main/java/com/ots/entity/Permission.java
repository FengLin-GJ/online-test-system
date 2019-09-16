package com.ots.entity;

import javax.persistence.*;

//权限表
@Entity
@Table(name = "permission")
public class Permission {
    private int qid;  //表唯一ID
    private String qname; //姓名
    private String qaccount;  //账号
    private String qpassword;  //密码
    private String qauthority;  //权限级别(0:上帝 1:管理员权限 2:教师级别权限 3:学生级别权限)
    private String qposition;  //职位

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public String getQaccount() {
		return qaccount;
	}

	public void setQaccount(String qaccount) {
		this.qaccount = qaccount;
	}

	public String getQpassword() {
		return qpassword;
	}

	public void setQpassword(String qpassword) {
		this.qpassword = qpassword;
	}

	public String getQauthority() {
		return qauthority;
	}

	public void setQauthority(String qauthority) {
		this.qauthority = qauthority;
	}

	public String getQposition() {
		return qposition;
	}

	public void setQposition(String qposition) {
		this.qposition = qposition;
	}

	public Permission(int qid, String qname, String qaccount, String qpassword, String qauthority, String qposition) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.qaccount = qaccount;
		this.qpassword = qpassword;
		this.qauthority = qauthority;
		this.qposition = qposition;
	}

	public Permission() {
	}

	@Override
	public String toString() {
		return "Permission [qid=" + qid + ", qname=" + qname + ", qaccount=" + qaccount + ", qpassword=" + qpassword
				+ ", qauthority=" + qauthority + ", qposition=" + qposition + "]";
	}
}
