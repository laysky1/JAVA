package days10;

public class Method21 {

	public static void main(String[] args) {
		int[]a;
		//1~45 사이의 임의의 난수를 a배열에 여섯개 저장한 후,
		//오름차순으로 정령해서 출력하세요
		
		for(int k=0;k<=5;k++) {
			
			a=newNumber(); //중복없는 6개의 숫자를 발생해서 6칸짜리 배열에 저장 후 리턴하는 메서드 제작
			sort(a);
			prn(a);
		}

	}
	public static void prn(int[] a) {
		for(int i=0;i<a.length;i++) System.out.printf("%d ", a[i]);
		System.out.println();
		
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]= temp;
				}
			}
		}
	}
	public static int[] newNumber(){
		int []k=new int[6];
		int i=0;
		while(i<k.length) {
			k[i] = (int)(Math.random()*45)+1;
			int cnt=0;
			
			int j=0;
			for(j=0;j<i;j++)
				if(k[i]==k[j])break;
			if(i!=j) continue;
			
			else i++;
		}
		return k;
	}
	
}

