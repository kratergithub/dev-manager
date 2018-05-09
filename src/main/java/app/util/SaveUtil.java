package app.util;

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
				//TODO
				//Memory.getInstance().memoryAddOrganization(newOrganization);
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

}
