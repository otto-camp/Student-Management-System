package ottocamp.studentmanagement.models.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ottocamp.studentmanagement.models.Instructor;
import ottocamp.studentmanagement.models.Student;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "exam_result")
public class ExamResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "grade")
	private String grade;

	@ManyToOne()
	@JoinColumn(name = "exam_id")
	private Exam exam;

	@ManyToOne()
	@JoinColumn(name = "student_id")
	private Student student;

	@ManyToOne()
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;

}
