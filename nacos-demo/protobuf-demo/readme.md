//如果添加了 表示是proto3语法 默认使用 proto2语法
syntax = "proto3";

//这个是proto文件包名
//package com.jiabb.proto;
//如果为false 根据.proto文件生成一个java文件 所有的内容都会在一个文件中
//如果为true  则会根据.proto
option java_multiple_files = true;
//生成java文件包名
option java_package = "com.jiabb.proto";
//类名
option java_outer_classname = "AddressbookProtos";



message Person {
optional string name = 1;
optional int32 id = 2;
optional string email =3;

    enum PhoneType {
        MOBILE = 0;
        HOME = 1;
        WORK = 2;
    }

    message PhoneNumber {
        optional string number = 1;
        optional PhoneType type = 2;
    }

    repeated PhoneNumber phones = 4;
}

message AddressBookTest  {
repeated Person people = 1;
}

/**
message xxx {
// 字段规则：required -> 字段只能也必须出现 1 次
// 字段规则：optional -> 字段可出现 0 次或1次
// 字段规则：repeated -> 字段可出现任意多次（包括 0）
// 类型：int32、int64、sint32、sint64、string、32-bit ....
// 字段编号：0 ~ 536870911（除去 19000 到 19999 之间的数字）
字段规则 类型 名称 = 字段编号;
}
*/
// 文档地址：https://developers.google.cn/protocol-buffers/docs/proto3

// $SRC_DIR: .proto 所在的源目录
// --java_out: 生成 java代码
// $DST_DIR: 生成代码的目标目录
// xxx.proto: 要针对哪个 proto 文件生成接口代码
// 文件生成
//protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/xxx.proto
//protoc ./com/jiabb/proto/AddressBook.proto --java_out=./