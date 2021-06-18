package gamesatis.entities.concretes;

import gamesatis.entities.abstracts.Entity;

public class Campaign implements Entity {

	private int id ;
	private String name  ; 
	private String desc  ;
	
	public Campaign() {}
	
	public Campaign(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	} 
	
}
