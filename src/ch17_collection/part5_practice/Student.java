package ch17_collection.part5_practice;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		 return Objects.hash(studentNum);			//return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return s.studentNum ==  this.studentNum;
		}else {
		return false;
		}
	}
}
