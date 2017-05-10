package com.example.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SabersService {
    List<String> sabers = new ArrayList<String>() {{
        add("Balogh Zsombor");
        add("Barics Norbert");
        add("Brandstadter Tamás");
        add("Dombóvári Péter");
        add("Fekete Imre");
        add("Kállay Levente");
        add("Kármán Petra");
        add("Kemény Viktor");
        add("Kérdő Andrea");
        add("Markovich Zsigmond");
        add("Matiovics Máté");
        add("Nagy Ádám Zoltán");
        add("Nagy Zsolt");
        add("Nagyághy Zita");
        add("Pádár Zsuzsanna");
        add("Perjési Zandraa Attila");
        add("Podobni András");
        add("Stégmár Balázs");
        add("Tekse Balázs");
        add("Varró Virág");
    }};

    public List<String> getSabers() {
        return sabers;
    }

    public String getName(int id) {
        return sabers.get(id);
    }

    public void addName(String name) {
        sabers.add(name);
    }
}
