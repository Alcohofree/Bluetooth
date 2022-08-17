package com.mcuhq.simplebluetooth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Status1Activity extends AppCompatActivity {

    Button gohome;
    TextView result1;

    //public static Context context_main;

    // MeasureAcitivity의 변수에 접근하기 위한 코드
    ConnectedThread mConnectedThread = ((MeasureActivity)MeasureActivity.context_main).mConnectedThread;
    String readMessage = ((MeasureActivity)MeasureActivity.context_main).readMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status1);

        gohome = (Button) findViewById(R.id.status_gohome_btn);
        result1 = (TextView) findViewById(R.id.status_measured_value_tv);

        //context_main = this;

        //값 받아와서 변화되는 코드
        result1.setText(readMessage + "%");

        // "홈으로"버튼 누르면 2 보내주고 초기 화면으로 전환
        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mConnectedThread != null)
                    mConnectedThread.write("2");

                //result.setText(readMessage);     // 측정된 알코올수치를 결과값으로 띄워줌
                Intent intent = new Intent(getApplicationContext(), MeasureActivity.class);
                startActivity(intent);
            }
        });
    }
}
