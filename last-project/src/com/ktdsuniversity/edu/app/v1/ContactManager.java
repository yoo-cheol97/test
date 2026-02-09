package com.ktdsuniversity.edu.app.v1;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
	
private List<Contact> contactList;
	
	public ContactManager() {
		this.contactList = new ArrayList<>();
	}
	
	// 1. contactList에 Contact 인스턴스를 추가하는 기능
	
	// 2. contactList의 모든 연락처 정보를 출력하는 기능
	
	// 3. contactList에서 전화번호 검색 결과 출력하는 기능 예) 010을 적으면 모든 010 전화번호
	
	// 4. contactList에서 이름 검색 결과 출력하는 기능 
	// 예) "김"을 파라미터로 전달하면 name, firstNname, lastName, companyName,에 "김" 모든 연락처 정보
	
	// 5. contactList에서 이메일 검색 결과 출력하는 기능
	// 예) @abc.com을 파라미터로 전달하면 이메일에 포함 연락처 모든정보

	// 6. 연락처 정보 수정 기능
	// 예) 다양한 검색의 결과 중 하나를 선택해 연락처 정보를 수정할 수 있는 기능
	
	// 7. 연락처 정보 삭제 기능
	// 예) 다양한 검색의 결과 중 하나를 선택해 contactList에서 제거하는 기능
	
	public static void main(String[] args) {
		
	}

}
