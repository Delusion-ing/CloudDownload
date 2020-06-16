package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {
	String encodingString = "UTF-8";
	
	@Override
	public void destroy() {
		encodingString = "";
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		if (encodingString != null) {
			arg0.setCharacterEncoding(encodingString);
			arg1.setCharacterEncoding(encodingString);
		}
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.encodingString = arg0.getInitParameter("encoding").trim();
		if (encodingString == null) {
			encodingString = "UTF-8";
		}
	}
}
