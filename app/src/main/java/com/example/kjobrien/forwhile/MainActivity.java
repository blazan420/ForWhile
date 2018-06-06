package com.example.kjobrien.forwhile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtStart = (TextView)findViewById(R.id.txtStart);
        Button btnLoop = (Button)findViewById(R.id.btnLoop);

        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // -------------for LOOP----------
                /* for (int i = 0; i <= 10; i++) {
                    txtStart.setText(i + "");



                // -------------WHILE LOOP--------------
                int i = 0;

                while (i <= 10) {

                    txtStart.setText(i + "");
                    i++;

                }*/


                // ------------ DO WHILE LOOP ------------
                int y = 0;

                do{
                    txtStart.setText(y + "");
                    y++;

                } while (y <= 15);
            }
        });
    }
}
