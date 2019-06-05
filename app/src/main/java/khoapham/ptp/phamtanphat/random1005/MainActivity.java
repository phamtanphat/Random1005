package khoapham.ptp.phamtanphat.random1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRandom;
    ArrayList<Integer> mangso = new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Kiem tra so min , so max
//            + So max khong duoc nho so min (somax = smin  + 1)
//            + Phai truyen vao la so (khong cho truyen cho chuoi)
//            + Không bỏ trống số min hoặc max (nếu trống 1 or 2 thông báo cho người dùng điền vào)
        //Xử lý random
//            +Không có nào random trùng với nhau
//            +Khi random hết số thông báo cho người dùng biết
        //Hiển thị
//            + Điều kiện hiển thị 1 : 1-2-3-4-5-6-1-
//            + Điều kiện hiển thị 2 : 1-2-3-4-5-6-7
        btnRandom = findViewById(R.id.buttonRandom);

        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int index = random.nextInt(mangso.size());
                Log.d("BBB",index + "");
                mangso.remove(index);
                for (int i = 0 ; i<mangso.size() ; i++){
                    Log.d("BBB","Sau khi xoa " + mangso.get(i) + " , index " + i);
                }
            }
        });

    }
}
