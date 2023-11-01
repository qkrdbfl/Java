package com.ohgriffers.section.map.section02.set.run;

import java.util.LinkedHashSet;

public class Application2 {
    public static void main(String[] args) {
        // LinkedHashSet에 대해 이해하고 사용하기
        //HashSet이 가지는 기능을 모두 가지고 있으며 추가적으로 저장 순서를 유지하는 특징을 가지고 있다
        //JDK 1.4부터 제공

        LinkedHashSet<String> lhert = new LinkedHashSet<>();

        lhert.add("java");
        lhert.add("oracle");
        lhert.add("jdbc");
        lhert.add("html");
        lhert.add("css");

        System.out.println("lhert : "+ lhert);

        //저장 순서를 Link를 통해 유지하고 있는 것 확인
        System.out.println("lhert : "+ lhert);

    }
}
