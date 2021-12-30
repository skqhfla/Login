package Dao;

public class Dao {
	private String name;
	private String id;
	private String password;
	private String phone;
	private String gender;
	private int maneger;

	public Dao() {
	}

	public Dao(String name, String id, String password, String phone, String gender) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getManeger() {
		return maneger;
	}

	public void setManeger(int maneger) {
		this.maneger = maneger;
	}
}
