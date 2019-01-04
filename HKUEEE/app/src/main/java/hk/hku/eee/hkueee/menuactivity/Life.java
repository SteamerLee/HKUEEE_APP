package hk.hku.eee.hkueee.menuactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hk.hku.eee.hkueee.R;
import hk.hku.eee.hkueee.life.Learning_space;
import hk.hku.eee.hkueee.life.Sports_Facilities;
import hk.hku.eee.hkueee.life.health;
import hk.hku.eee.hkueee.program.Link;

public class Life extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_life);

            Button button_stream_information = (Button) findViewById(R.id.learning_space);
            button_stream_information.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Life.this,Learning_space.class);
                    startActivity(intent);

                }

            });
            Button button3 = (Button) findViewById(R.id.sport_facilities);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Life.this,Sports_Facilities.class);
                    startActivity(intent);
                }
            });


            Button button4 = (Button) findViewById(R.id.health_service);
            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Life.this,health.class);
                    startActivity(intent);
                }
            });

        }
    }