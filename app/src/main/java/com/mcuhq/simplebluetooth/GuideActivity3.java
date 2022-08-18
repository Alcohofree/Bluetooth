package com.mcuhq.simplebluetooth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class GuideActivity3 extends AppCompatActivity {
    public void onCreate (Bundle savedInstanceState){
        super.onCreate (savedInstanceState);
        setContentView(R.layout.activity_guide3);

        Button imageButton = (Button) findViewById(R.id.status_gonext3_btn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //그 다음 보여질 화면 StartMeasure -> Blutooth
                Intent intent = new Intent(getApplicationContext(),MeasureActivity.class);
                startActivity(intent);
            }
        });


    }


}

