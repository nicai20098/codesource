## commons相关依赖包使用示例

### commons-beanutils
#### MethodUtils
MethodUtils通过反射访问对象的方法并且执行方法。
| 返回值  | 方法名  | 说明  |
| --- | --- | --- |
|static | int  | clearCache() |	清空方法缓存 |
|static | Method | getAccessibleMethod(Class<?> clazz, Method method) | 返回一个可访问的方法 |
|static | Method | getAccessibleMethod(Class<?> clazz, String methodName, Class<?> parameterType) | 返回一个可访问的方法 |
|static | Method | getAccessibleMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) | 返回一个可访问的方法 |
|static | Method | getAccessibleMethod(Method method) | 返回一个可访问的方法 |
|static | Method | getMatchingAccessibleMethod(Class<?> clazz, String methodName, Class<?>[] parameterTypes) | 查找与方法名及参数匹配的可访问方法 |
|static | Class<?> | getPrimitiveType(Class<?> wrapperType) | 获得包装类的基本数据类型 |
|static | Class<?> | getPrimitiveWrapper(Class<?> primitiveType) | 获得基本数据类型的包装类型 |
|static | Object | invokeExactMethod(Object object, String methodName, Object arg) | 执行方法 |
|static | Object | invokeExactMethod(Object object, String methodName, Object[] args) | 执行方法 |
|static | Object | invokeExactMethod(Object object, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行方法 |
|static | Object | invokeExactStaticMethod(Class<?> objectClass, String methodName, Object arg) | 执行静态方法 |
|static | Object | invokeExactStaticMethod(Class<?> objectClass, String methodName, Object[] args) | 执行静态方法 |
|static | Object | invokeExactStaticMethod(Class<?> objectClass, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行静态方法 |
|static | Object | invokeMethod(Object object, String methodName, Object arg) | 执行方法 |
|static | Object | invokeMethod(Object object, String methodName, Object[] args) | 执行方法 |
|static | Object | invokeMethod(Object object, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行方法 |
|static | Object | invokeStaticMethod(Class<?> objectClass, String methodName, Object arg) | 执行静态方法 |
|static | Object | invokeStaticMethod(Class<?> objectClass, String methodName, Object[] args) | 执行静态方法 |
|static | Object | invokeStaticMethod(Class<?> objectClass, String methodName, Object[] args, Class<?>[] parameterTypes) | 执行静态方法 |
|static | boolean | isAssignmentCompatible(Class<?> parameterType, Class<?> parameterization) | 确定是否可以使用一个类型作为方法调用参数 |
|static | void | setCacheMethods(boolean cacheMethods) | 设置缓存方法 |
|static | Class<?> | toNonPrimitiveClass(Class<?> clazz) | 如果是简单数据类型则返回对应的包装类，否则返回本身 |

#### ConstructorUtils
ConstructorUtils通过反射对对象的构造方法做各种操作。
ConstructorUtils提供的静态方法：
|invokeConstructor(final Class<T> klass, final Object arg) | T | 执行构造方法 |
|invokeConstructor(final Class<T> klass, Object[] args) | T | 执行构造方法 |
|invokeConstructor(final Class<T> klass,Object[] args,Class<?>[] parameterTypes) | T | 执行构造方法 |
|invokeExactConstructor(final Class<T> klass, final Object arg) | T | 执行构造方法 |
|invokeExactConstructor(final Class<T> klass, Object[] args) | T | 执行构造方法 |
|invokeExactConstructor(final Class<T> klass,Object[] args,Class<?>[] parameterTypes) | T | 执行构造方法 |
|getAccessibleConstructor(final Class<T> klass,final Class<?> parameterType) | Constructor<T> | 获得含有一个形参的构造方法 |
|getAccessibleConstructor(final Class<T> klass,final Class<?>[] parameterTypes) | Constructor<T> | 获得含有指定类型形参的构造方法 |
|getAccessibleConstructor(final Constructor<T> ctor) | Constructor<T> | 获得可访问构造方法 |

#### PropertyUtils
PropertyUtils通过反射对对象的属性做各种操作。
PropertyUtils提供的静态方法
|describe(final Object bean) | Map<String, Object> | 属性描述，key属性名，value属性值|
|clearDescriptors() | void | 清空所有属性描述信息|
|resetBeanIntrospectors() | void | 重置BeanIntrospector|
|addBeanIntrospector(final BeanIntrospector introspector) | void | 添加一个BeanIntrospector|
|removeBeanIntrospector(final BeanIntrospector introspector) | boolean | 移除BeanIntrospector|
|copyProperties(final Object dest, final Object orig) | void | 复制属性|
|getIndexedProperty(final Object bean, final String name) | Object | 指定索引属性值，适用于属性是list或者array的情况|
|getIndexedProperty(final Object bean,final String name, final int index) | Object | 指定索引属性值，适用于属性是list或者array的情况|
|getMappedProperty(final Object bean, final String name) | Object | 获得Map属性，适用于属性是Map的情况|
|getMappedProperty(final Object bean,final String name, final String key) | Object | 获得Map属性中指定键对应的值，适用于属性是Map的情况|
|getNestedProperty(final Object bean, final String name) | Object | 获得嵌套属性，属性是对象的情况|
|getProperty(final Object bean, final String name) | Object | 获得属性|
|getPropertyDescriptor(final Object bean,final String name) | PropertyDescriptor | 获取属性描述|
|getPropertyDescriptors(final Class<?> beanClass) | PropertyDescriptor[] | 获得属性描述|
|getPropertyDescriptors(final Object bean) | PropertyDescriptor[] | 获得属性描述|
|getPropertyEditorClass(final Object bean, final String name) | Class<?> | 获得已为此属性注册的任何显式 PropertyEditor Class|
|getPropertyType(final Object bean, final String name) | Class<?> | 获得属性类型|
|getReadMethod(final PropertyDescriptor descriptor) | Method | 返回一个可访问的属性的getter方法|
|getSimpleProperty(final Object bean, final String name) | Object | 返回属性值|
|getWriteMethod(final PropertyDescriptor descriptor) | Method | 返回一个可访问的属性的setter方法|
|isReadable(final Object bean, final String name) | boolean | 判断是否为可读属性|
|isWriteable(final Object bean, final String name) | boolean | 判断是否为可写属性|
|setIndexedProperty(final Object bean, final String name,final Object value) | void | 设置指定索引属性值，适用于属性是list或者array的情况|
|setIndexedProperty(final Object bean, final String name, final int index, final Object value) | void | 设置指定索引属性值，适用于属性是list或者array的情况|
|setMappedProperty(final Object bean, final String name,final Object value) | void | 设置Map属性的值|
|setMappedProperty(final Object bean, final String name, final String key, final Object value) | void | 设置Map属性的值|
|setNestedProperty(final Object bean, final String name, final Object value) | void | 设置嵌套属性的值|
|setProperty(final Object bean, final String name, final Object value) | void | 设置属性值|
|setSimpleProperty(final Object bean, final String name, final Object value) | void | 设置属性值|