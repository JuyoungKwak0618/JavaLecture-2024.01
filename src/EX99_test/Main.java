package EX99_test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//	2-3) 2)에서 만든 객체의 전화번호를 변경한 후 두 객체를 출력하세요.
		List<Member> list = getMemberList();
		
		System.out.println("변경전");
		list.forEach(m -> System.out.println(m));
		
		Member firstMember = list.get(0);
		Member secondMember = list.get(1);
		
		firstMember.setTel("010-5555-6666");
		secondMember.setTel("010-7777-8888");
		
		System.out.println("변경후");
		
//		System.out.println(firstMember);
//		System.out.println(secondMember);
		
		list.forEach(m -> System.out.println(m));
		
		
		
		

	}
//	2-2) james, maria 두 객체를 ArrayList로 만들어 반환하는 메소드 getMemberList() 를 만드세요.
	public static  List<Member> getMemberList() {
	List<Member> members = new ArrayList<Member>();
	members.add(new Member(1, "james",1998,"010-1111-2222"));
	members.add(new Member(2, "maria",1999,"010-3333-4444"));
	return members;
	}
	syso
}
