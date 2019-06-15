package com.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class NextActivity extends AppCompatActivity {

    Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        Bundle bundle=this.getIntent().getExtras();
        int pic=bundle.getInt("image");

        ImageView v = (ImageView) findViewById(R.id.thumbnail);
        v.setImageResource(pic);

        btnback = findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
