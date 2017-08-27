package jpa.example.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet;

public class JPAExampleService extends CXFNonSpringJaxrsServlet {
	
	private static final long serialVersionUID = 1L;
	public JPAExampleService()
	{
		super();
	}
	
    @Override
    public void doOptions(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Max-Age", "3600");
        resp.setHeader("Access-Control-Allow-Methods", "PUT, POST, GET, DELETE, PATCH, MERGE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, DataServiceVersion, MaxDataServiceVersion, x-csrf-token, sap-contextid-accept, x-http-method, sap-cancel-on-close");                
        
        resp.addHeader("DataServiceVersion", "2.0");      
        
    }
}
