package com.emmaguy.bellquicktile;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageView imageView = (ImageView) findViewById(R.id.blah);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(final View view) {
                ((Animatable) imageView.getDrawable()).start();
            }
        });
    }
}
