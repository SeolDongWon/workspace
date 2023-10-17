package ch05.exam_10;

public class DictionaryApp
{
	public static void main(String[] args)
	{
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문1", "파이선");
		dic.put("이재문2", "파이선");
		dic.put("이재문3", "파이선");
		dic.put("이재문4", "파이선");
		dic.put("이재문5", "파이선");
		dic.put("이재문", "C++"); // 이재문 파이선을 이재문 Cpp로 수정
		System.out.println("이재문의 값은 "+dic.get("이재문")); // 이재문 아이템 출력
		System.out.println("황기태의 값은 "+dic.get("황기태")); // 황기태 아이템 출력
		System.out.printf("%s\n",dic.delete("황기태"));
		System.out.println("황기태의 값은 "+dic.get("황기태")); // 삭제된 아이템 접근
		dic.print();
	}
}
