package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.Scanner;

public class ContactManager {
	
private List<Contact> contactList;
	
	public ContactManager() {
		this.contactList = new ArrayList<>();
	}
	
	// 1. contactList에 Contact 인스턴스를 추가하는 기능
	public void add(Contact contact) {
		this.contactList.add(contact);
	}
	
	// 2. contactList의 모든 연락처 정보를 출력하는 기능
	public void printContact(Predicate<Contact> predicate) {
		
		for(Contact c : contactList) {
			if(predicate.test(c)) {
				System.out.println(c);
			}
		}
		
	}
	
	// 3. 010을 파라미터로 전달하면 전화번호에 010이 포함된 연락처의 모든 정보를 출력
	public void searchPhone(String number) {
		List<Phone> phoneList = null;
		for (Contact c : this.contactList) {
			phoneList = c.getPhones();
			if (phoneList != null) {
				for (Phone phone : phoneList) {
					if (phone.getPhoneNumber().contains(number)) {
						System.out.println(c);
					}
				}
			}
		}
	}
	
	// 4. contactList에서 이름 검색 결과 출력하는 기능 
	// 예) "김"을 파라미터로 전달하면 name, firstNname, lastName, companyName에 "김" 모든 연락처 정보
	public void searchName(String name) {
		for (Contact c : this.contactList) {
			if ((c.getName() != null && c.getName().contains(name))) {
				System.out.println(c);
			}
		}
	}
	
	// 5. contactList에서 이메일 검색 결과 출력하는 기능
	// 예) @abc.com을 파라미터로 전달하면 이메일에 포함 연락처 모든정보
	public void searchEmail(String email) {
		for (Contact c : this.contactList) {
			if (c.getEmail() != null && c.getEmail().contains(email)) {
				System.out.println(c);
			}
		}
	}
	
	public void printContact2() {
		for (Contact c : contactList) {
			System.out.println(c);
		}
	}

	// 6. 연락처 정보 수정 기능
	// 예) 다양한 검색의 결과 중 하나를 선택해 연락처 정보를 수정할 수 있는 기능
	public void editContact() {
		Scanner scanner = new Scanner(System.in);

		printContact2();

		int index = scanner.nextInt();
		scanner.nextLine();

		if (index < 0 || index >= contactList.size()) {
			System.out.println("유효하지 않은 정보입니다.");
			return;
		}

		Contact contact = contactList.get(index);

		System.out.println("이름 입력 (기존: " + contact.getName() + "):");
		String newName = scanner.nextLine();
		if (!newName.isEmpty()) {
			contact.setName(newName);
		}

		System.out.println("이메일 입력 (기존: " + contact.getEmail() + "):");
		String newEmail = scanner.nextLine();
		if (!newEmail.isEmpty()) {
			contact.setEmail(newEmail);
		}

		List<Phone> phones = contact.getPhones();
		
		if (phones == null) {
			phones = new ArrayList<>();
		}

		for (Phone.Type type : Phone.Type.values()) {
			String oldNumber = "";
			for (Phone p : phones) {
				if (p.getPhoneType() == type) {
					oldNumber = p.getPhoneNumber();
				}
			}

			System.out.println(type + " 번호 입력 (기존: " + oldNumber + "):");
			String newNumber = scanner.nextLine();

			boolean updated = false;
			for (Phone p : phones) {
				if (p.getPhoneType() == type) {
					if (!newNumber.isEmpty())
						p.setPhoneNumber(newNumber);
					updated = true;
					break;
				}
			}
			if (!updated && !newNumber.isEmpty()) {
				phones.add(new Phone(type, newNumber));
			}
		}
		contact.setPhones(phones);

		Company company = contact.getCompany();
		if (company == null) {
			company = new Company("", "", "");
		}
		
		System.out.println("회사 이름 입력 (기존: " + company.getCompanyName() + "):");
		String newCompanyName = scanner.nextLine();
		
		if (!newCompanyName.isEmpty()) {
			company.setCompanyName(newCompanyName);
		}

		System.out.println("직급 입력 (기존: " + company.getJob() + "):");
		String newJob = scanner.nextLine();
		if (!newJob.isEmpty()) {
			company.setJob(newJob);
		}

		System.out.println("주소 입력 (기존: " + company.getAddress() + "):");
		String newAddress = scanner.nextLine();
		if (!newAddress.isEmpty()) {
			company.setAddress(newAddress);
		}
		contact.setCompany(company);

		System.out.println("연락처 정보가 수정되었습니다.");
	}

	
	// 7. 연락처 정보 삭제 기능
	// 예) 다양한 검색의 결과 중 하나를 선택해 contactList에서 제거하는 기능
	public void deleteContact(int index) {
		
		if() {
			
		}
		
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
		
		Contact park = new Contact("박효신", "park@daum.net", parkPhones, new Company("KTDS", "과장", "서울 서초구"));
		cm.add(park);
		
		List<Phone> lee2Phones = new ArrayList<>();
		lee2Phones.add(new Phone(Phone.Type.PERSONAL, "010-4444-4444"));
		lee2Phones.add(new Phone(Phone.Type.HOME, "02-444-4444"));
		lee2Phones.add(new Phone(Phone.Type.COMPANY, "02-523-7029"));

		Contact lee2 = new Contact("이상국", "lee2@naver.com", lee2Phones, new Company("KTDS", "대표", "서울 서초구"));
		cm.add(lee2);
		
		// 2. contactList의 모든 연락처 정보를 출력하는 기능
		System.out.println("모든 연락처");
		cm.printContact(c -> true);
		
		// 3. contactList에서 전화번호 검색 결과 출력하는 기능 예) 010을 적으면 모든 010이 포함된 연락처의 모든 정보
		System.out.println("\n010으로 시작하는 전화번호 목록");
		cm.searchPhone("010");
		
		// 4. contactList에서 이름 검색 결과 출력하는 기능 
		// 예) "김"을 파라미터로 전달하면 name, firstNname, lastName, companyName,에 "김" 모든 연락처 정보
		System.out.println("\n이가 들어가는 모든 연락처 정보");
		cm.searchName("이");
		
		// 5. contactList에서 이메일 검색 결과 출력하는 기능
		// 예) @abc.com을 파라미터로 전달하면 이메일에 포함 연락처 모든정보
		System.out.println("\n@abc.com이 이메일에 포함되는 모든 연락처");
		cm.searchEmail("@abc.com");
		
		// 6. 연락처 정보 수정 기능
		// 예) 다양한 검색의 결과 중 하나를 선택해 연락처 정보를 수정할 수 있는 기능
		System.out.println("\n수정할 주소록의 번호를 말하세요, 위에서부터 0,1,2,3");
		cm.editContact();
		
		// 7. 연락처 정보 삭제 기능
		// 예) 다양한 검색의 결과 중 하나를 선택해 contactList에서 제거하는 기능
		
		
		
	}

}
