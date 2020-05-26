package com.example.add_toolbar;
//目的:新增自己定義的toolbar
//1.到values/styles/ 把   <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">改成NoActionBar
//2.layout底下新增一個toolbar value要改toolbar
//3.在要加入自訂toolbar的頁面宣告要加的tooblar為何layout="@layout/toolbar"




//排整自型:1.選取要排整的範圍 2.ALT+Ctrl + L
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Bundle;
import android.transition.Visibility;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("哈摟");
        toolbar.setTitleMarginStart(100);
        toolbar.setSubtitle("這室內文");
        toolbar.setSubtitleTextColor(Color.BLUE);
        setSupportActionBar(toolbar); //設定為Actionbar
        ActionBar actionBar =  getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true); //設定返回箭頭(true/false)

    }
}
