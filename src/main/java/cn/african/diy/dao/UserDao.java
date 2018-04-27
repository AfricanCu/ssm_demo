package cn.african.diy.dao;

import java.util.List;

import cn.african.diy.entity.User;

public interface UserDao {
	
	List<User> findUsers();

}
