package ch06.sec1;

public class CompareToMain
{
	public static void main(String[] args)
	{
		String java = "java";
		String cpp = "javb";
		int res = java.compareTo(cpp);
		System.out.printf("%d\n", res);

		if (res == 0)
		{
			System.out.printf("the same\n");
		} else if (res < 0)
		{
			System.out.printf("%s < %s\n", java, cpp);
		} else
		{
			System.out.printf("%s > %s\n", java, cpp);
		}
		System.out.print("abcd" + 1 + true + 3.13e-2 + 'E' + "fgh");
		System.out.printf("\n");
		System.out.printf("I LOVE ".concat("Java."));
		System.out.printf("\n");

		String a = "   abcd def    ";
		String b = "     xyz\tdnfl\t";
		String c = a.trim();
		String d = b.trim();

		System.out.printf(a);
		System.out.printf(b);
		System.out.printf("\n");
		System.out.printf(c);
		System.out.printf(d);
		System.out.printf("\n");

		String a1 = "class";
		char c1 = a1.charAt(2);
		System.out.printf("%c", c1);
		System.out.printf("\n");

		int count = 0;
		for (int i = 0; i < a1.length(); i++)
		{
			if (a1.charAt(i) == 's')
				count++;
		}
		
		System.out.printf("%d", count);
		
		String a3 = new String(" C#");
		String b3 = new String (",C++ ");
		
		System.out.println(a3 + "의 길이는 "+a3.length());
		System.out.println(a3.contains("#"));
		
		a3= a3.concat(b3);
		System.out.println(a3);
		
		a3=a3.trim();
		System.out.println(a3);
		
		a3=a3.replace("C#", "JAVA");
		System.out.println(a3);
		
		String s[] = a3.split(",");
		for(int i=0; i<s.length;i++) {
			System.out.println("분리된 문자열"+i+":"+s[i]);
		}
		
		a3=a3.substring(5);
		System.out.println(a3);
		
		char c3 = a3.charAt(2);
		System.out.println(c3);
		
		StringBuffer sb = new StringBuffer("a");
		System.out.printf("%s\n",sb);
		sb.append(" pencil");
		System.out.printf("%s\n",sb);
		sb.insert(2,"nice ");
		System.out.printf("%s\n",sb);
		sb.replace(2, 6, "bad");
		System.out.printf("%s\n",sb);
		sb.delete(0, 2);
		System.out.printf("%s\n",sb);
		sb.reverse();
		System.out.printf("%s\n",sb);
		int n= sb.length();
		System.out.printf("%d\n",n);
		char cc = sb.charAt(3);
		System.out.printf("%c\n",cc);
		sb.setLength(3);
		System.out.printf("%s\n",sb);
		
		StringBuffer sb2 = new StringBuffer("This");
		System.out.println(sb2);
		
		sb2.append(" is pencil");
		System.out.println(sb2);
		
		sb2.insert(7, "my");
		System.out.println(sb2);
		
		sb2.replace(8,10,"your");
		System.out.println(sb2);
		
		sb2.delete(8,13);
		System.out.println(sb2);
		
		sb.setLength(4);
		System.out.println(sb2);
		
		
		
		
		
		
		
		
	}
}
