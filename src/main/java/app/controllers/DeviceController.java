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

import app.model.Device;
import app.util.FindUtil;

@RestController
@RequestMapping("/api")
public class DeviceController {

	@PostMapping("/device")
	public void createDevice(@Valid @RequestBody Device newDevice) {

		// TODO
		// check required fields
		// check preconditions
		// check if already exists
		// add

	}

	@GetMapping("/device/{id}")
	public Device getDevice(@PathVariable(value = "id") int deviceId) {

		return FindUtil.findDeviceById(deviceId);

	}

	@PutMapping("/device/{id}")
	public void updateDevice(@PathVariable(value = "id") int updatedDevice) {
		// TODO
		// check required fields
		// check if exists
		// update
	}

	@DeleteMapping("/device/{id}")
	public void deleteDevice(@PathVariable(value = "id") int deviceId) {
		// TODO
		// check if exists
		// check preconditions
		// delete
	}

}
