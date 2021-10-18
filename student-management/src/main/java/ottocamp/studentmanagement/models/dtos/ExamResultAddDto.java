package ottocamp.studentmanagement.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExamResultAddDto {
	
	public int id;
	public int examId;
	public int studentId;
	public int instructorId;
	public String grade;
}
