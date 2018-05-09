package app.util;

import java.util.ArrayList;

import app.model.Device;
import app.model.Organization;
import app.model.User;

// Singleton
public class Memory {

	private static Memory instance = null;

	private ArrayList<Organization> organizations = new ArrayList<Organization>();
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Device> devices = new ArrayList<Device>();

	protected Memory() {
		// Exists only to defeat instantiation.
	}

	public static Memory getInstance() {
		if (instance == null) {
			instance = new Memory();
		}
		return instance;
	}

	public void memoryAddOrganization(Organization newOrganization) {

		System.out.println("MEMORY - memoryAddOrganization");

		this.organizations.add(newOrganization);

	}

	public Organization memoryGetOrganization(int organizationId) {

		System.out.println("MEMORY - memoryGetOrganization");

		Organization foundOrganization = null;

		for (Organization temp : this.organizations) {
			if (temp.getOrgId() == organizationId) {
				foundOrganization = temp;
				System.out.println("ORGANIZATION WITH ID " + organizationId + " FOUND");
			} else {
				System.out.println("ORGANIZATION WITH ID " + organizationId + " NOT FOUND");
			}
		}

		return foundOrganization;

	}

	public void memoryUpdateOrganization(Organization newOrganization) {

		//Organization foundOrganization = null;
		// TODO

	}

	public void memoryDeleteOrganization(int organizationId) {

		System.out.println("MEMORY - memoryDeleteOrganization");

		int i = 0;
		for (Organization temp : this.organizations) {
			if (temp.getOrgId() == organizationId) {
				System.out.println("ORGANIZATION WITH ID " + organizationId + " FOUND");
				this.organizations.remove(i);
				System.out.println("ORGANIZATION WITH ID " + organizationId + " REMOVED");
			} else {
				System.out.println("ORGANIZATION WITH ID " + organizationId + " NOT FOUND");
			}
			i++;
		}

	}

	public void memoryAddUser(User newUser) {

		System.out.println("MEMORY - memoryAddUser");

		this.users.add(newUser);

	}

	public User memoryGetUser(int userId) {

		System.out.println("MEMORY - memoryGetUser");

		User foundUser = null;

		for (User temp : this.users) {
			if (temp.getUserId() == userId) {
				foundUser = temp;
				System.out.println("USER WITH ID " + userId + " FOUND");
			} else {
				System.out.println("USER WITH ID " + userId + " NOT FOUND");
			}
		}

		return foundUser;
	}

	public void memoryUpdateUser(User newUser) {

		System.out.println("MEMORY - memoryUpdateUser");

		// TODO
		// this.users.add(newUser);

	}

	public void memoryDeleteUser(int userId) {

		System.out.println("MEMORY - memoryDeleteUser");

		int i = 0;
		for (User temp : this.users) {
			if (temp.getOrgId() == userId) {
				System.out.println("USER WITH ID " + userId + " FOUND");
				this.users.remove(i);
				System.out.println("USER WITH ID " + userId + " REMOVED");
			} else {
				System.out.println("USER WITH ID " + userId + " NOT FOUND");
			}
			i++;
		}
	}

	public void memoryAddDevice(Device newDevice) {

		this.devices.add(newDevice);
	}
	
	public Device memoryGetDevice(int deviceId) {

		System.out.println("MEMORY - memoryGetDevice");

		Device foundDevice = null;

		for (Device temp : this.devices) {
			if (temp.getDeviceId() == deviceId) {
				foundDevice = temp;
				System.out.println("DEVICE WITH ID " + deviceId + " FOUND");
			} else {
				System.out.println("DEVICE WITH ID " + deviceId + " NOT FOUND");
			}
		}

		return foundDevice;
	}

}
