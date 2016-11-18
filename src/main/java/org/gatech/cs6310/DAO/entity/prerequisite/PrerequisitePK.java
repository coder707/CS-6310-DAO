package org.gatech.cs6310.DAO.entity.prerequisite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class PrerequisitePK implements Serializable {


	private static final long serialVersionUID = 8675349268791182302L;

	@Column(name = "PREREQUISITE_COURSE_ID")	
	 private Integer prerequisite_courseId;
	 
	 @Column(name = "COURSE_ID")	
	 private Integer courseId;

	public Integer getPrerequisite_courseId() {
		return prerequisite_courseId;
	}

	public void setPrerequisite_courseId(Integer prerequisite_courseId) {
		this.prerequisite_courseId = prerequisite_courseId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PrerequisitePK [");
		if (prerequisite_courseId != null) {
			builder.append("prerequisite_courseId=");
			builder.append(prerequisite_courseId);
			builder.append(", ");
		}
		if (courseId != null) {
			builder.append("courseId=");
			builder.append(courseId);
		}
		builder.append("]");
		return builder.toString();
	}
	 
	 
	 
	 
}
