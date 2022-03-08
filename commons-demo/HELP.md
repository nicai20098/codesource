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

### Commons IO
#### 简介
Commons IO是针对开发IO流功能的工具类库。
主要包括六个区域：
- Utility classes – 工具类，包括一些静态方法来执行常用任务
- Input – 输入，InputStream 和 Reader 实现
- Output – 输出，OutputStream 和 Writer 实现
- Filters – 过滤器，多种文件过滤器实现(定义了 IOFileFilter接口,同时继承了 FileFilter 和FilenameFilter 接口)
- Comparators – 比较器，用于文件比较的多种java.util.Comparatot实现
- File Monitor–文件监控

#### 常用工具类
- IOUtils 包含一些工具类,用于处理读,写和拷贝,这些方法基于 InputStream, OutputStream, Reader 和 Writer工作.
- FileUtils 包含一些工具类,它们基于File对象工作，包括读，写，拷贝和比较文件
- FilenameUtils包含一些工具类,它们基于文件名工作而不是File对象。这个类旨在 在Unix和Windows环境下保持一致,帮助在两个环境下过渡(如从开发环境到生成环境)
- FileSystemUtils包含一些工具类，基于文件系统访问功能不被JDK支持。目前，只有一个方法就是得到驱动器空余空间。注意这使用命令行而不是 native code。
- EndianUtils 包含静态方法来交换Java基本类型和流的字节序
- SwappedDataInputStream实现了DataInput接口。可以从文件中读取非本地字节序。

##### IOUtils
IOUtils.copy(InputStream input, OutputStream output) // 此方法有多个重载方法，满足不同的输入输出流
IOUtils.copy(InputStream input, OutputStream output, int bufferSize)
IOUtils.copy(InputStream input, Writer output, String inputEncoding)
IOUtils.copy(Reader input, Writer output)
IOUtils.copy(Reader input, OutputStream output, String outputEncoding)
// 这个方法适合拷贝较大的数据流，比如2G以上
IOUtils.copyLarge(Reader input, Writer output) // 默认会用1024*4的buffer来读取
IOUtils.copyLarge(Reader input, Writer output, char[] buffer)

IOUtils.toInputStream(String input, String encoding) // 通过文本获取输入流 ， 可以指定编码格式
IOUtils.toInputStream(String input, Charset encoding)
IOUtils.toBufferedInputStream(InputStream input) // 获取一个缓冲输入流，默认缓冲大小 1KB
IOUtils.toBufferedInputStream(InputStream input, int size) // 获取一个指定缓冲流的大小的输入流
IOUtils.toBufferedReader(Reader reader) // 获取一个字符缓冲流
IOUtils.toBufferedReader(Reader reader, int size)

// 获取缓冲流
IOUtils.buffer(InputStream inputStream)
IOUtils.buffer(OutputStream outputStream)
IOUtils.buffer(Reader reader)
IOUtils.buffer(Writer writer)

// 将输入流转换成字符串
IOUtils.toString(Reader input)
IOUtils.toString(byte[] input, String encoding)
IOUtils.toString(InputStream input, Charset encoding)
IOUtils.toString(InputStream input, String encoding)
IOUtils.toString(URI uri, String encoding)
IOUtils.toString(URL url, String encoding)

// 将输入流转换成字符数组
IOUtils.toByteArray(InputStream input)
IOUtils.toByteArray(InputStream input, int size)
IOUtils.toByteArray(URI uri)
IOUtils.toByteArray(URL url)
IOUtils.toByteArray(URLConnection urlConn)
IOUtils.toByteArray(Reader input, String encoding)

// 字符串读写
IOUtils.readLines(Reader input)
IOUtils.readLines(InputStream input, Charset encoding)
IOUtils.readLines(InputStream input, String encoding)
IOUtils.writeLines(Collection<?> lines, String lineEnding, Writer writer)
IOUtils.writeLines(Collection<?> lines, String lineEnding, OutputStream output, Charset encoding)
IOUtils.writeLines(Collection<?> lines, String lineEnding, OutputStream output, String encoding)

// 从一个流中读取内容
IOUtils.read(InputStream input, byte[] buffer)
IOUtils.read(InputStream input, byte[] buffer, int offset, int length) IOUtils.read(Reader input, char[] buffer)
IOUtils.read(Reader input, char[] buffer, int offset, int length)

