package ottocamp.studentmanagement.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
@EqualsAndHashCode(callSuper = false)
//@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Student extends User{
	
	@Column(name = "id")
	private int id;
	
	@Column(name = "student_id")
	private String studentId;
	
	@Column(name = "birth_date")
	private Date birthDate;
	
}
