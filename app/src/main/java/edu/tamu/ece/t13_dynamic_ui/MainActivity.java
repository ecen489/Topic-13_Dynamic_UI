package edu.tamu.ece.t13_dynamic_ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton = new Button(this);
        LinearLayout layout = (LinearLayout) findViewById(R.id.mainlayout);

        //Set layout parameters for button
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);  // width, height
        params.gravity=Gravity.CENTER;
        mybutton.setLayoutParams(params);

        // Set button properties
        mybutton.setText("Click!");
        mybutton.setTextSize(20);
        mybutton.setPadding(40,0,30,20);

        layout.addView(mybutton,1);

    }
}
