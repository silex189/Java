package chapter13_Generics;

class Generic<T> {
	T object;
	
	Generic(T object) {
		this.object = object;
	}
	
	T getObject() {
		return object;
	}
	
	void showType() {
		System.out.println("Type of T is " + object.getClass().getName());
	}
	
}
