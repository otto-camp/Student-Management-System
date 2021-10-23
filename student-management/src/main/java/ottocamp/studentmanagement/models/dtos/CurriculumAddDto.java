package ottocamp.studentmanagement.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CurriculumAddDto {
	
	private int id;
	private String classroom;
	private String startTime;
	private String endTime;
	private int courseId;
	private int studentId;
	private int instructorId;
}
