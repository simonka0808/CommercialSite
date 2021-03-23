package app.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.dto.UserDto;
import app.model.User;
import app.repository.user.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Service
@AllArgsConstructor

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public void addUser(User user) {
		if (user == null) {
			return;
		}
		userRepository.save(user);
	}

	@Override
	public User getUser(String uuid) {
		return userRepository.getOne(uuid);
	}

	@Override
	public List<User> getAllUsersByFirstName(String name) {
		return userRepository.findByFirstName(name);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public boolean checkUser(String username, String password) {
		if ((username.isBlank() || password.isBlank()) || (username == null || password == null)) {
			return false;
		}
		boolean flag = false;
		List<User> allUsers = userRepository.findAll();
		for (User user : allUsers) {
			if (user.getPassword().equals(password) && user.getUsername().equals(username)) {
				flag = true;
			}

		}

		return flag;
	}

	@Override
	public void updateUser(UserDto userDto, String uuid) {
		if (userDto == null && uuid == null) {
			return;
		}

		User updateUser = userRepository.getOne(uuid);
		if (userDto != null && uuid != null) {

			updateUser.setEmail(userDto.getEmail());
			updateUser.setFirstName(userDto.getFirstName());
			updateUser.setLastName(userDto.getLastName());
			updateUser.setPassword(userDto.getPassword());
			updateUser.setUsername(userDto.getUsername());
		}

	}

	@Override
	public void deleteUser(String username) {
		User u = userRepository.findOneByUsername(username);
		userRepository.deleteById(u.getUserID());
		
	}

}
