package app.service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import app.dto.UserDto;
import app.model.User;

public interface UserService {

	public void addUser(User user);

	public void deleteUser(String username);

	public void updateUser(UserDto userDto, String uuid);

	public User getUser(String uuid);

	public List<User> getAllUsersByFirstName(String name);

	public List<User> getAllUsers();

	public boolean checkUser(String username, String password);
}
