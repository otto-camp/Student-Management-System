package ottocamp.studentmanagement.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import ottocamp.studentmanagement.models.exam.ExamResult;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructors")
@EqualsAndHashCode(callSuper = false)
public class Instructor extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "department_id")
	private int departmentId;

	@OneToMany(mappedBy = "instructor")
	private List<ExamResult> examResult;
}
