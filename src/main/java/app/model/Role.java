package app.model;

public enum Role {
	ROOT("root"), 
	ADMIN("admin"), 
	EDITOR("editor"), 
	VIEWER("viewer");

	private final String roleName;

	private Role(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return this.roleName;
	}

}
