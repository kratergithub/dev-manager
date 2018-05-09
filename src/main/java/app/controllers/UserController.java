package app.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.exception.FieldMissingException;
import app.model.User;
import app.util.DeleteUtil;
import app.util.FindUtil;
import app.util.SaveUtil;

@RestController
@RequestMapping("/api")
public class UserController {

	@PostMapping("/user")
	public void createUser(@Valid @RequestBody User newUser) {

		if (null == newUser.getUsername()) {
			throw new FieldMissingException("User name missing");
		} else if (0 == newUser.getOrgId()) {
			throw new FieldMissingException("Organization ID is missing");
		} else {
			SaveUtil.saveUser(newUser);
		}

	}

	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable(value = "id") int userId) {

		User foundUser = FindUtil.findUserById(userId);

		if (null != foundUser)
			return new ResponseEntity<User>(foundUser, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@PutMapping("/user/{id}")
	public void updateUser(@PathVariable(value = "id") User updatedUser) {

		SaveUtil.saveUser(updatedUser);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") int userId) {

		if (null != FindUtil.findUserById(userId)) {
			DeleteUtil.deleteUser(userId);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
