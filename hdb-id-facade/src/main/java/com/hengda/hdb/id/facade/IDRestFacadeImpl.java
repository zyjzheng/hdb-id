package com.hengda.hdb.id.facade;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path(value = "/")
public class IDRestFacadeImpl implements IDRestFacade {

	@GET
	@Produces("application/json")
	public Id getId() {
		return new Id(ObjectId.getId());
	}

}
