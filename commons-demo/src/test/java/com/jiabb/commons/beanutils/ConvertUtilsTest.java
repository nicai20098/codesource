package com.jiabb.commons.beanutils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.jiabb.commmons.entity.Address;
import com.jiabb.commmons.entity.User;
import junit.framework.TestCase;
import org.apache.commons.beanutils.ConvertUtils;

import java.util.List;
import java.util.Map;
public class ConvertUtilsTest extends TestCase {

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
	 * |static String | convert(Object value) | 将对象转换为字符串 |
	 * |static Object | convert(Object value, Class<?> targetType) | 将对象转换为指定数据类型对象 |
	 * |static Object | convert(String[] values, Class<?> clazz) | 将数组转换为指定数据类型对象 |
	 * |static Object | convert(String value, Class<?> clazz) | 将字符串转换为指定数据类型对象 |
	 */
	public void testConvert(){
		init();
		//类似于toString
		String convert = ConvertUtils.convert(user);
		System.out.println(convert);

	}


}
