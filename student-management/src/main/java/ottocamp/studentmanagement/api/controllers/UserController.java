package ottocamp.studentmanagement.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ottocamp.studentmanagement.models.User;
import ottocamp.studentmanagement.services.abstracts.UserService;
import ottocamp.studentmanagement.utils.DataResult;

@CrossOrigin
@RestController
@RequestMapping("/api/user/")
public class UserController {
	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("getall")
	public DataResult<List<User>> getAll() {
		return this.userService.getAll();
	}
}
