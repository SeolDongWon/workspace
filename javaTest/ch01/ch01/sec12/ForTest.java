package ch01.sec12;

public class ForTest {
    public static void main(String[] args) {

//	for (int i = 0; i < 10; i = i + 1) {
//	    System.out.printf("%d번 이름 : %s \n", i + 1, "설동원");
//	}

	double d = 3147483650.0;
	int i = (int)d;
	
	System.out.printf("%f\n",d);
	System.out.printf("%d\n",i);
//	System.out.printf("이름 : %s \n", "설동원");
//	System.out.printf("이름 : %s \n", "설동원");
//	System.out.printf("이름 : %s \n", "설동원");
	System.out.println("종료");
    }
}
