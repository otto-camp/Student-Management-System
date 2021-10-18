package ottocamp.studentmanagement.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstructorAddDto {

	public int id;
	public int departmentId;
	public String name;
	public String surname;
	public String email;
	public String password;
	public String phoneNumber;
	public String photoUrl;
}
