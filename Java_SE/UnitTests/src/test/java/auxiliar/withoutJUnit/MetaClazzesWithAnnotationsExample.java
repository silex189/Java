package test.java.auxiliar.withoutJUnit;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MetaClazzesWithAnnotationsExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("auxiliar.withoutJUnit.ClazzExample");
			Object object = clazz.getConstructor().newInstance();
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				Annotation[] annotations = method.getDeclaredAnnotations();
				for (Annotation annotation : annotations) {
					if (annotation instanceof AnnotationExample) {
						method.invoke(object);
					}
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}
}
