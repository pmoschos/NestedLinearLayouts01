package gr.aueb.cf.linearlayout01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private Button javaBtn;
    private Button csharpBtn;
    private Button pythonBtn;
    private Button phpBtn;
    private Button javascriptBtn;
    private Button angularBtn;
    private Button sqlBtn;
    private Button mongodbBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);

        javaBtn = findViewById(R.id.javaBtn);
        csharpBtn = findViewById(R.id.csharpBtn);
        pythonBtn = findViewById(R.id.pythonBtn);
        phpBtn = findViewById(R.id.phpBtn);
        javascriptBtn = findViewById(R.id.javascriptBtn);
        angularBtn = findViewById(R.id.angularBtn);
        sqlBtn = findViewById(R.id.sqlBtn);
        mongodbBtn = findViewById(R.id.mongodbBtn);

        javaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello Java!", Toast.LENGTH_SHORT).show();
            }
        });

        csharpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello C#!", Toast.LENGTH_SHORT).show();
            }
        });

        pythonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello Python!", Toast.LENGTH_SHORT).show();
            }
        });

        phpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello Php!", Toast.LENGTH_SHORT).show();
            }
        });

        javascriptBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello Javascript!", Toast.LENGTH_SHORT).show();
            }
        });

        angularBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello Angular!", Toast.LENGTH_SHORT).show();
            }
        });

        sqlBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello SQL!", Toast.LENGTH_SHORT).show();
            }
        });

        mongodbBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Hello MONGODB!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}