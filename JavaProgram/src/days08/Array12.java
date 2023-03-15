package days08;

public class Array12 {

	public static void main(String[] args) {
		
		//반복실행문을 이용한 배열의 조회 및 출력 
		int[]a= {98,78,56,45,78};
		double[]b= {45.6,23.4,69.54,56.3,87.0};
		String[]c= {"Korea","USA", "Japan","China","Canada"};
		
		int i;
		for(i=0;i<a.length;i++) {
			System.out.printf(" %d ",a[i]);
		}
		System.out.println();
		for(i=0;i<b.length;i++) {
			System.out.printf( " %.2f ",b[i]);
		}
		System.out.println();
		for(i=0;i<c.length;i++) {
			System.out.printf(" %s ",c[i]);
		}
		System.out.println();
		for(int k : a ) { //a:배열의 이름 k:배열의 요소 중 하나를 저장할 수 있는 변수
			System.out.printf(" %d ",k);
		}//배열의 요소들이 하나씩 k로 복사되면서 반복이 실행됩니다. 배열의 요소의 갯수만큼 반복됩니다.
		
		System.out.println();
		for(double k : b) {
			System.out.printf(" %.2f ", k);
		}
			System.out.println();
			for(String k : c) {
				System.out.printf(" %s ", k);
		}
			/*
			 오름차순 공식
			 for(i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]= temp;
			 */
			//배열 c의 내용을 오름차순 정렬해서 출력하세요.
			for(i=0;i<c.length;i++) {
				for(int j= i+1;j<c.length;j++) {
					if(c[i].compareTo(c[j])>0) {
						String temp = c[i];
						c[i]=c[j];
						c[j]=temp;
					}
						
					}
				}
			
			
			
			
			//출력
			System.out.println();
			System.out.println();
			for(String k : c) {
				System.out.printf(" %s ", k);
			
			}

			for(i=0;i<c.length;i++) {
				for(int j= i+1;j<c.length;j++) {
					if(c[i].compareTo(c[j])<0) {
						String temp = c[i];
						c[i]=c[j];
						c[j]=temp;
					}	
				}
			}
			System.out.println();
			System.out.println();
			for(String k : c) {
				System.out.printf(" %s ", k);
			
			}
	}

}
