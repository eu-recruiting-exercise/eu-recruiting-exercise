package com.epiuse.recruiting;

import javax.ws.rs.Path;

import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.core.rest.ODataRootLocator;

@Path("/")
public class RootLocator extends ODataRootLocator{
	
	
		private StudentODataJPAServiceFactory serviceFactory;
		public RootLocator(StudentODataJPAServiceFactory serviceFactory) {
			this.serviceFactory = serviceFactory;
		}
		
		@Override
		public ODataServiceFactory getServiceFactory() {
			return this.serviceFactory;
		}
}
