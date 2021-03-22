package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.model.User;
import app.service.user.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping
	public String getLoginForm() {
		return "loginForm";
	}

	@PostMapping
	public String postUser(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		boolean checkIsIn = userService.checkUser(username, password);
		if (checkIsIn) {
			return "redirect:/";
		}
		return "loginForm";
	}
}
