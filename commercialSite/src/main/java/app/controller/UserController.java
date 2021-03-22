package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import app.model.User;
import app.service.user.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	public String getAllUsers(Model model) {
		List<User> users = userService.getAllUsers();
		model.addAttribute("show", users);
		return "user";
	}
	
	@GetMapping(value = "/{username}")
	public String deleteUser(@PathVariable("username") String username) {
		
		userService.deleteUser(username);
		
		return "redirect:/users";
	}

	
	
}
