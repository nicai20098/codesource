package com.jiabb.commons.beanutils;

import com.jiabb.commmons.entity.Student;
import com.jiabb.commmons.entity.User;
import junit.framework.TestCase;
import org.apache.commons.beanutils.ConstructorUtils;
import org.junit.Assert;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorUtilsTest extends TestCase {

	/**
	 * |invokeConstructor(final Class<T> klass, final Object arg) | T | 执行构造方法 |
	 * |invokeConstructor(final Class<T> klass, Object[] args) | T | 执行构造方法 |
	 * |invokeConstructor(final Class<T> klass,Object[] args,Class<?>[] parameterTypes) | T | 执行构造方法 |
	 */
	public void testInvokeConstructor() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {

		Student stuId = ConstructorUtils.invokeConstructor(Student.class, "stuId");
		Assert.assertEquals("stuId", stuId.getStudentId());

		User user = ConstructorUtils.invokeConstructor(User.class, new Object[]{"id", "name"});
		Assert.assertEquals("id", user.getUserId());
	}

	/**
	 * |invokeExactConstructor(final Class<T> klass, final Object arg) | T | 执行构造方法 |
	 * |invokeExactConstructor(final Class<T> klass, Object[] args) | T | 执行构造方法 |
	 * |invokeExactConstructor(final Class<T> klass,Object[] args,Class<?>[] parameterTypes) | T | 执行构造方法 |
	 */
	public void testInvokeExactConstructor() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
		Student stuId = ConstructorUtils.invokeExactConstructor(Student.class, "stuId");
		Assert.assertEquals("stuId", stuId.getStudentId());

		User user = ConstructorUtils.invokeExactConstructor(User.class, new Object[]{"id", "name"});
		Assert.assertEquals("id", user.getUserId());
	}

	/**
	 * |getAccessibleConstructor(final Class<T> klass,final Class<?> parameterType) | Constructor<T> | 获得含有一个形参的构造方法 |
	 * |getAccessibleConstructor(final Class<T> klass,final Class<?>[] parameterTypes) | Constructor<T> | 获得含有指定类型形参的构造方法 |
	 * |getAccessibleConstructor(final Constructor<T> ctor) | Constructor<T> | 获得可访问构造方法 |
	 */
	public void testAccessibleConstructor() throws InvocationTargetException, InstantiationException, IllegalAccessException {

		Constructor<User> accessibleConstructor = ConstructorUtils.getAccessibleConstructor(User.class, new Class<?>[]{String.class, String.class});
		User user = accessibleConstructor.newInstance("id", "name");
		Assert.assertEquals("id", user.getUserId());
	}

}
