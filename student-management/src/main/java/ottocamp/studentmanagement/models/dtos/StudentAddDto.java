package ottocamp.studentmanagement.models.dtos;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentAddDto {
	
	public int id;
	public String studentId;
	public Date birthDate;
	public String name;
	public String surname;
	public String email;
	public String password;
	public String phoneNumber;
	public String photoUrl;
	
}
