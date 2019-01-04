package hk.hku.eee.hkueee.menuactivity;
/*
* This is FAQ function, including 14 questions
* Using scrollview to realize many items displayed in the same page.
* User can click each question to read the answer.
* Developer: Samuel
* */
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import hk.hku.eee.hkueee.FQ.fq1;
import hk.hku.eee.hkueee.FQ.fq2;
import hk.hku.eee.hkueee.FQ.fq3;
import hk.hku.eee.hkueee.FQ.fq4;
import hk.hku.eee.hkueee.FQ.fq5;
import hk.hku.eee.hkueee.FQ.fq6;
import hk.hku.eee.hkueee.FQ.fq7;
import hk.hku.eee.hkueee.FQ.fq8;
import hk.hku.eee.hkueee.FQ.fq9;
import hk.hku.eee.hkueee.FQ.fq10;
import hk.hku.eee.hkueee.FQ.fq11;
import hk.hku.eee.hkueee.FQ.fq12;
import hk.hku.eee.hkueee.FQ.fq13;
import hk.hku.eee.hkueee.FQ.fq14;

import hk.hku.eee.hkueee.HomeActivity;
import hk.hku.eee.hkueee.R;

public class FAQ extends AppCompatActivity {

    private Button fq1;
    private Button fq2;
    private Button fq3;
    private Button fq4;
    private Button fq5;
    private Button fq6;
    private Button fq7;
    private Button fq8;
    private Button fq9;
    private Button fq10;
    private Button fq11;
    private Button fq12;
    private Button fq13;
    private Button fq14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton cfaqback = (FloatingActionButton) findViewById(R.id.faqback);
        cfaqback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent cfaqback1 = new Intent(FAQ.this, HomeActivity.class);
                startActivity(cfaqback1);
            }
        });


        fq1 = (Button)findViewById(R.id.fq1);
        fq2 = (Button)findViewById(R.id.fq2);
        fq3 = (Button)findViewById(R.id.fq3);
        fq4 = (Button)findViewById(R.id.fq4);
        fq5 = (Button)findViewById(R.id.fq5);
        fq6 = (Button)findViewById(R.id.fq6);
        fq7 = (Button)findViewById(R.id.fq7);
        fq8 = (Button)findViewById(R.id.fq8);
        fq9 = (Button)findViewById(R.id.fq9);
        fq10 = (Button)findViewById(R.id.fq10);
        fq11 = (Button)findViewById(R.id.fq11);
        fq12 = (Button)findViewById(R.id.fq12);
        fq13 = (Button)findViewById(R.id.fq13);
        fq14 = (Button)findViewById(R.id.fq14);

        Buttonfq1();
        Buttonfq2();
        Buttonfq3();
        Buttonfq4();
        Buttonfq5();
        Buttonfq6();
        Buttonfq7();
        Buttonfq8();
        Buttonfq9();
        Buttonfq10();
        Buttonfq11();
        Buttonfq12();
        Buttonfq13();
        Buttonfq14();

    }

    private void Buttonfq1(){
        fq1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq1 = new Intent(FAQ.this, fq1.class);
                startActivity(cButtonfq1);
            }
        });
    }

    private void Buttonfq2(){
        fq2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq2 = new Intent(FAQ.this, fq2.class);
                startActivity(cButtonfq2);
            }
        });
    }

    private void Buttonfq3(){
        fq3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq3 = new Intent(FAQ.this, fq3.class);
                startActivity(cButtonfq3);
            }
        });
    }

    private void Buttonfq4(){
        fq4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq4 = new Intent(FAQ.this, fq4.class);
                startActivity(cButtonfq4);
            }
        });
    }

    private void Buttonfq5(){
        fq5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq5 = new Intent(FAQ.this, fq5.class);
                startActivity(cButtonfq5);
            }
        });
    }

    private void Buttonfq6(){
        fq6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq6 = new Intent(FAQ.this, fq6.class);
                startActivity(cButtonfq6);
            }
        });
    }

    private void Buttonfq7(){
        fq7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq7 = new Intent(FAQ.this, fq7.class);
                startActivity(cButtonfq7);
            }
        });
    }

    private void Buttonfq8(){
        fq8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq8 = new Intent(FAQ.this, fq8.class);
                startActivity(cButtonfq8);
            }
        });
    }

    private void Buttonfq9(){
        fq9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq9 = new Intent(FAQ.this, fq9.class);
                startActivity(cButtonfq9);
            }
        });
    }

    private void Buttonfq10(){
        fq10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq10 = new Intent(FAQ.this, fq10.class);
                startActivity(cButtonfq10);
            }
        });
    }

    private void Buttonfq11(){
        fq11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq11 = new Intent(FAQ.this, fq11.class);
                startActivity(cButtonfq11);
            }
        });
    }

    private void Buttonfq12(){
        fq12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq12 = new Intent(FAQ.this, fq12.class);
                startActivity(cButtonfq12);
            }
        });
    }

    private void Buttonfq13(){
        fq13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq13 = new Intent(FAQ.this, fq13.class);
                startActivity(cButtonfq13);
            }
        });
    }

    private void Buttonfq14(){
        fq14.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent cButtonfq14 = new Intent(FAQ.this, fq14.class);
                startActivity(cButtonfq14);
            }
        });
    }



}
