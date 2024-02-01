package EX99_test;

import java.time.LocalDate;
// 2-1) Member 클래스
public class Member {
	private int id;
	public String name;
	private int birthDay;
	private String tel;
	
	public Member() {}
	
	public Member(int id, String name, int birthDay, String tel) {
		this.id = id;
		this.name = name;
		this.birthDay = birthDay;
		this.tel = tel;
	}
	
	public int getAge() {
		LocalDate today = LocalDate.now();
		int year = today.getYear();			
		int age = year - birthDay;
		return age;							// return today.getYear() - birthDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {

		return "ID=" + id + ", 이름=" + name + ", 나이=" + getAge() + ", 전화번호=" + tel;
	}
	
	
	
}
