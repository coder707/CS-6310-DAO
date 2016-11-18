package org.gatech.cs6310.DAO.entity.assignment;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class AssignmentPK implements Serializable {

	private static final long serialVersionUID = -2295407716658710239L;

	@Column(name = "INSTRUCTOR_ID")	
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
		builder.append("AssignmentPK [");
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
