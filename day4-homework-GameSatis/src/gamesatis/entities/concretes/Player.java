package gamesatis.entities.concretes;

public class Player {
	
	private int id ; 
	private String firstName;
	private String lastName;
	private String tcno;
	private int bdate ;
	
	public Player() {}
	
	public Player(int id, String firstName, String lastName, String tcno, int bdate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcno = tcno;
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTcno() {
		return tcno;
	}

	public void setTcno(String tcno) {
		this.tcno = tcno;
	}

	public int getBdate() {
		return bdate;
	}

	public void setBdate(int bdate) {
		this.bdate = bdate;
	} 
	
	

}
