package ottocamp.studentmanagement.services.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ottocamp.studentmanagement.dtos.UserDao;
import ottocamp.studentmanagement.models.User;
import ottocamp.studentmanagement.services.abstracts.UserService;
import ottocamp.studentmanagement.utils.DataResult;
import ottocamp.studentmanagement.utils.SuccessDataResult;

@Service
public class UserManager implements UserService {

	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		return new SuccessDataResult<List<User>>(userDao.findAll(), "Users listed!");
	}

}
