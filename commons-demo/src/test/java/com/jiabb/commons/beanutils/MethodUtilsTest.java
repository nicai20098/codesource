package com.jiabb.commons.beanutils;

import com.jiabb.commmons.entity.Student;
import com.jiabb.commmons.entity.User;
import junit.framework.TestCase;
import org.apache.commons.beanutils.MethodUtils;
import org.junit.Assert;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodUtilsTest extends TestCase {

	/**
	 * 清空方法缓存
	 */
  public void testClearCache(){
	  int i = MethodUtils.clearCache();
	  Assert.assertEquals(0, i);
  }

	/**
	 |static | Method | getAccessibleMethod(Class<?> clazz, Method method) | 返回一个可访问的方法 |
	 |static | Method | getAccessibleMethod(Class<?> clazz, String methodName, Class<?> parameterType) | 返回一个可访问的方法 |
	 |static | Method | getAccessibleMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) | 返回一个可访问的方法 |
	 |static | Method | getAccessibleMethod(Method method) | 返回一个可访问的方法 |
	 |static | Method | getMatchingAccessibleMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) | 查找与方法名及参数匹配的可访问方法 |
	 */
	public void testGetAccessibleMethod() throws InvocationTargetException, IllegalAccessException {
		User user = new User();
		Method setName = MethodUtils.getAccessibleMethod(User.class, "setName", String.class);
		setName.invoke(user, "name");
		Assert.assertEquals("name", user.getName());
		int i = MethodUtils.clearCache();
		Assert.assertEquals(1, i);
	}

	/**
	 * |static | Class<?> | getPrimitiveType(Class<?> wrapperType) | 获得包装类的基本数据类型 |
	 * |static | Class<?> | getPrimitiveWrapper(Class<?> primitiveType) | 获得基本数据类型的包装类型 |
	 */
	public void testPrimitive(){
		Class<?> beal = MethodUtils.getPrimitiveType(Boolean.class);
		Assert.assertEquals(Boolean.TYPE, beal);
		Class<?> wrapper = MethodUtils.getPrimitiveWrapper(Long.TYPE);
		Assert.assertEquals(Long.class, wrapper);
	}

	/**
	 * |static | Object | invokeExactMethod(Object object, String methodName, Object arg) | 执行方法 |
	 * |static | Object | invokeExactMethod(Object object, String methodName, Object[] args) | 执行方法 |
	 * |static | Object | invokeExactMethod(Object object, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行方法 |
	 */
	public void testInvokeExactMethod() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
		User user = new User();
		MethodUtils.invokeExactMethod(user, "setName", "name1");
		Assert.assertEquals("name1",user.getName());
		MethodUtils.invokeExactMethod(user, "setUserId", new Object[]{"id"}, new Class[]{String.class});
		Assert.assertEquals("id", user.getUserId());
	}

	/**
	 * |static | Object | invokeExactStaticMethod(Class<?> objectClass, String methodName, Object arg) | 执行静态方法 |
	 * |static | Object | invokeExactStaticMethod(Class<?> objectClass, String methodName, Object[] args) | 执行静态方法 |
	 * |static | Object | invokeExactStaticMethod(Class<?> objectClass, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行静态方法 |
	 */
	public void testInvokeExactStaticMethod() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
		MethodUtils.invokeExactStaticMethod(User.class, "updateStatus", "1");
		Assert.assertEquals("1", User.status);
	}


	/**
	 * |static | Object | invokeMethod(Object object, String methodName, Object arg) | 执行方法 |
	 * |static | Object | invokeMethod(Object object, String methodName, Object[] args) | 执行方法 |
	 * |static | Object | invokeMethod(Object object, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行方法 |
	 */
	public void testInvokeMethod() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
		User user = new User();
		MethodUtils.invokeMethod(user, "setName", "name") ;
		Assert.assertEquals("name", user.getName());
	}

	/**
	 * |static | Object | invokeStaticMethod(Class<?> objectClass, String methodName, Object arg) | 执行静态方法 |
	 * |static | Object | invokeStaticMethod(Class<?> objectClass, String methodName, Object[] args) | 执行静态方法 |
	 * |static | Object | invokeStaticMethod(Class<?> objectClass, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行静态方法 |
	 */
	public void testInvokeStaticMethod() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
		MethodUtils.invokeExactStaticMethod(User.class, "updateStatus", "1");
		Assert.assertEquals("1", User.status);
	}

	/**
	 * |static | boolean | isAssignmentCompatible(Class<?> parameterType, Class<?> parameterization) | 确定是否可以使用一个类型作为方法调用参数 |
	 */
	public void testIsAssignmentCompatible(){
		boolean assignmentCompatible = MethodUtils.isAssignmentCompatible(Student.class, User.class);
		Assert.assertFalse(assignmentCompatible);

	}

	/**
	 * |static | void | setCacheMethods(boolean cacheMethods) | 设置缓存方法 |
	 */
	public void testSetCacheMethods(){
		//此方法会清空缓存
		MethodUtils.setCacheMethods(false);
	}



}
