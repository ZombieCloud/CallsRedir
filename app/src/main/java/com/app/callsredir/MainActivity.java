package com.app.callsredir;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn10 = (Button) findViewById(R.id.button10);
        btn11 = (Button) findViewById(R.id.button11);
        btn12 = (Button) findViewById(R.id.button12);
    }


    // Синицкий 0504210344
    public void button1_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380504210344" + Uri.encode("#")));
        startActivity(intent);
    }

    // Демянчук 0953011698
    public void button2_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380953011698" + Uri.encode("#")));
        startActivity(intent);
    }

    // Смарцелов 0503420568
    public void button3_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380503420568" + Uri.encode("#")));
        startActivity(intent);
    }

    // Генрих 0504519112
    public void button4_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380504519112" + Uri.encode("#")));
        startActivity(intent);
    }

    // Литвяк 0952351017
    public void button5_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380952351017" + Uri.encode("#")));
        startActivity(intent);
    }

    // Матвиенко 0955191226
    public void button6_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380955191226" + Uri.encode("#")));
        startActivity(intent);
    }

    // Денис 0952352656
    public void button7_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380952352656" + Uri.encode("#")));
        startActivity(intent);
    }

    // Федорченко 0504211071
    public void button8_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380504211071" + Uri.encode("#")));
        startActivity(intent);
    }

    // Емец 0952351007
    public void button9_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380952351007" + Uri.encode("#")));
        startActivity(intent);
    }

    // Некрасов 0990787005
    public void button12_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:**21*+380990787005" + Uri.encode("#")));
        startActivity(intent);
    }

    // Путин -
    public void button11_OnClick(View v) throws InterruptedException{
        Toast.makeText(getApplicationContext(), "Хуйло", Toast.LENGTH_LONG).show();
//        Intent intent = new Intent(Intent.ACTION_CALL);
//        intent.setData(Uri.parse("tel:**21*+380990787005" + Uri.encode("#")));
//        startActivity(intent);
    }

    // Сброс
    public void button10_OnClick(View v) throws InterruptedException{
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + Uri.encode("#") + "" + Uri.encode("#") + "21" + Uri.encode("#")));
        startActivity(intent);
    }
}
