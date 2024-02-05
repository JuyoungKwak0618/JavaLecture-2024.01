package mysql.sec02_kcity;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		CityDao cityDao = new CityDao();
		
		City city = cityDao.getCityById(2340);
		System.out.println(city);
		
		city = cityDao.getCityByname("Seoul");
		System.out.println(city);
		System.out.println("==============================================");
		
		List<City> list = cityDao.getCitylistAll();
//		list.forEach(x -> System.out.println(x));
		
//		city = new City("화성","KOR","Kyonggi",900000);
		cityDao.insertCity(city);
		
		city = cityDao.getCityById(2396);
		city.setName("의왕");
		city.setPopulation(500000);
		cityDao.updateCity(city);
		
		cityDao.deleteCity(2396);
		
		list = cityDao.getCityByDistrict("kyonggi");
		list.forEach(x -> System.out.println(x));
	}

}


