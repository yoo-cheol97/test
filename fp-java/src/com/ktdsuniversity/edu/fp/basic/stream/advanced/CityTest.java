package com.ktdsuniversity.edu.fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;

public class CityTest {
	public static void main(String[] args) {
		List<City> cities = City.loadCityData();
		
		cities.forEach(System.out::println);
		
		//stateID가 3907번인 City의 CountryName을 출력
		/*for(City city: cities) {
			if(city.getStateId() == 3907) {
				System.out.println(city.getCountryName());
			}
				
		}*/
		
		// ==> Stream Code로 구현
		
		cities.stream() // Stream<City>
					.filter(city -> city.getStateId() == 3907) // Stream<City>
					//.map(city -> city.getCountryName()) // Stream<String>
					.map(City::getCountryName) // Stream<String> 위 map과 같은 코드
					.distinct() // String<String>
					//.forEach(city -> System.out.println(city.getCountryName()));
					//.forEach(city -> System.out.println(CountryName())); // map버전
					.forEach(System.out::println);
		
		// countryName이 "South Korea"인 City의 _native를 출력
		
		cities.stream()
					.filter(city -> city.get_native().equals("South Korea"))
					.forEach(city -> System.out.println(city.get_native()));
		
		// countryName이 "South Korea"이면서 _native의 길이가 3이상인 City의 _native를 출력
		
		cities.stream()
					.filter(city -> city.get_native().equals("South Korea"))
					.filter(city -> city.get_native().length() >= 3)
					
					.forEach(city -> System.out.println(city.get_native()));
		
		System.out.println("=".repeat(40));
		
		cities.stream()
					.filter(city -> city.get_native().equals("South Korea"))
					.filter(city -> city.get_native().length() >= 3)
					.skip(3)
					.limit(3)
					.forEach(city -> System.out.println(city.get_native())); // 기장군, 해운대구, 사하구
		
		/*
		 * 동래구
		 * 강서구
		 * 금정구
		 * 기장군
		 * 해운대구
		 * 사하구
		 * 사상구
		 * 수영구
		 * 영도구
		 * 달서구
		 */
		
		// _native의 값이 한글로만 이루어진 값 중에서 _native의 길이가 4글자 이상인 것의
		// name을 중복없이 조회한다
		
		// 예시> 한글로만 이루어져 있는가?
		String name = "신유철";
		System.out.println(name + "은 한글로만 이루어져 있다? " + name.matches("^[가-힣]{4,}$"));
		
		cities.stream() // Stream<City>
					//.filter(city -> city.get_native().matches("^[가-힣]+$")) // Stream<City>
					//.filter(city -> city.get_native().length() >= 4)
					.filter(city -> city.get_native().matches("^[가-힣]{4,}$"))
					.map(City::getName) // Stream<String>
					.distinct()	// Stream<String>
					.map(String::length) // Stream<Integer>
					.filter(length -> length >= 10)
					.distinct()
					.forEach(System.out::println);
		
		// 애월읍의 stateName을 출력한다
		Optional<City> found = cities.stream() // Stream<City>
									.filter(city -> city.getName().equals("Gaigeturi")) // Stream<City>
									.findFirst(); // Optional<City>
		
		System.out.println(found.orElse(null).getStateName());
		
		Optional<City> found2 = cities.stream() // Stream<City>
									.filter(city -> city.getName().equals("1a2a3a4a")) // Stream<City>
									.findFirst(); // Optional<City>

		//System.out.println(found2.orElse(null).getStateName()); -> 에러
		
		// Optional를 사용하는 Case2
		City city = found2.orElse(null);
		if(city != null) {
			System.out.println(city.getStateName());
		}
		
		if(found2.isPresent()) { // 위 if와 코드가 같음
			System.out.println(found2.get().getStateName());
		}
		
		// Optional를 사용하는 Case3
		City city2 = found2.orElse(new City(""));
		System.out.println(city2.getStateName());
		
		cities.stream()
			.peek(_city -> System.out.println(_city.getCountryCode()))
			.filter(_city -> true)
			.map(_city -> _city.get_native());
		
		System.out.println("==============");
		
	}

}
