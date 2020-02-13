package com.kitesoft.ex28activity4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View view) {
        //Ex27Activity4 앱의 SecondActivity클래스 실행하는 묵시적 Intent객체 생성
        Intent intent= new Intent();

        //Ex27Activity4 앱의 SecondActivity클래스에 지정했던 액션값 "aaa"을 지정
        intent.setAction("aaa");

        //디바이스에 설치된 모든 앱들 중에서  "aaa"액션값을 필터링하여 인식할 수 있는 액티비트를 찾아 실행
        startActivity(intent);
        //혹시 디바이스(Phone)에 같은 action값 ("aaa")를 가진 액티비티가 더 있다면 앱을 선택할 수 있는 Choose다이얼로그가 화면아래에 Sheet처럼 보여지며 선택할 수 있음.

        //*** 참고로 액티비티클래스명을 직접 기입하는 명시적Intent는 같은 앱안에 있는 액티비티만 실행할 수 있음. 즉, 다른 앱에 같은 클래스명의 액티비티가 있어서 실행되지 않음 ***
    }
}
