package org.gatech.cs6310.DAO.entity.record;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RECORDS")
public class Record implements Serializable{


	private static final long serialVersionUID = -5213160409749370658L;

	@EmbeddedId
	private RecordPK recordPK;
	 
	 @Column(name = "COMMENTS")
	 private String comments;
	 
	 @Column(name = "GRADE") 
	 private String grade;
	 


	public String getComments() {
		return comments;
	}

	public RecordPK getRecordPK() {
		return recordPK;
	}

	public void setRecordPK(RecordPK recordPK) {
		this.recordPK = recordPK;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	 

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Record [");
		if (recordPK != null) {
			builder.append("recordPK=");
			builder.append(recordPK);
			builder.append(", ");
		}
		if (comments != null) {
			builder.append("comments=");
			builder.append(comments);
			builder.append(", ");
		}
		if (grade != null) {
			builder.append("grade=");
			builder.append(grade);
		}
		builder.append("]");
		return builder.toString();
	}

	
}
