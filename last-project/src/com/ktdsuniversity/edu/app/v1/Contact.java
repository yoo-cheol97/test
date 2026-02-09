package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	
	/**
	 * 연락처의 이름
	 */
	
	private String name;
	
	/**
	 * 연락처 별명
	 */
	private String nickname;
	
	/**
	 * 연락처 이메일
	 */
	private String email;
	
	/**
	 * 이름 유철
	 */
	private String firstName;
	
	/**
	 * 성 신
	 */
	private String lastName;
	
	/**
	 * 전화번호 목록
	 */
	private List<Phone> phones;
	
	/**
	 * 근무 중인 회사 정보
	 */
	private Company company;
	
	/**
	 * 메모
	 */
	private String meno;
	
	public Contact() {
		this.phones = new ArrayList<>();
	}
	
}
