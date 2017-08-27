package jpa.example.service;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class JPAExampleFilter implements Filter{
	public void  init(FilterConfig config) throws ServletException {
	}
	
	public void  doFilter(ServletRequest request, 
	              ServletResponse response,
	              FilterChain chain) 
	              throws java.io.IOException, ServletException {
		
		HttpServletResponse httpResponse;
		httpResponse = (HttpServletResponse) response;       
        
		httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        httpResponse.addHeader("Access-Control-Max-Age", "3600");
        httpResponse.addHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, PATCH, MERGE, OPTIONS");
        httpResponse.addHeader("Access-Control-Allow-Headers", "Content-Type, DataServiceVersion, MaxDataServiceVersion, x-csrf-token, sap-contextid-accept, x-http-method, sap-cancel-on-close");         
        httpResponse.addHeader("Content-Type", "application/xml, application/json, application/x-www-form-urlencoded, application/atom+xml;type=feed");
        
	    chain.doFilter(request, httpResponse);
	}

	@Override
	public void destroy() {
		
	}

}
