package cn.african.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.african.domain.User;
import cn.african.service.UserService;
import net.sf.json.JSONArray;

@Controller
public class TestController {
	public Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "findUsers", method=RequestMethod.GET)
	public JSONArray findUsers() {
		List<User> users = userService.findUsers();
		return JSONArray.fromObject(users);
	}
}
