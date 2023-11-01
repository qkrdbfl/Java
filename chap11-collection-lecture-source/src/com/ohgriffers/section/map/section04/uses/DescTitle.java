package com.ohgriffers.section.map.section04.uses;

import java.util.Comparator;

public class DescTitle implements Comparator<MusicDTO> {

    @Override
    public int compare(MusicDTO o1, MusicDTO o2) {return o2.getTitle().compareTo(o1.getTitle());
    }

}
