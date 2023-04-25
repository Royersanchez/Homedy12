package com.example.homedy;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SearchView;


public class MainActivity extends AppCompatActivity {

    Button btn_add, btn_add_fragment, btn_exit;
    SearchView search_view;
    DownloadManager.Query query;

    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}