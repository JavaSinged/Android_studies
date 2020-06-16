package com.example.shinjiwoong.part4_12;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        //아이콘 이미지 생성하는 함
        actionBar.setDisplayShowHomeEnabled(true);
        //<- 화살표 생성하는 함수
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setIcon(R.drawable.icon);
    }

    //뒤로가기 버튼 클릭 시 호출되는 함수
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == android.R.id.home) {
            Toast t = Toast.makeText(this, "HOME AS UP CLICK", Toast.LENGTH_SHORT);
            t.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
