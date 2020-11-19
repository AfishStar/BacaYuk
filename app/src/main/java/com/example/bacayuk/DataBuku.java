package com.example.bacayuk;

import java.util.ArrayList;

public class DataBuku {
    private static String[] namabuku = {
            "Bumi"
    };

    private static String[] detilbuku = {
            "Bumi adalah sebuah novel karya Tere Liye, novel ini juga adalah bagian pertama dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2014."
    };
    private static int[] fotobuku = {
            R.drawable.cover_buku
    };

    static ArrayList<buku> getListData() {
        ArrayList<buku> list = new ArrayList<>();
        for (int position = 0; position < namabuku.length; position++) {
            buku hero = new buku();
            hero.setName(namabuku[position]);
            hero.setDetail(detilbuku[position]);
            hero.setPhoto(fotobuku[position]);
            list.add(hero);
        }
        return list;
    }
}
