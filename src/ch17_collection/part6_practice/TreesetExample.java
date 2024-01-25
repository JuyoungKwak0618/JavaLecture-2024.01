package ch17_collection.part6_practice;

import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
	TreeSet<Student> treeSet = new TreeSet<Student>();
	treeSet.add(new Student("blue",96));
	treeSet.add(new Student("hong",86));
	treeSet.add(new Student("white",92));
	
	Student student = treeSet.last();
	System.out.println("최고점수:" +  student.score);
	System.out.println("최고점수를 받은 아이디:" + student.id);

	}

}
