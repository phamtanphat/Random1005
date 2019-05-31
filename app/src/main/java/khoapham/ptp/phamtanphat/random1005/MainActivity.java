package khoapham.ptp.phamtanphat.random1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRandom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRandom = findViewById(R.id.buttonRandom);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Random random = new Random();
//                // random trong khoang 5- 10
//                int value = random.nextInt(10 - 5 + 1) + 5;
////                Log.d("BBB",value + "");
//                int a = 10;
//                int b = 20;
//                int c = a++ + --b + b++ + --a ;
                //10 + --b + b++ + --a
                // 10 + 19 + 19 + 10

//                Log.d("BBB", c + "");
            }
        });
    }
}
