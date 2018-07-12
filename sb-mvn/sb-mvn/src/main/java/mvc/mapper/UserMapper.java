package mvc.mapper;


import java.util.List;
import java.util.Map;

import mvc.entity.User;

public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	List<Map<String, Object>> queryAll(Map<String, Object> params);

	void addUser(User user);

	void updateUser(User user);
}