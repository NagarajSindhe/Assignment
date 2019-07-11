package com.java2novice.restful;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/publish")
public class RestEasyExample {

	@GET
	@Path("/getAllBooks")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllBooks() {
		return Response.status(Status.OK).entity(new ServiceImpl().getAllBooks()).build();

	}

	@POST
	@Path("/getBooks")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getAllRecords(Books books) {
		if (books.getBookId() == 0 && books.getBookName() == null) {
			books.setBookId(400);
			books.setBookName("Error");
			books.setBookDescription("In-valid input");
			return Response.status(Status.BAD_REQUEST).entity(books).build();
		} else {
			return Response.status(Status.OK).entity(new ServiceImpl().pushAllRecords(books)).build();
		}
	}

	@POST
	@Path("/addBooks")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addBooks(Books books) {
		if (books.getBookName() == null && books.getBookDescription() == null && books.getBookDescription() == null) {
			books.setBookId(400);
			books.setBookName("Error");
			books.setBookDescription("In-valid input");
			return Response.status(Status.BAD_REQUEST).entity(books).build();
		} else {
			return Response.status(Status.OK).entity(new ServiceImpl().addBooks(books)).build();
		}
	}

	@POST
	@Path("/updateBooks")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateBooks(Books books) {
		if (books.getBookId() == 0 && books.getBookName() == null && books.getBookDescription() == null
				&& books.getBookAuthor() == null) {
			books.setBookId(400);
			books.setBookName("Error");
			books.setBookDescription("In-valid input");
			return Response.status(Status.BAD_REQUEST).entity(books).build();
		} else {
			return Response.status(Status.OK).entity(new ServiceImpl().updateBooks(books)).build();
		}
	}
}