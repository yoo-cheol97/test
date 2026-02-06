package com.ktdsuniversity.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.basic.stream.object.Dish;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishList;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishType;
import com.ktdsuniversity.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {
	
	public void printDishUseFor() {
		
		System.out.println("전체 요리 목록 - 칼로리가 500↓ && FoodType이 MEAT && DishType이 FISH - for");
		
		List<Dish> dishList = DishList.makeDishList();
		
		for(Dish dish : dishList) {
			if(dish.getCalories() < 500 
								&& dish.getFoodType() == FoodType.MEAT 
								&& dish.getDishType() == DishType.FISH) {
				System.out.println(dish);
			}
		}
		
	}
	
	public void printDishUseStream() {
		
		System.out.println("\n전체 요리 목록 - 칼로리가 500 && FoodType이 MEAT - MEAT && DishType이 FISH list.forEach");
		
		List<Dish> dishList = DishList.makeDishList();
		
		//dishList.forEach(dish -> System.out.println(dish));
		//dishList.forEach(System.out::println); // 전체 목록만 출력 했을 때
		dishList.forEach(dish -> {
			if(dish.getCalories() < 500 
								&& dish.getFoodType() == FoodType.MEAT
								&& dish.getDishType() == DishType.FISH) {
				System.out.println(dish);
			}
		});
		
		System.out.println("\n전체 요리 목록 - 칼로리가 500↓ && FoodType이 MEAT MEAT && DishType이 FISH - Stream");
		// Stream을 사용할 수 있는 대상 -> List, Set
		dishList // = List<Dish> 타입은 List 제네릭은 Dish
				.stream() // Stream<Dish>
//				.peek(dish -> {
//					System.out.println("첫 번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("1.  " + dish.getName());
//					System.out.println("1.  " + dish.getCalories());
//					System.out.println("1.  " + dish.getFoodType());
//					System.out.println("1.  " + dish.getDishType());
//				}) // Stream<Dish> (현재 반복 중인 인스턴ㄴ스를 확인 - 디버깅 용도)
				.filter(dish -> dish.getCalories() < 500) // Stream<Dish> 전달
//				.peek(dish -> {
//					System.out.println("두 번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("2.  " + dish.getName());
//					System.out.println("2.  " + dish.getCalories());
//					System.out.println("2.  " + dish.getFoodType());
//					System.out.println("2.  " + dish.getDishType());
//				})
				.filter(dish -> dish.getFoodType() == FoodType.MEAT)
//				.peek(dish -> {
//					System.out.println("세 번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("3.  " + dish.getName());
//					System.out.println("3.  " + dish.getCalories());
//					System.out.println("3.  " + dish.getFoodType());
//					System.out.println("3.  " + dish.getDishType());
//				})
				.filter(dish -> dish.getDishType() == DishType.FISH)
//				.peek(dish -> {
//					System.out.println("네 번째 filter를 수행하기 이전의 인스턴스 값");
//					System.out.println("4.  " + dish.getName());
//					System.out.println("4.  " + dish.getCalories());
//					System.out.println("4.  " + dish.getFoodType());
//					System.out.println("4.  " + dish.getDishType());
//				})
				.forEach(dish -> System.out.println(dish));
		
	}
	
	public void printEvenNumbers() {
		
		List<Integer> numbers = Arrays.asList(1, 1, 23, 23, 456, 78910, 11121314);
		
		// numbers에 있는 값을 전부 2를 곱해서 짝수로 만들어 출력한다
		numbers.stream()
						.map(num -> num * 2)
						.forEach(System.out::println);
		
		System.out.println("=".repeat(40));
		
		// numbers에 있는 값 중에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 복수로 만들어 출력한다
		numbers.stream()
						.distinct() // 중복된 숫자 제거
						.map(num -> num * 2)
						.forEach(System.out::println);
	}
	
	public String makeString() {
		
		// 모든 VEGETABLES 메뉴의 이름들을 ","로 연결한 문자열을 반환한다
		List<Dish> dishList = DishList.makeDishList();
		
		String dishesName = dishList.stream() // Stream<Dish>
									.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES)
									.map(Dish::getName)
									.collect(Collectors.joining(", "));
		
		return dishesName;
		
	}
	
	public List<Dish> getHealthyDishes(){
		// 변경 불가능한 리스트 (add 불가)
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
									.filter(dish -> dish.getCalories() < 400)
									.toList();
		
		
		return result;
	}
	
	public List<Dish> getHealthyDishes2(){
		// 변경 가능한 리스트 (add 가능)
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes.stream()
									.filter(dish -> dish.getCalories() < 400)
									.collect(Collectors.toList());
		
		
		return result;
	}
	
	public static void main(String[] args) {
		StreamBasic basic = new StreamBasic();
		
		basic.printDishUseFor();
		basic.printDishUseStream();
		basic.printEvenNumbers();
		
		String dishesName = basic.makeString();
		System.out.println(dishesName);
		
		List<Dish> result = basic.getHealthyDishes();
		System.out.println(result);
		//result.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));
		
		List<Dish> result2 = basic.getHealthyDishes2();
		System.out.println(result2);
		result2.add(new Dish("곱창", FoodType.MEAT, 3000, DishType.MEAT));
		System.out.println(result2);
		
	}
	
}
