package cn.african.diy.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.african.diy.biz.UserService;
import cn.african.diy.dao.UserDao;
import cn.african.diy.entity.User;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findUsers() {
		return userDao.findUsers();
	}

}