// 把数据写入到输出流中
IOUtils.write(byte[] data, OutputStream output)
IOUtils.write(byte[] data, Writer output, Charset encoding)
IOUtils.write(byte[] data, Writer output, String encoding)
IOUtils.write(char[] data, Writer output)
IOUtils.write(char[] data, OutputStream output, Charset encoding) IOUtils.write(char[] data, OutputStream output, String encoding)
IOUtils.write(String data, Writer output)
IOUtils.write(CharSequence data, Writer output)

// 从一个流中读取内容，如果读取的长度不够，就会抛出异常
IOUtils.readFully(InputStream input, int length)
IOUtils.readFully(InputStream input, byte[] buffer)
IOUtils.readFully(InputStream input, byte[] buffer, int offset, int length) IOUtils.readFully(Reader input, char[] buffer)
IOUtils.readFully(Reader input, char[] buffer, int offset, int length)

IOUtils.contentEquals(InputStream input1, InputStream input2) // 比较两个流是否相等
IOUtils.contentEquals(Reader input1, Reader input2)
IOUtils.contentEqualsIgnoreEOL(Reader input1, Reader input2) // 比较两个流，忽略换行符
IOUtils.skip(InputStream input, long toSkip) // 跳过指定长度的流
IOUtils.skip(Reader input, long toSkip)
IOUtils.skipFully(InputStream input, long toSkip) // 如果忽略的长度大于现有的长度，就会抛出异常
IOUtils.skipFully(Reader input, long toSkip)
// 读取流，返回迭代器
IOUtils.lineIterator(Reader reader)
IOUtils.lineIterator(InputStream input, Charset encoding)
IOUtils.lineIterator(InputStream input, String encoding)
// 关闭流
IOUtils.close(URLConnection conn)
##### FileUtils

// 复制文件夹
FileUtils.copyDirectory(File srcDir, File destDir) // 复制文件夹（文件夹里面的文件内容也会复制）
FileUtils.copyDirectory(File srcDir, File destDir, FileFilter filter) // 复制文件夹，带有文件过滤功能
FileUtils.copyDirectoryToDirectory(File srcDir, File destDir) // 以子目录的形式将文件夹复制到到另一个文件夹下

// 复制文件
FileUtils.copyFile(File srcFile, File destFile) // 复制文件
FileUtils.copyFile(File input, OutputStream output) // 复制文件到输出流
FileUtils.copyFileToDirectory(File srcFile, File destDir) // 复制文件到一个指定的目录
FileUtils.copyInputStreamToFile(InputStream source, File destination) // 把输入流里面的内容复制到指定文件
FileUtils.copyURLToFile(URL source, File destination) // 把URL 里面内容复制到文件(可以下载文件)
FileUtils.copyURLToFile(URL source, File destination, int connectionTimeout, int readTimeout)

// 把字符串写入文件
FileUtils.writeStringToFile(File file, String data, String encoding)
FileUtils.writeStringToFile(File file, String data, String encoding, boolean append)

// 把字节数组写入文件
FileUtils.writeByteArrayToFile(File file, byte[] data)
FileUtils.writeByteArrayToFile(File file, byte[] data, boolean append) FileUtils.writeByteArrayToFile(File file, byte[] data, int off, int len) FileUtils.writeByteArrayToFile(File file, byte[] data, int off, int len, boolean append)

// 把集合里面的内容写入文件
// encoding：文件编码，lineEnding：每行以什么结尾
FileUtils.writeLines(File file, Collection<?> lines)
FileUtils.writeLines(File file, Collection<?> lines, boolean append)
FileUtils.writeLines(File file, Collection<?> lines, String lineEnding)
FileUtils.writeLines(File file, Collection<?> lines, String lineEnding, boolean append)
FileUtils.writeLines(File file, String encoding, Collection<?> lines)
FileUtils.writeLines(File file, String encoding, Collection<?> lines, boolean append)
FileUtils.writeLines(File file, String encoding, Collection<?> lines, String lineEnding)
FileUtils.writeLines(File file, String encoding, Collection<?> lines, String lineEnding, boolean append)

// 往文件里面写内容
FileUtils.write(File file, CharSequence data, Charset encoding)
FileUtils.write(File file, CharSequence data, Charset encoding, boolean append)
FileUtils.write(File file, CharSequence data, String encoding)
FileUtils.write(File file, CharSequence data, String encoding, boolean append)

// 文件移动
FileUtils.moveDirectory(File srcDir, File destDir) // 文件夹在内的所有文件都将移动FileUtils.moveDirectoryToDirectory(File src, File destDir, boolean createDestDir) // 以子文件夹的形式移动到另外一个文件下
FileUtils.moveFile(File srcFile, File destFile) // 移动文件
FileUtils.moveFileToDirectory(File srcFile, File destDir, boolean createDestDir) // 以子文件的形式移动到另外一个文件夹下
FileUtils.moveToDirectory(File src, File destDir, boolean createDestDir) // 移动文件或者目录到指定的文件夹内

