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

import app.model.Organization;
import app.util.FindUtil;
import app.util.SaveUtil;

@RestController
@RequestMapping("/api")
public class OrganizationController {

	@PostMapping("/organization")
	public void createOrganization(@Valid @RequestBody Organization newOrganization) {

		SaveUtil.saveOrganization(newOrganization);

	}

	@GetMapping("/organization/{id}")
	public Organization getOrganizationById(@PathVariable(value = "id") int organizationId) {

		return FindUtil.findOrganizationById(organizationId);
				//.orElseThrow(() -> new ResourceNotFoundException("Organization", "id", organizationId));

	}
	
	@PutMapping("/organization/{id}")
	public void updateOrganization(@PathVariable(value = "id") int organizationId) {
		//TODO
	}
	
	@DeleteMapping("/organization/{id}")
	public void deleteOrganization(@PathVariable(value = "id") int organizationId) {
		//TODO
	}

}
