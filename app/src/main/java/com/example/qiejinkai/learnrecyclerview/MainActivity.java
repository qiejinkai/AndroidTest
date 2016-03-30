package com.example.qiejinkai.learnrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;

    private String [] datas = {"qijeinkai","wangzhe","zhanglong"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        rv = new RecyclerView(this);
        setContentView(rv);
        rv.setLayoutManager(new GridLayoutManager(this, 4));
       // rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        rv.setAdapter(new MyAdapter(this));
        String str ="123";

        String str2 ="123455";
    }

}
