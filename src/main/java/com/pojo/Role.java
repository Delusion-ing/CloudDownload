package com.pojo;

import java.io.Serializable;

public class Role implements Serializable{
	
	private static final long serialVersionUID = -6252969741749690678L;
	
	private int roleId;
	private String roleName;
	private int status;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
