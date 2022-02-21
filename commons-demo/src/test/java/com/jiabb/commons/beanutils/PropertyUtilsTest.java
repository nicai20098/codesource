package com.jiabb.commons.beanutils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.jiabb.commmons.entity.Address;
import com.jiabb.commmons.entity.Student;
import com.jiabb.commmons.entity.User;
import junit.framework.TestCase;
import org.apache.commons.beanutils.BeanIntrospector;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.IntrospectionContext;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.beanutils.PropertyUtilsBean;
import org.junit.Assert;
import org.junit.Before;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * PropertyUtils 归根结底是对PropertyUtilsBean操作的工具类
 */
public class PropertyUtilsTest extends TestCase {

	private static User user;

	// 初始化数据
	public void init(){
		List<String> friendList = Lists.newArrayList("张三", "李四");
		Map<String, String> tags = Maps.newHashMap();
		tags.put("key1", "value1");
		tags.put("key2", "value2");
		user = new User("id", "name", new Address("address"), friendList, tags);
	}

	/**
	 * |describe(final Object bean) | Map<String, Object> | 属性描述，key属性名，value属性值|
	 * |clearDescriptors() | void | 清空所有属性描述信息|
	 */
	public void testDescribeAndClearDescriptors() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
		init();

		Map<String, Object> describe = PropertyUtils.describe(user);
		Assert.assertEquals(5, describe.size());

		PropertyUtils.clearDescriptors();
	}

	/**
	 * |resetBeanIntrospectors() | void | 重置BeanIntrospector|
	 * |addBeanIntrospector(final BeanIntrospector introspector) | void | 添加一个BeanIntrospector|
	 * |removeBeanIntrospector(final BeanIntrospector introspector) | boolean | 移除BeanIntrospector|
	 */
	public void testIntrospector(){
		//对Introspector的管理
	}

	/**
	 * |copyProperties(final Object dest, final Object orig) | void | 复制属性|
	 */
	public void testCopyProperties() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

		init();
		User userInner = new User();
		PropertyUtils.copyProperties(userInner, user);
		Assert.assertNotEquals(userInner.hashCode(), user.hashCode());
	}

	/**
	 * |getSimpleProperty(final Object bean, final String name) | Object | 返回属性值|
	 * |getProperty(final Object bean, final String name) | Object | 获得属性|
	 * |getIndexedProperty(final Object bean, final String name) | Object | 指定索引属性值，适用于属性是list或者array的情况|
	 * |getIndexedProperty(final Object bean,final String name, final int index) | Object | 指定索引属性值，适用于属性是list或者array的情况|
	 * |getMappedProperty(final Object bean, final String name) | Object | 获得Map属性，适用于属性是Map的情况|
	 * |getMappedProperty(final Object bean,final String name, final String key) | Object | 获得Map属性中指定键对应的值，适用于属性是Map的情况|
	 * |getNestedProperty(final Object bean, final String name) | Object | 获得嵌套属性，属性是对象的情况|
	 */
	public void testGetProperty() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
		init();
		//getSimpleProperty 普通属性获取
		String userId = (String) PropertyUtils.getSimpleProperty(user, "userId");
		Assert.assertEquals("id", userId);
		String name = (String) PropertyUtils.getProperty(user, "name");
		Assert.assertEquals("name", name);

		//getIndexedProperty 指定索引属性值，适用于属性是list或者array的情况
		String friendsNames0 = (String) PropertyUtils.getIndexedProperty(user, "friendsNames[0]");
		String friendsNames1 = (String) PropertyUtils.getIndexedProperty(user, "friendsNames", 1);
		Assert.assertEquals("张三",friendsNames0);
		Assert.assertEquals("李四",friendsNames1);

		//getMappedProperty 适用于属性是Map的情况
		String tag1 = (String) PropertyUtils.getMappedProperty(user, "tag(key1)");
		Assert.assertEquals("value1", tag1);
		String tag2 = (String) PropertyUtils.getMappedProperty(user, "tag", "key2");
		Assert.assertEquals("value2", tag2);

		//getNestedProperty 获取嵌套的对象
		Address address = (Address) PropertyUtils.getNestedProperty(user, "address");
		Assert.assertEquals("address", address.getEmail());

	}

	/**
	 * |getPropertyDescriptor(final Object bean,final String name) | PropertyDescriptor | 获取属性描述|
	 * |getPropertyDescriptors(final Class<?> beanClass) | PropertyDescriptor[] | 获得属性描述|
	 * |getPropertyDescriptors(final Object bean) | PropertyDescriptor[] | 获得属性描述|
	 * |getPropertyEditorClass(final Object bean, final String name) | Class<?> | 获得已为此属性注册的任何显式 PropertyEditor Class|
	 * |getPropertyType(final Object bean, final String name) | Class<?> | 获得属性类型|
	 * |getReadMethod(final PropertyDescriptor descriptor) | Method | 返回一个可访问的属性的getter方法|
	 * |getWriteMethod(final PropertyDescriptor descriptor) | Method | 返回一个可访问的属性的setter方法|
	 */
	public void testPropertyDescriptor(){
		init();



	}



}
