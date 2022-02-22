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
| 返回值  | 方法名  | 说明  |
| --- | --- | --- |
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
| 返回值  | 方法名  | 说明  |
| --- | --- | --- |
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

#### BeanUtils
BeanUtils通过反射提供了Bean对象的一些便捷操作方法。
BeanUtils提供的静态方法
| 返回值  | 方法名  | 说明  |
| --- | --- | --- |
|static Object | cloneBean(Object bean) | 克隆对象 |
|static void | copyProperties(Object dest, Object orig) | 复制属性 |
|static void | copyProperty(Object bean, String name, Object value) | 复制属性 |
|static <K,V> Map<K,V> | createCache() | 创建缓存 |
|static Map<String,String> | describe(Object bean) | 描述 |
|static void | populate(Object bean, Map<String,? extends Object> properties) | 将Map中的数据注入到Bean对象中 |
|static void | setProperty(Object bean, String name, Object value) | 设置属性值 |
|static String[] | getArrayProperty(Object bean, String name) | 返回指定属性的值，作为字符串数组返回 |
|static String | getIndexedProperty(Object bean, String name) | 获取指定索引位置对象作为字符串返回 |
|static String | getIndexedProperty(Object bean, String name, int index) | 获取指定索引位置对象作为字符串返回 |
|static String | getMappedProperty(Object bean, String name) | 获得Map属性值作为字符串返回 |
|static String | getMappedProperty(Object bean, String name, String key) | 获得Map属性中指定键的值作为字符串返回 |
|static String | getNestedProperty(Object bean, String name) | 获得嵌套属性作为字符串返回 |
|static String | getProperty(Object bean, String name) | 获得属性值作为字符串返回 |
|static String | getSimpleProperty(Object bean, String name) | 获得属性值作为字符串返回 |
|static boolean | initCause(final Throwable throwable, final Throwable cause) | 对异常来进行包装的 |

#### ConvertUtils
ConvertUtils提供了数据类型相互转换的一些方法。
ConvertUtils静态方法介绍：
| 返回值  | 方法名  | 说明  |
| --- | --- | --- |
|static String | convert(Object value) | 将对象转换为字符串 |
|static Object | convert(Object value, Class<?> targetType) | 将对象转换为指定数据类型对象 |
|static Object | convert(String[] values, Class<?> clazz) | 将数组转换为指定数据类型对象 |
|static Object | convert(String value, Class<?> clazz) | 将字符串转换为指定数据类型对象 |
|static void | deregister() | 移除所有已经注册的转换器 |
|static void | deregister(Class<?> clazz)	移除指定类型的转换器 |
|static Converter | lookup(Class<?> clazz)	查找指定类型的转换器 |
|static Converter | lookup(Class<?> sourceType, Class<?> targetType) | 查找将指定类型转换为另一种类型的转换器 |
|static void | register(Converter converter, Class<?> clazz) | 注册转换器 |
|static Class<T> | primitiveToWrapper(final Class<T> type) | 基本类型转换成包装类 |

### commons-codec
commons-codec是Apache开源组织提供的用于摘要运算、编码解码的包。常见的编码解码工具Base64、MD5、Hex、SHA1、DES等。

### Commons CLI
Apache Commons CLI 库提供API，可以帮助程序去解析传递给程序的命令行参数。它也可以打印帮助信息，来说明可以运用于命令行的有效参数。
CLI库支持不同格式的选项：
  - OSIX格式的选项（比如：tar -zxvf foo.tar.gz）
  - GNU格式的长参数选项（比如：du --human-readable --max-depth=1）
  - Java格式的属性（比如：java -Djava.awt.headless=true -Djava.net.useSystemProxies=true Foo）
  - 带值的单选项（比如：gcc -O2 foo.c）
  - 单-号的长参数选项（比如：ant -projecthelp）
Commons CLI提供了解析命令行参数的API，命令行的处理共分为三个阶段：定义阶段、解析阶段和审讯阶段。它也可以在命令行打印详细的参数信息

