package days09;

public class Method16 {

	public static void main(String[] args) {

		int sumValue = sum(5,6,7,8,9,54,87,46);
		System.out.println("입력값들의 합은 " +sumValue+"입니다");
		sumValue = sum(5,6,7,8,9,54,87,46,54,57,65,21);
		System.out.println("입력값의 합은 " +sumValue+"입니다");
	}

	public static int sum(int...a) {
		//전달되는 전달인수 갯수만큼 배열이 생성되고 그 배열에 전달인수가 저장됩니다.
		//배열의 이름은 매개변수 a
		int s=0;
		for(int i=0;i<a.length; i++) {
			s+=a[i];
		}
		return s;
	}
	
}
