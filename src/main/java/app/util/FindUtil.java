package app.util;

import app.model.Device;
import app.model.Organization;
import app.model.User;

public final class FindUtil {

	private FindUtil() {

	}

	public static Organization findOrganizationById(int organizationId) {

		System.out.println("FindUtil - findOrganizationById");

		return Memory.getInstance().memoryGetOrganization(organizationId);

	}

	public static User findUserById(int userId) {

		System.out.println("FindUtil - findUserById");

		return Memory.getInstance().memoryGetUser(userId);

	}
	
	public static Device findDeviceById(int deviceId) {

		System.out.println("FindUtil - findDeviceById");

		return Memory.getInstance().memoryGetDevice(deviceId);

	}

}
