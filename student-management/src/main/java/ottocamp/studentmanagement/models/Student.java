package ottocamp.studentmanagement.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ottocamp.studentmanagement.models.course.Curriculum;
import ottocamp.studentmanagement.models.exam.ExamResult;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
@EqualsAndHashCode(callSuper = false)
//@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Student extends User {

	@Column(name = "id")
	private int id;

	@Column(name = "student_id")
	private String studentId;

	@OneToMany(mappedBy = "student")
	@JsonIgnore
	private List<ExamResult> examResult;
	
	@OneToMany(mappedBy = "student")
	@JsonIgnore
	private List<Curriculum> curriculums;
}
