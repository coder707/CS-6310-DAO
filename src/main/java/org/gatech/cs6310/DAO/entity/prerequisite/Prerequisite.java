package org.gatech.cs6310.DAO.entity.prerequisite;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PREREQUISITES")
public class Prerequisite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3227115375572663180L;
	

	@EmbeddedId
	private PrerequisitePK prerequisitePK;


	public PrerequisitePK getPrerequisitePK() {
		return prerequisitePK;
	}


	public void setPrerequisitePK(PrerequisitePK prerequisitePK) {
		this.prerequisitePK = prerequisitePK;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prerequisite [");
		if (prerequisitePK != null) {
			builder.append("prerequisitePK=");
			builder.append(prerequisitePK);
		}
		builder.append("]");
		return builder.toString();
	}
	
	
}
