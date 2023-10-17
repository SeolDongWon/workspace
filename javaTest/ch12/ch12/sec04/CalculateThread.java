package ch12.sec04;

public class CalculateThread extends Thread{
	//스레드 이름 정하기
	public CalculateThread(String name) {
		//this.setName(name);
	}

	@Override
	public void run() {
		super.run();
		//20억번 반복 후 자신의 스레드 이름을 출력
		for(int i=0;i<2_000_000_000;i++) {
		}
		System.out.println(getName()+"작업종료");
	}
}
