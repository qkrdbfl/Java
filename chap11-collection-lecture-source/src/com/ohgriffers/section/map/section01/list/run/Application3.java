package com.ohgriffers.section.map.section01.list.run;

import java.util.LinkedList;
import java.util.List;

public class Application3 {
    public static void main(String[] args) {
        //LinkedList에 대해 이해하고 사용하기
        //ArrayList가 배열을 이요해서 발생할수 있는 성능적 단점을 보완하고자 고민되었다
        //내부는 이중 연결 리스트로 구현되어있다

        List<String> linkedList = new LinkedList<>();

        linkedList.add ("사과");
        linkedList.add ("바나나");
        linkedList.add ("망고");
        linkedList.add ("오렌지");
        linkedList.add ("그래프");

        for (int i=0; i< linkedList.size(); i++){
            System.out.println(i+":"+linkedList.get(i));
        }

        linkedList.remove(1);

        for (String s: linkedList){
            System.out.println(s);
        }

        linkedList.set(0,"핀사과"); //사과부분 수정함

        System.out.println(linkedList);

        //isEmpty() 메소드를 통해 list가 비어있는지 확인 가능
        System.out.println(linkedList.isEmpty());

        //clear() 를 이용해 list를 지움
        linkedList.clear(); //지우는 코드

        System.out.println(linkedList.isEmpty());

        //linkedList는 list 인터페이스를 상속 받아 ArrayList와 사용하는 방법이 거의 유사함
        //하지만 내부적으로는 요소를 저장하는 방법에 차이가 있는 것이다
        //각 컬렉션 프레임 워크 클래스의 특징을 파악하고 그에 따라 적합한 자료구조를 구현한 클래스를 선택하는 것이 좋다

    }
}