// 清空和删除文件夹
FileUtils.deleteDirectory(File directory) // 删除文件夹，包括文件夹和文件夹里面所有的文件
FileUtils.cleanDirectory(File directory) // 清空文件夹里面的所有的内容
FileUtils.forceDelete(File file) // 删除，会抛出异常
FileUtils.deleteQuietly(File file) // 删除，不会抛出异常

// 创建文件夹
FileUtils.forceMkdir(File directory) // 创建文件夹(可创建多级)
FileUtils.forceMkdirParent(File file) // 创建文件的父级目录

// 获取文件输入/输出流
FileUtils.openInputStream(File file)
FileUtils.openOutputStream(File file)

// 读取文件
FileUtils.readFileToByteArray(File file) // 把文件读取到字节数组
FileUtils.readFileToString(File file, Charset encoding) // 把文件读取成字符串
FileUtils.readFileToString(File file, String encoding)
FileUtils.readLines(File file, Charset encoding) // 把文件读取成字符串集合
FileUtils.readLines(File file, String encoding)

// 测试两个文件的修改时间
FileUtils.isFileNewer(File file, Date date)
FileUtils.isFileNewer(File file, File reference)
FileUtils.isFileNewer(File file, long timeMillis)
FileUtils.isFileOlder(File file, Date date)
FileUtils.isFileOlder(File file, File reference)
FileUtils.isFileOlder(File file, long timeMillis)

// 文件/文件夹的迭代
FileUtils.iterateFiles(File directory, IOFileFilter fileFilter, IOFileFilter dirFilter)
FileUtils.iterateFiles(File directory, String[] extensions, boolean recursive)
FileUtils.iterateFilesAndDirs(File directory, IOFileFilter fileFilter, IOFileFilter dirFilter)
FileUtils.lineIterator(File file)
FileUtils.lineIterator(File file, String encoding)

FileUtils.listFiles(File directory, IOFileFilter fileFilter, IOFileFilter dirFilter)
FileUtils.listFiles(File directory, String[] extensions, boolean recursive)
FileUtils.listFilesAndDirs(File directory, IOFileFilter fileFilter, IOFileFilter dirFilter)

// 其他
FileUtils.isSymlink(File file) // 判断是否是符号链接
FileUtils.directoryContains(File directory, File child) // 判断文件夹内是否包含某个文件或者文件夹
FileUtils.sizeOf(File file) // 获取文件或者文件夹的大小
FileUtils.getTempDirectory()// 获取临时目录文件
FileUtils.getTempDirectoryPath()// 获取临时目录路径
FileUtils.getUserDirectory()// 获取用户目录文件
FileUtils.getUserDirectoryPath()// 获取用户目录路径
FileUtils.touch(File file) // 创建文件
FileUtils.contentEquals(File file1, File file2) // 比较两个文件内容是否相同

##### FilenameUtils
FilenameUtils.concat(String basePath, String fullFilenameToAdd) // 合并目录和文件名为文件全路径
FilenameUtils.getBaseName(String filename) // 去除目录和后缀后的文件名
FilenameUtils.getExtension(String filename) // 获取文件的后缀
FilenameUtils.getFullPath(String filename) // 获取文件的目录
FilenameUtils.getName(String filename) // 获取文件名
FilenameUtils.getPath(String filename) // 去除盘符后的路径
FilenameUtils.getPrefix(String filename) // 盘符
FilenameUtils.indexOfExtension(String filename) // 获取最后一个.的位置
FilenameUtils.indexOfLastSeparator(String filename) // 获取最后一个/的位置
FilenameUtils.normalize(String filename) // 获取当前系统格式化路径
FilenameUtils.removeExtension(String filename) // 移除文件的扩展名
FilenameUtils.separatorsToSystem(String path) // 转换分隔符为当前系统分隔符
FilenameUtils.separatorsToUnix(String path) // 转换分隔符为linux系统分隔符
FilenameUtils.separatorsToWindows(String path) // 转换分隔符为windows系统分隔符
FilenameUtils.equals(String filename1, String filename2) // 判断文件路径是否相同，非格式化
FilenameUtils.equalsNormalized(String filename1, String filename2) // 判断文件路径是否相同，格式化
FilenameUtils.directoryContains(String canonicalParent, String canonicalChild) // 判断目录下是否包含指定文件或目录
FilenameUtils.isExtension(String filename, String extension) // 判断文件扩展名是否包含在指定集合(数组、字符串)中
FilenameUtils.wildcardMatch(String filename, String wildcardMatcher) // 判断文件扩展名是否和指定规则匹配

