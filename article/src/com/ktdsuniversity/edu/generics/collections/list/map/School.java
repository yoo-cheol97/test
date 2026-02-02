package com.ktdsuniversity.edu.generics.collections.list.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	// 2
	public static void printStudents(Map<Integer, List<Student>> classes, int classNum) {
		
		List<Student> students = classes.get(classNum);
		
		if(students != null) {
			
			for(Student student : students) {
				System.out.println(classNum + "반의 학생: " + student);
			}
			
		}
		
	}
	// 1
	public static void main(String[] args) {
		
		Map<Integer, List<Student>> classes = new HashMap<>(); //list는 반복을 반드시 해야하지만 map은 반복을 시키지 않는다
		
		classes.put(1, new ArrayList<>()); // 1-> Integer, ArrayList -> List<Student>
		classes.put(2, new ArrayList<>());
		
		List<Student> students = classes.get(1);
		students.add(new Student(1, "김범수"));
		students.add(new Student(2, "나얼"));
		students.add(new Student(3, "박효신"));
		students.add(new Student(4, "이수"));
		
		/*
		System.out.println(classes);
		System.out.println(classes.size());
		*/
		
		printStudents(classes, 0);
		printStudents(classes, 1);
		printStudents(classes, 2);
		printStudents(classes, 3);
		
		
		
		
	}

}
