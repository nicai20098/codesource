package com.jiabb.commons.beanutils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.jiabb.commmons.entity.Address;
import com.jiabb.commmons.entity.User;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.junit.Assert;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

@Slf4j
public class BeanUtilsTest extends TestCase {

	private static User user;

	// 初始化数据
	public void init() {
		List<String> friendList = Lists.newArrayList("张三", "李四");
		Map<String, String> tags = Maps.newHashMap();
		tags.put("key1", "value1");
		tags.put("key2", "value2");
		user = new User("id", "name", new Address("address"), friendList, tags);
	}

	/**
	 * |static Object | cloneBean(Object bean) | 克隆对象|
	 * |static void | copyProperties(Object dest, Object orig) | 复制属性|
	 * |static void | copyProperty(Object bean, String name, Object value) | 复制属性|
	 */
	public void testCloneAndCopy() throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {
		init();
		User userClone = (User) BeanUtils.cloneBean(user);
		Assert.assertNotEquals(userClone.hashCode(), user.hashCode());

		User userCopyProperties = new User();
		BeanUtils.copyProperty(userCopyProperties, "name", "name1");
		Assert.assertEquals("name1", userCopyProperties.getName());

		BeanUtils.copyProperties(userCopyProperties, user);

	}

	/**
	 * |static <K,V> Map<K,V> | createCache() | 创建缓存|
	 * |static Map<String,String> | describe(Object bean) | 描述|
	 * |static void | populate(Object bean, Map<String,? extends Object> properties) | 将Map中的数据注入到Bean对象中|
	 * |static void | setProperty(Object bean, String name, Object value) | 设置属性值 |
	 */
	public void testCacheDescribePopulateSetProperty() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
		init();
		Map<String, Object> describe = PropertyUtils.describe(user);
		//不建议是使用BeanUtils.describe 会造成了list缺失
		Map<String, String> bean = BeanUtils.describe(user);
		log.info("describe -> {}", describe);
		log.info("bean -> {}", bean);

		User populate = new User();
		BeanUtils.populate(populate, describe);
		log.info("describe -> {}", populate);

		BeanUtils.setProperty(populate, "userId", "newId");
		Assert.assertEquals("newId", populate.getUserId());

	}

	/**
	 * |static String[] | getArrayProperty(Object bean, String name) | 返回指定属性的值，作为字符串数组返回|
	 * |static String | getIndexedProperty(Object bean, String name) | 获取指定索引位置对象作为字符串返回|
	 * |static String | getIndexedProperty(Object bean, String name, int index) | 获取指定索引位置对象作为字符串返回|
	 * |static String | getMappedProperty(Object bean, String name) | 获得Map属性值作为字符串返回|
	 * |static String | getMappedProperty(Object bean, String name, String key) | 获得Map属性中指定键的值作为字符串返回|
	 * |static String | getNestedProperty(Object bean, String name) | 获得嵌套属性作为字符串返回|
	 * |static String | getProperty(Object bean, String name) | 获得属性值作为字符串返回|
	 * |static String | getSimpleProperty(Object bean, String name) | 获得属性值作为字符串返回|
	 */
	public void testGetProperty() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
		init();
		//getSimpleProperty 普通属性获取
		String userId = (String) BeanUtils.getSimpleProperty(user, "userId");
		Assert.assertEquals("id", userId);
		String name = (String) BeanUtils.getProperty(user, "name");
		Assert.assertEquals("name", name);

		//getIndexedProperty 指定索引属性值，适用于属性是list或者array的情况
		String friendsNames0 = BeanUtils.getIndexedProperty(user, "friendsNames[0]");
		String friendsNames1 = BeanUtils.getIndexedProperty(user, "friendsNames", 1);
		Assert.assertEquals("张三", friendsNames0);
		Assert.assertEquals("李四", friendsNames1);

		//getMappedProperty 适用于属性是Map的情况
		String tag1 = BeanUtils.getMappedProperty(user, "tag(key1)");
		Assert.assertEquals("value1", tag1);
		String tag2 = BeanUtils.getMappedProperty(user, "tag", "key2");
		Assert.assertEquals("value2", tag2);

		//getNestedProperty 获取嵌套的对象
		String address = BeanUtils.getNestedProperty(user, "address");
		log.info("address -> {}", address);

	}


}
