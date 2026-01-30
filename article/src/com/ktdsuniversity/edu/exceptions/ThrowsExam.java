package com.ktdsuniversity.edu.exceptions;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ThrowsExam {

	
	/**
	 * creaeteNewInstacne("com.ktdsuniversity.edu.restaurnat.Customer")
	 *    -> Customer의 인스턴스가 반환
	 * @param classPath
	 * @return
	 */
	public static Object createNewInstance(String classPath) {
		
		Class clazz =null;
		
		try {
			clazz = Class.forName(classPath);
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println(classPath + "존재하지 않는 클래스입니다");
		}
		
		if(clazz != null) {
			Constructor constructor = null;
			try {
				constructor = clazz.getConstructor(String.class, int.class);
			}
			catch(NoSuchMethodException nsme) {
				System.out.println("생성자를 찾을 수 없습니다");
			}
			if(constructor != null) {
				try {
					Object instance = constructor.newInstance("리플렉션", 100);
					return instance;
				} catch (InstantiationException e) {
					System.out.println("인스턴스 생성을 실패했습니다");
				} catch (IllegalAccessException e) {
					System.out.println("접근 권한이 없습니다");
				} catch (IllegalArgumentException e) {
					System.out.println("생성 파라미터가 잘못되었습니다");
				} catch (InvocationTargetException e) {
					System.out.println("생성자를 실행할 때 에러가 발생했습니다");
				}
			}
			
		}
		
		return null;
	}
	
	
public static void main(String[] args) {
		
		Customer cust = (Customer) createNewInstance("com.ktdsuniversity.edu.restuarant.Customer");
		System.out.println(cust.getName());
		
		try {
			Customer cust2 = (Customer) createNewInstance2("com.ktdsuniversity.edu.restuarant.Customer");
		} catch (ClassNotFoundException e) {
			System.out.println();
		} catch (NoSuchMethodException e) {
			System.out.println();
		} catch (InstantiationException e) {
			System.out.println();
		} catch (IllegalAccessException e) {
			System.out.println();
		} catch (IllegalArgumentException e) {
			System.out.println();
		} catch (InvocationTargetException e) {
			System.out.println();
		}
		System.out.println(cust.getName());
		
	}
	
}
