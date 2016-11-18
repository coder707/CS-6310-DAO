package org.gatech.cs6310.DAO.entity.assignment;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ASSIGNMENTS")
public class Assignment implements Serializable {


	private static final long serialVersionUID = 7994321988135003690L;

	@EmbeddedId
	private AssignmentPK prerequisitePK;

	 @Column(name = "AVAILABLE_SEATS") 
	 private Integer availableSeats;

	public AssignmentPK getPrerequisitePK() {
		return prerequisitePK;
	}

	public void setPrerequisitePK(AssignmentPK prerequisitePK) {
		this.prerequisitePK = prerequisitePK;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Assignment [");
		if (prerequisitePK != null) {
			builder.append("prerequisitePK=");
			builder.append(prerequisitePK);
			builder.append(", ");
		}
		if (availableSeats != null) {
			builder.append("availableSeats=");
			builder.append(availableSeats);
		}
		builder.append("]");
		return builder.toString();
	}
	 

	
	
}
