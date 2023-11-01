package com.ohgriffers.section.map.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        //HashMap 을 이용하고 이해

        HashMap hmap = new HashMap();

        //키와 값을 쌍으로 저장함
        //키와 값은 반드시 객체여야 함
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("hmap : " + hmap);

        //키 값은 중복 저장 할수 없다. 최근 키의 값으로 덮어쓰기 된다
        hmap.put(12, "yellow banana");

        System.out.println("hmap : " + hmap);

        //값 객체는 중복 저장 할수 있다
        hmap.put(9, "yellow banana");
        hmap.put(11, "yellow banana");

        System.out.println("hmap: " + hmap);

        //값 객체의 내용을 가져올떄
        System.out.println("키 9에 대한 객체 : " + hmap.get(9)); //여기서는 get이 인덱스가 아니라 키값으로 쓰이고 키값 9를 벨류에 반환하는의미

        //키 값을 가지고 삭제를 처리할떄
        hmap.remove(9);
        System.out.println("hmap: " + hmap);

        //저장된 객체수 확인할때
        System.out.println("hmap에 저장된 객체 수 : " + hmap.size());

        //문자열 키와 문자열 값을 가지는 HashMap 생성
        HashMap<String, String> hmap2 = new HashMap<>(); //<> 안에 키와 벨류 둘다 선언해줘야함

        hmap2.put("one", "java");
        hmap2.put("two", "oracle");
        hmap2.put("three", "jdbc");
        hmap2.put("four", "html");
        hmap2.put("five", "css");

        //1. keuSet() 을 이용해 키만 따로 set으로 만들고 iterator로 키에 대한 목록을 만들기
        Iterator<String> keyIter = hmap2.keySet().iterator(); //iterator()반복자라는 뜻

        while (keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap2.get(key);
            System.out.println(key + " = " + value);
        }

        //2. 저장 된 value 객체들만 values() 로 Collection로 만든다
        Collection<String> values = hmap2.values();

        //2.1 iterator() 로 목록 만들어서 처리
        Iterator<String> valueIter = values.iterator(); //키값은 날라가고 벨류값만 나옴
        while (valueIter.hasNext()){
            System.out.println("value : "+ valueIter.next());
        }

        //2.2 배열로 만들어 처리
        Object[] valueArr = values.toArray();
        for (int i=0; i<valueArr.length; i++){
            System.out.println(i+" = "+ valueArr[i]); //벨류만 떼어냄 키값쪽에 01234 나옴
        }

        //3. Map의 내부 클래스인 EntrySet을 이용 : entrySet()
        Set<Map.Entry<String, String>> set = hmap2.entrySet();

        Iterator<Map.Entry<String,String>> entryIter = set.iterator();

        while (entryIter.hasNext()){
            Map.Entry<String,String> entry = entryIter.next();
            System.out.println(entry.getKey()+" = "+ entry.getKey());
        }
    }
}
