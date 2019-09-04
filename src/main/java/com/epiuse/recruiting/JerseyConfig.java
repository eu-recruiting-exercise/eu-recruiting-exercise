package com.epiuse.recruiting;



import javax.persistence.EntityManagerFactory;
import javax.ws.rs.ApplicationPath;

import org.apache.olingo.odata2.core.rest.ODataRootLocator;
import org.apache.olingo.odata2.core.rest.app.ODataApplication;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
@ApplicationPath("/odata.svc")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig(StudentODataJPAServiceFactory serviceFactory, EntityManagerFactory emf) {
		ODataApplication app = new ODataApplication();
		app.getClasses().forEach(c -> {
			if (!ODataRootLocator.class.isAssignableFrom(c)) {
				register(c);
			}
		});
		register(new RootLocator(serviceFactory));
		register(new EntityManagerFilter(emf));

	}

}
