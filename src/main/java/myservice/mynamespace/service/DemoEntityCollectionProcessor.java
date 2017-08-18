package myservice.mynamespace.service;

import org.apache.olingo.commons.api.format.ContentType;
import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.ODataLibraryException;
import org.apache.olingo.server.api.ODataRequest;
import org.apache.olingo.server.api.ODataResponse;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.server.api.uri.UriInfo;

public class DemoEntityCollectionProcessor implements org.apache.olingo.server.api.processor.EntityCollectionProcessor{

	public void init(OData arg0, ServiceMetadata arg1) {
		// TODO Auto-generated method stub
		
	}

	public void readEntityCollection(ODataRequest arg0, ODataResponse arg1, UriInfo arg2, ContentType arg3)
			throws ODataApplicationException, ODataLibraryException {
		// TODO Auto-generated method stub
		
	}

}
