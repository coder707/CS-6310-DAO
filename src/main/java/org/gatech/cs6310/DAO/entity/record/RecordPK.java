package org.gatech.cs6310.DAO.entity.record;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class RecordPK  implements Serializable{



	private static final long serialVersionUID = -4576436148637869795L;

	@Column(name = "STUDENT_ID")	
	 private Integer studentId;
	 
	 @Column(name = "COURSE_ID")	
	 private Integer courseId;

	 @Column(name = "INSTRUCTOR_ID")	
	 private Integer instructorId;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(Integer instructorId) {
		this.instructorId = instructorId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecordPK [");
		if (studentId != null) {
			builder.append("studentId=");
			builder.append(studentId);
			builder.append(", ");
		}
		if (courseId != null) {
			builder.append("courseId=");
			builder.append(courseId);
			builder.append(", ");
		}
		if (instructorId != null) {
			builder.append("instructorId=");
			builder.append(instructorId);
		}
		builder.append("]");
		return builder.toString();
	}

	
	
}