#### CLI定义阶段
Apache Commons CLI使用Options这个类来定义和设置参数，它是所有参数的容器。它提供了下面几种方法添加参数：
```java
addOption(Option opt);
addOption(String opt, boolean hasArg, String desc);
addOption(String opt, String desc);
addOption(String opt, String longOpt, boolean hasArg, String desc);
```
第二和第三个方法用于添加短名称（或名称缩写）参数，第四个方法还提供了长名称参数。而其中的boolean参数为true时，当调用getOptionValue()方法时，可以返回对应的参数只；反之，为false时，返回null。

其中，第一个方法要更复杂些。需要先创建一个Option对象，Option对象是由OptionBuilder创建的。如：
```java
Option filsOption = OptionBuilder.withArgName("args")
					.withLongOpt("files"
					.hasArgs(2)
					.withValuesSeparator(',')
					.withDescription("file Names")
					.create("f"));
```
hasArgs()方法指定参数后有几个值，withValueSeparator(char seq)指定参数值之间的分隔符。
在定义阶段，我们需要使用Options类来定义我们需要使用的命令。
方法摘要：
| 返回值  | 方法名  | 说明  |
| --- | --- | --- |
| Options | addOption(Option opt) | 添加一个选项实例 |
| Options | addOption(String opt, boolean hasArg, String description) | 添加一个只包含短名称的选项 |
| Options | addOption(String opt, String description) | 添加一个只包含短名称的选项 |
| Options | addOption(String opt, String longOpt, boolean hasArg, String description) | 添加一个包含短名称和长名称的选项 |
| Options | addOptionGroup(OptionGroup group) | 添加一个选项组 |
| List<String> | getMatchingOptions(String opt) | 获得匹配选项的长名称集合 |
| Option | getOption(String opt) | 通过长名称或短名称获得选项 |
| OptionGroup | getOptionGroup(Option opt) | 获得选项所在的选项组 |
| Collection | getOptions() | 获得一个只读的选项集合 |
| List | getRequiredOptions() | 获得必须的选项集合 |
| boolean | hasLongOption(String opt) | 判断是否存在选项 |
| boolean | hasOption(String opt) | 判断是否存在选项 |
| boolean | hasShortOption(String opt) | 判断是否存在选项 |

#### CLI解析阶段
在解析阶段中，通过命令行传入应用程序的文本来进行处理。处理过程将根据在解析器的实现过程中定义的规则来进行。Commons CLI提供了一个接口CommandLineParser，而且分别实现了下面几种解析器，用于不同的场景：
> DefaultParser：提供了很基础的解析功能，只能解析基础的命令行参数。
BasicParser：提供了基础的解析功能，能解析简单的命令行参数。
PosixParser：提供了解析POSIX形式参数的功能。
GnuParser：提供了解析长参数及Java命令中参数的功能。

示例：
  CommandLineParser parser = new PosixParser();
  CommandLine cli = parser.parse(options, args);

在解析阶段，我们需要使用DefaultParser来解析命令行参数。DefaultParser实现了CommandLineParser接口，解析命令行参数完成后会返回CommandLine对象，在审讯阶段，我们就需要CommandLine对象来完成我们实际的工作。

部分方法摘要：
| 返回值  | 方法名  | 说明  |
| --- | --- | --- |
| List | getArgList() | 获得参数集合 |
| String[] | getArgs() | 获得参数数组 |
| Option[] | getOptions() | 获得选项数组 |
| String | getOptionValue(char opt) | 获得选项值 |
| String | getOptionValue(char opt, String defaultValue) | 获得选项值 |
| String | getOptionValue(String opt) | 获得选项值 |
| String | getOptionValue(String opt, String defaultValue) | 获得选项值 |
| boolean | hasOption(char opt) | 判断是否含有选项 |
| boolean | hasOption(String opt) | 判断是否含有选项 |

#### CLI询问阶段
在询问阶段中，应用程序通过查询 CommandLine，并通过其中的布尔参数和提供给应用程序的参数值来决定需要执行哪些程序分支。这个阶段在用户的代码中实现，CommandLine 中的访问方法为用户代码提供了 CLI 的询问能力。
CLI 询问阶段的目标结果就是将所有通过命令行以及处理参数过程中得到的文本信息传递给用户的代码。
```java
if(cli.hasOption("h")) {
	HelpFormatter hf = new HelpFormatter();
	hf.printHelp("options", options);
}
```

