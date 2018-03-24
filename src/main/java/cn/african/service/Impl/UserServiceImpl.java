package cn.african.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.african.domain.User;
import cn.african.mapper.UserMapper;
import cn.african.service.UserService;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findUsers() {
		return userMapper.findUsers();
	}

}
