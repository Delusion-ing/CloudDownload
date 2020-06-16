package com.pojo;

import java.io.Serializable;

public class FileUploadDownloadEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3441547917002724231L;
	// 文件名、下载路径、大小、进度、状态
	private String udName;
	private String udPath;
	private int udSize;
	private String udProcess;

	public String getUdName() {
		return udName;
	}

	public void setUdName(String udName) {
		this.udName = udName;
	}

	public String getUdPath() {
		return udPath;
	}

	public void setUdPath(String udPath) {
		this.udPath = udPath;
	}

	public int getUdSize() {
		return udSize;
	}

	public void setUdSize(int udSize) {
		this.udSize = udSize;
	}

	public String getUdProcess() {
		return udProcess;
	}

	public void setUdProcess(String udProcess) {
		this.udProcess = udProcess;
	}

}
