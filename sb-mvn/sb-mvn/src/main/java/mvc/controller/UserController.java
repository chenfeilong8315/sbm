package mvc.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mvc.entity.User;
import mvc.service.impl.UserServiceImpl;

@RequestMapping("/api/v1")
@RestController
public class UserController {
	@Autowired
	private UserServiceImpl userService;
	
	/**
	 * 
	 * @param user_id
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/users/{user_id}")
	public User queryByid(@PathVariable int user_id){
		mvc.entity.User user = this.userService.getUserById(user_id);
		return user;
	}
	/**
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/users/{pageNo}/{pageSize}")
	public List<Map<String, Object>> queryAll(@PathVariable Integer pageNo,@PathVariable Integer pageSize){
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("pageNo", pageNo==null||pageNo <= 0?1:(pageNo-1)*pageSize);
		params.put("pageSize", pageSize==null||pageNo<=0?100:pageSize);
		
		return userService.queryAll(params);
	}
	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public User addUser(@RequestBody User user){
		userService.addUser(user);
		return user;
	}
	/**
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT,value="/users/{user_id}")
	public int updateUser(@RequestBody User user,@PathVariable Integer user_id){
		user.setId(user_id);
		return userService.updateUser(user);
	}
	/**
	 * 
	 * @param user_id
	 * @return
	 */
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{user_id}")
	public int deleteUser(@PathVariable Integer user_id ){
		return userService.deleteUser(user_id);
	}
	
	
}
