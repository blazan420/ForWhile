package com.example.kjobrien.forwhile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtStart = (TextView) findViewById(R.id.txtStart);
        final TextView txtI = (TextView) findViewById(R.id.txtI);
        final TextView txtSwitch = (TextView) findViewById(R.id.txtSwitch);
        Button btnSwitch = (Button) findViewById(R.id.btnSwitch);
        Button btnLoop = (Button) findViewById(R.id.btnLoop);

        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // -------------for LOOP----------
                /* for (int i = 0; i <= 10; i++) {
                    txtStart.setText(i + "");*/



                /*// -------------WHILE LOOP--------------
                int i = 0;

                while (i <= 10) {

                    txtStart.setText(i + "");
                    i++;

                }

                txtI.setText(i + "");


                // ------------ DO WHILE LOOP ------------
                /*int y = 40;

                do{
                    txtStart.setText(y + "");
                    y++;

                } while (y <= 15);*/

                /*for (int x = 0; x < 30; x++) {

                    if (x == 10) {
                        break;
                    }

                    Log.i("LOG", x + "");
                }

                    /*if (x == 10) {
                        break;
                    }*/

                    /*if(x == 5) {
                        continue;
                    }

                    Log.i("LOG", x + "");*/

                //for (int x = 0; x <30; x++) {

                //  Log.i("LOG",  x + "");*/

                for (int x = 0; x <30; x++) {

                    /*if (x == 10) {
                        break;
                    }*/

                    if(x == 5){
                        continue;
                    }

                    Log.i("LOG", x + "");

                }


            }
        });


        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*String nameString = "crap";

                switch (nameString) {

                    case "Animal1":
                        txtSwitch.setText("Our Animal name is animal1");
                        break;
                    case "Lion":
                        txtSwitch.setText("The name of our animal is Lion");
                        break;

                        default:
                           txtSwitch.setText("The name of our animal is Something Else");



                }*/


            }
        });
    }
}
