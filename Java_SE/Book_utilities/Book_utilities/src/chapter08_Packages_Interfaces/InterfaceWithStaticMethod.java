package chapter08_Packages_Interfaces;

public interface InterfaceWithStaticMethod {

	int getUserID();

	default int getAdminID() {
		return 1;
	}

	static int getUniversalID() {
		return 0;
	}
}
