package mvc.service.impl;


import mvc.entity.User;
import mvc.mapper.UserMapper;
import mvc.service.IUserService;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userDao;

	@Override
	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

	public List<Map<String, Object>> queryAll(Map<String, Object> params) {
		return userDao.queryAll(params);
	}

	public void addUser(User user) {
		 userDao.addUser(user);
	}

	public int updateUser(User user) {
		return userDao.updateByPrimaryKey(user);
	}


	public int deleteUser(Integer user_id) {
		return userDao.deleteByPrimaryKey(user_id);
	}

}
