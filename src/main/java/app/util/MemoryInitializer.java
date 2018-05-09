package app.util;

import app.model.Device;
import app.model.Organization;
import app.model.User;

public final class MemoryInitializer {

	private MemoryInitializer() {

	}

	public static void initializeMemoryBasicData() {

		// create org
		Organization org1 = new Organization();
		org1.setOrgId(111);
		org1.setOrgName("BaseOrg");

		// create user
		User usr1 = new User();
		usr1.setUserId(222222);
		usr1.setUsername("baseuser");
		usr1.setOrgId(111);

		// create device
		Device dev1 = new Device();
		dev1.setDeviceId(333333333);
		dev1.setDeviceModel("newModel");
		dev1.setDeviceName("myDevice");
		dev1.setDeviceType("sensor");
		dev1.setOwnerUserId(222222);

		Memory.getInstance().memoryAddOrganization(org1);
		Memory.getInstance().memoryAddUser(usr1);
		Memory.getInstance().memoryAddDevice(dev1);

	}

}
