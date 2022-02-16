package com.jiabb.entity;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class StudentTest extends TestCase {


	public void testSerializable() throws IOException {

		Student student = new Student();
		student.setAddress("address");
		student.setName("name");

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		Hessian2Output output = new Hessian2Output(bos);
		output.writeObject(student);
		output.close();

		Student.hobby = "drink";

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		Hessian2Input input = new Hessian2Input(bis);
		Student st = (Student) input.readObject();

		System.out.println(st.toString());
		System.out.println(Student.hobby);


	}


}
