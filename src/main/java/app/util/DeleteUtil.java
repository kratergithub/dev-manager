package app.util;

public final class DeleteUtil {

	public static void deleteOrganization(int orgId) {

		System.out.println("DeleteUtil - deleteOrganization");

		if (validateOrganizationDeletion(orgId)) {
			Memory.getInstance().memoryDeleteOrganization(orgId);
		} else {
			System.out.println("ERROR: CAN'T DELETE ORGANIZATION WITH ID: " + orgId);
		}
	}

	public static void deleteUser(int userId) {

		System.out.println("DeleteUtil - deleteUser");

		Memory.getInstance().memoryDeleteUser(userId);
	}

	public static void deleteDevice(int deviceId) {

		System.out.println("DeleteUtil - deleteDevice");

		Memory.getInstance().memoryDeleteDevice(deviceId);
	}

	public static boolean validateOrganizationDeletion(int orgId) {
		boolean canDelete = true;

		// TODO
		// check if org has users

		return canDelete;
	}

}
