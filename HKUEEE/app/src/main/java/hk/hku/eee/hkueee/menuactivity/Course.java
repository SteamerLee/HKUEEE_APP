package hk.hku.eee.hkueee.menuactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import hk.hku.eee.hkueee.R;
import hk.hku.eee.hkueee.program.Communication;
import hk.hku.eee.hkueee.program.Link;
import hk.hku.eee.hkueee.program.Power;

public class Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        Button button_stream_information = (Button) findViewById(R.id.general);
        button_stream_information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course.this,Link.class);
                startActivity(intent);

            }

        });
        Button button3 = (Button) findViewById(R.id.Communication);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course.this,Communication.class);
                startActivity(intent);
            }
        });


        Button button4 = (Button) findViewById(R.id.Power);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Course.this,Power.class);
                startActivity(intent);
            }
        });

    }
}
