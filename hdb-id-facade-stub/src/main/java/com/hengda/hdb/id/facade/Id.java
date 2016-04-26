package com.hengda.hdb.id.facade;

import java.io.Serializable;

public class Id  implements Serializable{
	
	private static final long serialVersionUID = -443145878943923192L;
	private String id;
	
	public Id(String id){
		this.id = id;
	}
	
	public void setId(String id) {
		this.id = id;
	} 
	
	public String getId() {
		return this.id;
	}
}
