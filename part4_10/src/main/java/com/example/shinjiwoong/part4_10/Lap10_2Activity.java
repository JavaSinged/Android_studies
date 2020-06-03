package com.example.shinjiwoong.part4_10;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Lap10_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lap10_2);

        ListView listView = findViewById(R.id.custom_listview);

        DBHelper helper = new DBHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor cursor = db.rawQuery("select *from tb_drive", null);

        ArrayList<DriveVO> datas = new ArrayList<>();
        while (cursor.moveToNext()) {
            DriveVO vo = new DriveVO();
            vo.type = cursor.getString(3);
            vo.title = cursor.getString(1);
            vo.date = cursor.getString(2);
            datas.add(vo);
        }
        db.close();

        DriveAdapter adapter = new DriveAdapter(this, R.layout.custom_item, datas);
        listView.setAdapter(adapter);
    }
}
