package com.example.atry;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class ThankYouActivity extends AppCompatActivity {
    ImageView imageView1,imageView2;
    TextView editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        imageView1=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView2);
        editText=findViewById(R.id.textView);
        //imageView2.setImageResource(R.drawable.);
        imageView1.setImageResource(R.drawable.thank);
        editText.setText("We will definitely work on your feedback!");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(ThankYouActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },4000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
