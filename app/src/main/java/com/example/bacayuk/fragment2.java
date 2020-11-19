package com.example.bacayuk;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class fragment2 extends AppCompatActivity {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private RecyclerView rvbuku;
    private ArrayList<buku>list= new ArrayList<>();

    // TODO: Rename and change types of parameters
    //private String mParam1;
    //private String mParam2;

    public fragment2()
    {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment2);

        rvbuku=findViewById(R.id.rv_buku);
        rvbuku.setHasFixedSize(true);

        list.addAll(DataBuku.getListData());
        showRecyclerlist();
    }

    private void showRecyclerlist()
    {
        rvbuku.setLayoutManager(new LinearLayoutManager(this));
        ListBukuAdapter listBukuAdapter=new ListBukuAdapter(list);
        rvbuku.setAdapter(listBukuAdapter);
    }


}