package com.java2novice.restful;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CutomExceptionMapper implements ExceptionMapper<CutomException> {

	@Override
	public Response toResponse(CutomException exception) {
		// TODO Auto-generated method stub
		ServiceResponse serviceResponse=new ServiceResponse();
		serviceResponse.setMessageId(exception.toString());
		serviceResponse.setMessageName(exception.getMessage());
		serviceResponse.setErrorCode(Response.status(Status.BAD_REQUEST).toString());
		return Response.status(Status.BAD_REQUEST).entity(serviceResponse).build();
	}

}
