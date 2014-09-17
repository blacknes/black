package com.black.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.black.web.POJO.User;
import com.black.web.Service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource(name = "userManager")
	private UserService userManager;

	@RequestMapping("/toAddUser")
	public String toAddUser() {
		return "addUser";
	}

	@RequestMapping("/addUser")
	public String add(User user) {

		userManager.add(user);

		return "redirect:/user/getAllUser";
	}


	@RequestMapping("/deleteUser")
	public void delete(String id,HttpServletResponse response) {

		String result = "{\"result\":\"error\"}";
		if(userManager.delete(id)){
			result = "{\"result\":\"success\"}";
		}
		PrintWriter out = null;
		response.setContentType("application/json");
		
		try {
			out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	
	@RequestMapping("/updateUser")
	public String updateUser(User user,HttpServletRequest request){
		if(userManager.update(user)){
			user = userManager.findOne(user.getId());
			request.setAttribute("user", user);
			return "redirect:/user/getAllUser";
		}else{
			return "/error";
		}
	}
	
	@RequestMapping("/getUser")
	public String getOneUser(String id ,HttpServletRequest request){
		User user = userManager.findOne(id);
		request.setAttribute("user", user);
		
		return "editUser";
	}
	
	@RequestMapping("/getAllUser")
	public String getAllUser(HttpServletRequest request){
		List<User> user = userManager.findAll();
		request.setAttribute("user", user);
		
		return "getalluser";
	}
	
	
}
