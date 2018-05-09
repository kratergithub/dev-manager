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

import app.model.Device;
import app.util.FindUtil;
import app.util.SaveUtil;

@RestController
@RequestMapping("/api")
public class DeviceController {

	@PostMapping("/organization/{orgId}/device")
	public void createDevice(@Valid @RequestBody Device newDevice, @PathVariable(value = "orgId") int orgId) {

		// TODO
		// check required fields
		// check preconditions
		// check if already exists
		// add

		SaveUtil.saveDevice(newDevice);

	}

	@GetMapping("/organization/{orgId}/device/{devId}")
	public ResponseEntity<Device> getDevice(@PathVariable(value = "devId") int deviceId,
			@PathVariable(value = "orgId") int orgId) {

		Device foundDev = FindUtil.findDeviceById(deviceId, orgId);

		if (null != foundDev)
			return new ResponseEntity<Device>(foundDev, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@PutMapping("/organization/{orgId}/device/{devid}")
	public void updateDevice(@PathVariable(value = "devId") int deviceId, @PathVariable(value = "orgId") int orgId,
			@Valid @RequestBody Device updatedDevice) {
		// TODO
		// check required fields
		// check if exists
		// update
	}

	@DeleteMapping("/organization/{orgId}/device/{devid}")
	public void deleteDevice(@PathVariable(value = "devId") int deviceId, @PathVariable(value = "orgId") int orgId) {
		// TODO
		// check if exists
		// check preconditions
		// delete
	}

}
