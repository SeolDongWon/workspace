package controller;

import java.util.Scanner;
import model.VIDEOVO;

public class VIDEORegisterManager {
	//비디오 목록
	public void VIDEOList() throws Exception {
		VIDEODAO sd = new VIDEODAO();
		System.out.println("비디오 전체 리스트");
		sd.getVIDEOTotalList();
		System.out.println();
		
	}
	// 비디오 등록 관리
	public void VIDEORegistr() throws Exception {
		Scanner input = new Scanner(System.in);
		
		VIDEODAO sd = new VIDEODAO();
		VIDEOVO svo = new VIDEOVO();
		String name;  // 이름
		String type;  // 비디오 번호
		
		System.out.println("비디오 전체 리스트");
		sd.getVIDEOTotalList();
		System.out.println();
		
		System.out.println("비디오 정보 입력");
		System.out.print("비디오명 : ");
		name = input.nextLine();
		System.out.print("비디오장르 : ");
		type = input.nextLine();
		svo.setName(name);
		svo.setType(type);
		
		
		sd.setVIDEORegistr(svo);
		
		System.out.println();
		System.out.println("비디오 전체 리스트");
		sd.getVIDEOTotalList();
		System.out.println();
		
	}
	//비디오 수정 관리
	public void VIDEOUpdate() throws Exception {
		Scanner input = new Scanner(System.in); 
		Scanner input1 = new Scanner(System.in); 
		
		VIDEODAO sd = new VIDEODAO(); 
		VIDEOVO svo = new VIDEOVO(); 
		System.out.println("비디오 전체 리스트"); 
		sd.getVIDEOTotalList(); 
		int no; // 입력한 비디오번호 
		System.out.println(); 
		System.out.println("수정할 비디오 일련번호 입력"); System.out.print("일련번호 : "); 
		no = input1.nextInt(); 
		input1.nextLine();
		String name = null; // 비디오 명 
		String type = null; // 장르 
		
		System.out.println(); 
		System.out.println("새로운 정보 모두 입력"); 
		System.out.print("비디오명 : "); 
		name = input.nextLine(); 
		System.out.print("장르 : "); 
		type = input.nextLine(); 
		
		svo.setNo(no);
		svo.setName(name); 
		svo.setType(type);
		sd.setVIDEOUpdate(svo); 
		System.out.println(); 
		System.out.println("비디오 전체 리스트"); 
		sd.getVIDEOTotalList(); 
		System.out.println(); 
		
		
	}
	// 비디오 삭제 관리
	public void VIDEODelete() throws Exception {
		Scanner input = new Scanner(System.in); 
		
		VIDEODAO sd = new VIDEODAO(); 
		VIDEOVO svo = new VIDEOVO(); 
		int no; // 입력한 비디오번호 
		
		System.out.println("비디오 전체 리스트"); 
		sd.getVIDEOTotalList(); 
		System.out.println(); 
		System.out.println("삭제할 비디오 번호 입력"); 
		System.out.print("비디오번호 : "); 
		no = input.nextInt(); 
		sd.setVIDEODelete(no);
		System.out.println(); 
		System.out.println("비디오 전체 리스트"); 
		sd.getVIDEOTotalList(); 
		System.out.println();
		
	}

}