##### FileSystemUtils
// 仅有这一个方法，及其重载方法
FileSystemUtils.freeSpaceKb() throws IOException
//推荐使用
java.nio.file.FileStore.getUsableSpace()

##### 输入、输出
在org.apache.commons.io.input包下有许多InputStrem类的实现，我们来测试一个最实用的类，TeeInputStream，将InputStream以及OutputStream作为参数传入其中，自动实现将输入流的数据读取到输出流中。
同样，在 org.apache.commons.io.output包中同样有OutputStream类的实现，这里介绍TeeOutputStream，它可以将输出流进行分流，换句话说我们可以用一个输入流将数据分别读入到两个不同的输出流。

##### Filters过滤器
1. 基本功能过滤器
   类型：
    - FileFileFilter       仅接受文件
    - DirectoryFilter          仅接受目录
      名称：
    - PrefixFileFilter          基于前缀（不带路径的文件名)
    - SuffixFileFilter          基于后缀(不带路径的文件名)=
    - NameFileFilter         基于文件名称(不带路径的文件名)
    - WildcardFileFilter 基于通配符(不带路径的文件名)
    - RegexFileFilter         基于正则表达式
      时间：
    - AgeFileFilter       基于最后修改时间
    - MagicNumberFileFileter   基于Magic Number
      大小：
    - EmptyFileFilter         基于文件或目录是否为空
    - SizeFileFilter      基于文件尺寸
      隐藏属性：
    - HiddenFileFilter   基于文件或目录是否隐藏
      读写属性：
    - CanReadFileFilter 基于是否可读
    - CanWriteFileFilter     基于是否可写入
    - DelegateFileFilter 将普通的FileFilter和FilenameFilter包装成IOFileFilter

2. 逻辑关系过滤器
   - AndFileFilter       基于AND逻辑运算
   - OrFileFilter        基于OR逻辑运算
   - NotFileFilter       基于NOT逻辑运算
   - TrueFileFilter           不进行过滤
   - FalseFileFilter          过滤所有文件及目录

工具类：FileFilterUtils
提供一些工厂方法用于生成各类文件过滤器
提供一些静态方法用于对指定的File集合进行过滤
FileFilterUtils.ageFileFilter(Date cutoffDate)
FileFilterUtils.and(IOFileFilter... filters)
FileFilterUtils.asFileFilter(FileFilter filter)
FileFilterUtils.directoryFileFilter()
FileFilterUtils.falseFileFilter()
FileFilterUtils.fileFileFilter()
FileFilterUtils.filter(IOFileFilter filter, File... files)
FileFilterUtils.filterList(IOFileFilter filter, File... files)
FileFilterUtils.filterSet(IOFileFilter filter, File... files)
FileFilterUtils.nameFileFilter(String name)
FileFilterUtils.notFileFilter(IOFileFilter filter)
FileFilterUtils.or(IOFileFilter... filters)
FileFilterUtils.prefixFileFilter(String prefix)
FileFilterUtils.sizeFileFilter(long threshold)
FileFilterUtils.suffixFileFilter(String suffix)
FileFilterUtils.trueFileFilter()

##### Comparators比较器
org.apache.commons.io.comparator包下类：
CompositeFileComparator
DefaultFileComparator
DirectoryFileComparator
ExtensionFileComparator
LastModifiedFileComparator
NameFileComparator
PathFileComparator
SizeFileComparator
都有着四个方法：
compare(File file1, File file2)
sort(File... files)
sort(List<File> files)
toString()

##### Monitor文件监控
原理：
由文件监控类FileAlterationMonitor中的线程按指定的间隔不停的扫描文件观察器FileAlterationObserver，如果有文件的变化，则根据相关的文件比较器，判断文件时新增，还是删除，还是更改。（默认为1000毫秒执行一次扫描）
使用方法：
1、创建一个FileAlterationObserver对象，传入一个要监控的目录，这个对象会观察这些变化。
2、通过调用addListener()方法，为observer对象添加一个 FileAlterationListener对象。你可以通过很多种方式来创建，继承适配器类或者实现接口或者使用匿名内部类，实现所需要的监控方法。
3、创建一个FileAlterationMonitor 对象，将已经创建好的observer对象添加其中并且传入时间间隔参数（单位是毫秒）。
4、调用start()方法即可开启监视器，如果你想停止监视器，调用stop()方法即可。
