package days15;

import java.util.LinkedList;

// Linked List 클래스
// 링크드 리스트를 구현하고 있는 클래스
// -데이터를 참조값으로 연결하여 저장할 수 있는 클래스
// -개수의 제약없이 저장할 수 있음
// -데이터의 삽입과 삭제에 최적화 되어있는 클래스
// - 데이터 중복을 허용
// -데이터 입력순서를 유지
// -검색에 취약
// -데이터 저장 시 참조값도 같이 저장되기 때문에 메모리 낭비가 발생
// -사용빈도 : 하

public class Collection03 {

	public static void main(String[] args) {
		LinkedList<Integer>a=new LinkedList<>();
		a.add(10);		a.add(20);		a.add(30);		a.add(40);		a.add(50);
		for (int i=0;i<a.size();i++)
			System.out.printf("a.get(%d)->%d\n",i,a.get(i));
	}

}
