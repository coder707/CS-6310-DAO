package org.gatech.cs6310.DAO.entity.instructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="INSTRUCTORS")
public class Instructor {

	 @Id
	 @Column(name = "UUID")	
	 private Integer id;
	 
	 @Column(name = "NAME")
	 private String name;
	 
	 @Column(name = "ADDRESS") 
	 private String address;
	 
	 @Column(name = "PHONE")
	 private String phone;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("INSTRUCTOR [");
		if (id != null) {
			builder.append("UUID=");
			builder.append(id);
			builder.append(", ");
		}
		if (name != null) {
			builder.append("name=");
			builder.append(name);
			builder.append(", ");
		}
		if (address != null) {
			builder.append("address=");
			builder.append(address);
			builder.append(", ");
		}
		if (phone != null) {
			builder.append("phone=");
			builder.append(phone);
		}
		builder.append("]");
		return builder.toString();
	}
	
}
