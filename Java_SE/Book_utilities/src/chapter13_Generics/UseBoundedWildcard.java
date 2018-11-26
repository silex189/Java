package chapter13_Generics;

class A { }

class B extends A { }

class C extends A { }

class D { }

class GenericClass<T> {
	T object;
	
	GenericClass(T object) {
		this.object = object;
	}
	
	static void test(GenericClass<? extends A> object) { }
	
}

public class UseBoundedWildcard {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		GenericClass<A> genericA = new GenericClass<A>(a);
		GenericClass<B> genericB = new GenericClass<B>(b);
		GenericClass<C> genericC = new GenericClass<C>(c);
		GenericClass<D> genericD = new GenericClass<D>(d);
		
		GenericClass.test(genericA);
		GenericClass.test(genericB);
		GenericClass.test(genericC);
		
//		GenericClass.test(genericD);
		
		

	}

}
