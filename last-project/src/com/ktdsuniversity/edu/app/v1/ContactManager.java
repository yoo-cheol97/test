package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ContactManager {
	
private List<Contact> contactList;
	
	public ContactManager() {
		this.contactList = new ArrayList<>();
	}
	
	public void printContact(Predicate<Contact> predicate) {
		
		for(Contact c : contactList) {
			if(predicate.test(c)) {
				System.out.println(c);
			}
		}
		
	}

	
	// 1. contactList에 Contact 인스턴스를 추가하는 기능
	public void add(Contact contact) {
		this.contactList.add(contact);
	}
	
	
	public static void main(String[] args) {
		
		ContactManager cm = new ContactManager();
		
		List<Phone> kimPhones = new ArrayList<>();
		kimPhones.add(new Phone(Phone.Type.PERSONAL, "010-1111-1111"));
		kimPhones.add(new Phone(Phone.Type.HOME, "02-111-1111"));
		kimPhones.add(new Phone(Phone.Type.COMPANY, "02-523-7029"));

		Contact kim = new Contact("김범수", "kim@abc.com", kimPhones, new Company("KTDS", "사원", "서울 서초구"));
		cm.add(kim);

		List<Phone> leePhones = new ArrayList<>();
		leePhones.add(new Phone(Phone.Type.PERSONAL, "010-2222-2222"));
		leePhones.add(new Phone(Phone.Type.HOME, "02-222-2222"));
		leePhones.add(new Phone(Phone.Type.COMPANY, "02-523-7029"));
		
		Contact lee = new Contact("이 수", "lee@abc.com", leePhones, new Company("KTDS", "대리", "서울 서초구"));
		cm.add(lee);
		
		List<Phone> parkPhones = new ArrayList<>();
		parkPhones.add(new Phone(Phone.Type.PERSONAL, "010-3333-3333"));
		parkPhones.add(new Phone(Phone.Type.HOME, "02-333-3333"));
		parkPhones.add(new Phone(Phone.Type.COMPANY, "02-523-7029"));
		
		Contact park = new Contact("박효신", "park@abc.com", parkPhones, new Company("KTDS", "과장", "서울 서초구"));
		cm.add(park);
		
		List<Phone> lee2Phones = new ArrayList<>();
		lee2Phones.add(new Phone(Phone.Type.PERSONAL, "010-4444-4444"));
		lee2Phones.add(new Phone(Phone.Type.HOME, "02-444-4444"));
		lee2Phones.add(new Phone(Phone.Type.COMPANY, "02-523-7029"));

		Contact lee2 = new Contact("이상국", "lee2@abc.com", lee2Phones, new Company("KTDS", "대표", "서울 서초구"));
		cm.add(lee2);
		
		// 2. contactList의 모든 연락처 정보를 출력하는 기능
		System.out.println("모든 연락처");
		cm.printContact(c -> true);
		
		// 3. contactList에서 전화번호 검색 결과 출력하는 기능 예) 010을 적으면 모든 010 전화번호
		System.out.println("\n010으로 시작하는 전화번호 목록");
		cm.printContact(c -> c.getName().equals("010"));
		
		// 4. contactList에서 이름 검색 결과 출력하는 기능 
		// 예) "김"을 파라미터로 전달하면 name, firstNname, lastName, companyName,에 "김" 모든 연락처 정보
		
		// 5. contactList에서 이메일 검색 결과 출력하는 기능
		// 예) @abc.com을 파라미터로 전달하면 이메일에 포함 연락처 모든정보

		// 6. 연락처 정보 수정 기능
		// 예) 다양한 검색의 결과 중 하나를 선택해 연락처 정보를 수정할 수 있는 기능
		
		// 7. 연락처 정보 삭제 기능
		// 예) 다양한 검색의 결과 중 하나를 선택해 contactList에서 제거하는 기능
		
		
		
	}

}
