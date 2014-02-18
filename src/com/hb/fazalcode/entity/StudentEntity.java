/**
 * Copyright 2014@ fazalcode
 * All Rights Reserved to fazalcode
 */
package com.hb.fazalcode.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Tatarao voleti
 * @date   18-Feb-2014
 *
 */
@Entity
@Table(name="student")
public class StudentEntity {
	
	public Integer sid;
	public String sname;
	public String saddr;
	public String sphno;
	
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	
	@Column(name="sname")
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Column(name="saddr")
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	@Column(name="sphno")
	public String getSphno() {
		return sphno;
	}
	public void setSphno(String sphno) {
		this.sphno = sphno;
	}
	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", sname=" + sname + ", saddr="
				+ saddr + ", sphno=" + sphno + "]";
	}
}
