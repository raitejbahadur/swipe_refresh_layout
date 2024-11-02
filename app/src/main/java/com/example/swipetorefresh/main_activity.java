package com.example.swipetorefresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.TextView;

public class main_activity extends AppCompatActivity {

    SwipeRefreshLayout refreshlayout;
    TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        refreshlayout=(SwipeRefreshLayout) findViewById(R.id.refreshlayout);
        text_view=(TextView) findViewById(R.id.text_view);

        refreshlayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                refreshlayout.setRefreshing(false);
            }
        });
    }
}