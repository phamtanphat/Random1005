package khoapham.ptp.phamtanphat.random1005;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnRandom , btnAdd;
    EditText edtSomin,edtSomax;
    TextView txtKetqua;
    ArrayList<Integer> mangso = new ArrayList<>();
    String ketqua = "";
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
        btnAdd = findViewById(R.id.buttonAdd);
        btnRandom = findViewById(R.id.buttonRandom);
        edtSomax = findViewById(R.id.edtittextSomax);
        edtSomin = findViewById(R.id.edtittextSomin);
        txtKetqua = findViewById(R.id.textviewKetqua);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mangso.clear();
                String somin = edtSomin.getText().toString().trim();
                String somax = edtSomax.getText().toString().trim();

                if (somin.length() > 0 && somax.length() > 0){
                    int smin = Integer.parseInt(somin);
                    int smax = Integer.parseInt(somax);
                    if(smax <= smin){
                        smax = smin + 1;
                    }
                    for (int i = smin ; i<= smax ; i++){
                        mangso.add(i);
                    }
                    edtSomax.setText(smax + "");
                    edtSomin.setText(smin + "");
                }else{
                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                if (mangso.size() >0){
                    int index = random.nextInt(mangso.size());
                    ketqua += mangso.get(index) + " - ";
                    txtKetqua.setText(ketqua);
                    mangso.remove(index);
                }else{
                    Toast.makeText(MainActivity.this, "Het gia tri random", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
