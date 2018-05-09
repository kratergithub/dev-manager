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
import app.model.Organization;
import app.util.DeleteUtil;
import app.util.FindUtil;
import app.util.SaveUtil;

@RestController
@RequestMapping("/api")
public class OrganizationController {

	@PostMapping("/organization")
	public void createOrganization(@Valid @RequestBody Organization newOrganization) {

		if (null == newOrganization.getOrgName()) {
			throw new FieldMissingException("Organization name missing");
		} else {
			SaveUtil.saveOrganization(newOrganization);
		}

	}

	@GetMapping("/organization/{id}")
	public ResponseEntity<Organization> getOrganizationById(@PathVariable(value = "id") int organizationId) {

		Organization foundOrganization = FindUtil.findOrganizationById(organizationId);

		if (null != foundOrganization)
			return new ResponseEntity<Organization>(foundOrganization, HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}

	@PutMapping("/organization/{id}")
	public void updateOrganization(@PathVariable(value = "id") int organizationId) {
		// TODO
	}

	@DeleteMapping("/organization/{id}")
	public void deleteOrganization(@PathVariable(value = "id") int organizationId) {

		DeleteUtil.deleteOrganization(organizationId);
	}

}
