package com.pension.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.pension.entity.User;
import com.pension.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	public UserController(UserService userService) {
		super();
		this.userService= userService;
	}
	@GetMapping("/users")
	public String listAllUsers(Model model) {
		model.addAttribute("users",userService.getAllUsers());
		return "users";   // User.html we have to created.
	}
	
	@GetMapping("/PensionMS")
	public String projectStart(Model model) {
		System.out.println("step1");
		User user = new User();
		model.addAttribute("user", user);
		return "login";   	
	}
	
	@PostMapping("/home")
	public String login(@ModelAttribute("user") User user) {
		System.out.println("step2");
		String uName = user.getName();
		Long pass = user.getPassword();
		String uType = user.getuType();
		//super user : usernme - super and password 1234
		System.out.println("super user");
		System.out.println("username: super and Password is 1234");
		System.out.println("user name"+ uName);
		System.out.println("password"+ pass);
		System.out.println("type"+ uType);
		
		if(uName.equals("super") && pass.equals("1234")) {
			return "redirect:/users";
		}
		List userList = userService.getAllUsers();
		for (int i = 0; i < userList.size(); i++) {
			User u = (User)userList.get(i);
//			if(u.getuType().equals("admin")) {
//				System.out.println("I am admin");
				if(u.getuType().equals("admin") && u.getName().equals(uName) && u.getPassword().equals(pass)) {
					System.out.println("I am an authorized Admin");
					return "redirect:/users";
				}
//			}
				
//			if(u.getuType().equals("teacher")) {
//				System.out.println("I am a teacher");
				if(u.getuType().equals("pfadminstrator") && u.getName().equals(uName) && u.getPassword().equals(pass)) {
					System.out.println("Welcome PFAdminstrator");
					return "redirect:/pfadminstrator";
			}
				
//			if(u.getuType().equals("student")) {
//				System.out.println("I am student");
				if(u.getuType().equals("pensioner") && u.getName().equals(uName) && u.getPassword().equals(pass)) {
					System.out.println("Welcome Pensioner");
					return "redirect:/pensionerhome";
			}
				
//		}
//	}	

		
		}
		
		return "redirect:/PensionMS";
	}
	
	@GetMapping("/users/new")
	public String createdUserForm(Model model) {
		User user =new User();
		model.addAttribute("user", user);
		return "create_user";
		
	}
	@PostMapping("/users")
	public String saveUser(@ModelAttribute("user")User user) {
		userService.saveUser(user);
		return "redirect:/users";
	}
	@PostMapping("/users/{id}")
	public String updateUserForm(@PathVariable long id, @ModelAttribute("user") User user, Model model) {
		User u= userService.getUserById(id);
		u.setId(id);
		u.setAddress(user.getAddress());
		u.setName(user.getName());
		userService.updateUser(u);
		return "redirect:/users";
	}
	@GetMapping("/users/{id}")
	public String deleteUser(@PathVariable long id) {
		userService.deleteUserById(id);
		return "redirect:/users";
	}

	@GetMapping("/users/edit/{id}")
	public String editUserForm(@PathVariable long id,Model model)
	{
		model.addAttribute("user",userService.getUserById(id));
		return "edit_User";
	}
}
