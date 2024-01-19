package ch10_oop.sec01_person;

public class Main {

	public static void main(String[] args) {
		// Person 객체 생성
		Person person = new Person();
		person.name = "제임스"; person.age =27;
		person.eat(); person.sleep();
		
		// Student 객체
		Student student = new Student();
		student.name = "마리아"; student.age = 23; student.studentId = 1234;		// 부모 필드
		student.eat(); student.sleep(); student.study();							// 부모 메소드
		
		//worker 객체
		Worker worker = new Worker();
		worker.name = "브라이언"; worker.age = 32; worker.workerId = 9876;			//부모 필드
		worker.eat(); worker.sleep(); worker.work();								//부모 메소드
		
		
	}

}
