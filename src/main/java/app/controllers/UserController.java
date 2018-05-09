package app.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.User;
import app.util.DeleteUtil;
import app.util.FindUtil;
import app.util.SaveUtil;

@RestController
@RequestMapping("/api")
public class UserController {

	@PostMapping("/user")
	public void createUser(@Valid @RequestBody User newUser) {

		SaveUtil.saveUser(newUser);
	}

	@GetMapping("/user/{id}")
	public User getUserById(@PathVariable(value = "id") int userId) {

		return FindUtil.findUserById(userId);
		// .orElseThrow(() -> new ResourceNotFoundException("Organization", "id",
		// organizationId));
	}

	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable(value = "id") User updatedUser) {

		SaveUtil.saveUser(updatedUser);
	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable(value = "id") int userId) {

		DeleteUtil.deleteUser(userId);
	}

}
