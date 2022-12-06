package com.login_system.model;

import java.util.Date;

public class UserBean {
	private int id; 
	private String username; 
	private String password;
	
	private ProfileBean profile;
	
	private Date insertDate;
	private Date updateDate;
	private Date deleteDate;
	
	public ProfileBean getProfile() {
		return profile;
	}
	public void setProfile(ProfileBean profile) {
		this.profile = profile;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	
	
}
