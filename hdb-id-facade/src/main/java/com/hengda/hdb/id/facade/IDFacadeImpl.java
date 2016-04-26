package com.hengda.hdb.id.facade;

import com.hengda.hdb.id.facade.IDFacade;

public class IDFacadeImpl implements IDFacade {

	public Id getId() {
		return new Id(ObjectId.getId());
	}

}
