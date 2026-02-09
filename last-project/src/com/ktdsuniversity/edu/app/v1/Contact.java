package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private String memo;
	
	public Contact(String name, String email, List<Phone> phones, Company company) {
		this.name = name;
		this.email = email;
		this.phones = phones;
		this.company = company;
		
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Phone> getPhones() {
		return this.phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getMemo() {
		return this.memo;
	}

	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("이름: ").append(name);
		
		Map<Phone.Type, String> phoneMap = new HashMap<>();
		if (phones != null) {
			for (Phone p : phones) {
				phoneMap.put(p.getPhoneType(), p.getPhoneNumber());
			}
		}
		buffer.append(", 개인 전화번호: ").append(phoneMap.getNumber(Phone.Type.PERSONAL, ""));
		buffer.append(", 집 전화번호: ").append(phoneMap.getNumber(Phone.Type.HOME, ""));
		buffer.append(", 회사 전화번호: ").append(phoneMap.getNumber(Phone.Type.COMPANY, ""));

		buffer.append(", 이메일: ").append(email);

		if (company != null) {
			buffer.append(", 회사: ").append(company.getCompanyName());
			buffer.append(", 직급: ").append(company.getJob());
		}

		return buffer.toString();
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}

	
}
