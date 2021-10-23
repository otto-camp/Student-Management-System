package ottocamp.studentmanagement.models.course;

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
@Table(name = "curriculum")
public class Curriculum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "classroom")
	private String classroom;

	@Column(name = "start_time")
	private String startTime;

	@Column(name = "end_time")
	private String endTime;

	@ManyToOne()
	@JoinColumn(name = "course_id")
	private Course course;

	@ManyToOne()
	@JoinColumn(name = "student_id")
	private Student student;

	@ManyToOne()
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
}
