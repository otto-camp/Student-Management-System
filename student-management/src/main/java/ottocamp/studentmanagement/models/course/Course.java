 package ottocamp.studentmanagement.models.course;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "course_id")
	private String courseId;

	@Column(name = "course_desc")
	private String courseDesc;

	@ManyToOne()
	@JoinColumn(name = "course_type_id")
	private CourseType courseType;
	
	@OneToMany(mappedBy = "course")
	@JsonIgnore
	private List<Curriculum> curriculums;
}
