package com.epiuse.recruiting;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import org.apache.olingo.odata2.api.processor.ODataContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;
import org.springframework.stereotype.Component;

@Component
public class StudentODataJPAServiceFactory extends ODataJPAServiceFactory{
	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException{
		ODataJPAContext ct = getODataJPAContext();
		ODataContext oct = ct.getODataContext();
		HttpServletRequest request = (HttpServletRequest) oct.getParameter(ODataContext.HTTP_SERVLET_REQUEST_OBJECT);
		EntityManager em = (EntityManager) request.getAttribute(EntityManagerFilter.EM_REQUEST_ATTRIBUTE);
		
		ct.setEntityManager(em);
		ct.setPersistenceUnitName("default");
		ct.setContainerManaged(true);
		return ct;
		
	}
	
	
	}

 


