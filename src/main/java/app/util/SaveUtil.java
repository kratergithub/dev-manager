package app.util;

import app.model.Device;
import app.model.Organization;
import app.model.User;

public final class SaveUtil {

	private SaveUtil() {
	}

	public static void saveOrganization(Organization newOrganization) {

		System.out.println("SaveUtil - saveOrganization");

		int newOrgId = newOrganization.getOrgId();

		if (newOrgId != 0) {
			if (null == FindUtil.findOrganizationById(newOrgId)) {
				System.out.println("Adding organization with ID " + newOrgId);
				Memory.getInstance().memoryAddOrganization(newOrganization);
			} else {
				System.out.println("ERROR: organization with ID " + newOrgId + " already exists");
			}
		} else {
			System.out.println("ERROR: no organization ID");
		}

	}

	public static void updateOrganization(Organization updatedOrganization) {

		System.out.println("SaveUtil - updateOrganization");

		int orgId = updatedOrganization.getOrgId();

		if (orgId != 0) {
			if (null != FindUtil.findOrganizationById(orgId)) {
				System.out.println("Updating organization with ID " + orgId);
				// TODO
				// Memory.getInstance().memoryAddOrganization(newOrganization);
			} else {
				System.out.println("ERROR: organization with ID " + orgId + " does not exist");
			}
		} else {
			System.out.println("ERROR: no organization ID");
		}

	}

	public static void saveUser(User newUser) {

		System.out.println("SaveUtil - saveUser");

		int newUserId = newUser.getUserId();
		int newUserOrgId = newUser.getOrgId();

		if (newUserId != 0 && (null != FindUtil.findOrganizationById(newUserOrgId))) {

			if (null == FindUtil.findUserById(newUserId)) {
				System.out.println("Adding user with ID " + newUserId);
				Memory.getInstance().memoryAddUser(newUser);
			} else {
				System.out.println("ERROR: user with ID " + newUserId + " already exists");
			}

		} else {
			System.out.println("ERROR: can't create user");
		}

	}

	public static void saveDevice(Device newDevice) {

		System.out.println("SaveUtil - saveDevice");

		int newDeviceId = newDevice.getDeviceId();
		// int newDeviceOwnerId = newDevice.getOwnerUserId();

		if (newDeviceId != 0 && (null != FindUtil.findDeviceById(newDeviceId, 0))) {

			if (null == FindUtil.findDeviceById(newDeviceId, 0)) {
				System.out.println("Adding device with ID " + newDeviceId);
				Memory.getInstance().memoryAddDevice(newDevice);
			} else {
				System.out.println("ERROR: device with ID " + newDeviceId + " already exists");
			}

		} else {
			System.out.println("ERROR: can't create device");
		}

	}

}
