package com.pojo;

import java.io.Serializable;

public class FileType implements Serializable {

	private static final long serialVersionUID = 3144291845175202659L;

	private int typeId;
	private String typeName;
	private String extension;
	private String mark;

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

}
