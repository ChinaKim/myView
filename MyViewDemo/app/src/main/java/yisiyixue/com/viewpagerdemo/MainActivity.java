package yisiyixue.com.viewpagerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FrameLayout frame_main;
    private Button btn_add;
    private Button btn_remove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frame_main = (FrameLayout)findViewById(R.id.frame_main);
        btn_add = (Button)findViewById(R.id.btn_add);
        btn_remove = (Button)findViewById(R.id.btn_remove);

        final MyView myView = new MyView(this);
//        frame_main.addView(myView);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frame_main.addView(myView);
            }
        });

        btn_remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                frame_main.removeView(myView);
                frame_main.setVisibility(View.GONE);
            }
        });

    }
}
