package entities;

public class Rent {
	private int roomId;
	private String name;
	private String email;
	
	public Rent(int roomId, String name, String email) {
		this.roomId = roomId;
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoomId() {
		return roomId;
	}
	
	public String toString() {
		return roomId +
				": " + 
				name +
				", " +
				email;
	}
}
