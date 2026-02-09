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
	
	public void setMemo(String memo) {
		this.memo = memo;
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
		
		String personalPhone = phoneMap.get(Phone.Type.PERSONAL);
		if (personalPhone == null) {
			personalPhone = "";
		}
		
		String homePhone = phoneMap.get(Phone.Type.HOME);
		if (homePhone == null) {
			homePhone = "";
		}
		
		String companyPhone = phoneMap.get(Phone.Type.COMPANY);
		if (companyPhone == null) {
			companyPhone = "";
		}
		
		buffer.append(", 개인 번호: ").append(personalPhone);
		buffer.append(", 집 번호: ").append(homePhone);
		buffer.append(", 회사 번호: ").append(companyPhone);
		buffer.append(", 이메일: ").append(email);
		
		if (company != null) {
			buffer.append(", 회사: ").append(company.getCompanyName());
			buffer.append(", 직급: ").append(company.getJob());
			buffer.append(", 주소: ").append(company.getAddress());
		}

		return buffer.toString();
	}
}
