package mysql.sec04_girl_group;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		GirlGroupDao ggDao = new GirlGroupDao();
		
		GirlGroup gg = ggDao.getGirlGroupByGid(1005);
//		System.out.println(gg);
		
		gg = ggDao.getGirlGroupByName("%원더%");
//		System.out.println(gg);
		
		
//		gg = new GirlGroup("뉴진스", LocalDate.parse("2022-07-22"), 117);
//		ggDao.insertGirlGroup(gg);
		
		gg = ggDao.getGirlGroupByGid(1007);
		gg.setName("에프엑스");
		ggDao.updateGirlGroup(gg);
		
		ggDao.deleteGirlGroup(1028);
		
		List<GirlGroup> list = ggDao.getGirlGroupByDebut(2007, 2022);
		list.forEach(x -> System.out.println(x));
		
		
		ggDao.close();
	}

}
