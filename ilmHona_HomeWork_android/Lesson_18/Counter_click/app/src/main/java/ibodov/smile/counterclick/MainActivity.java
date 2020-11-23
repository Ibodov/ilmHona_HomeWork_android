package ibodov.smile.counterclick;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    TextView numb;
    Button button;
    Button button1;
   private int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.ic_android);
        numb = findViewById(R.id.numb);
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.reset);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                numb.setText(String.valueOf(count));
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        imageView.setOnClickListener(new View.OnClickListener() { // setOnClickListener прописан в классе View
            @Override                               //имплиминтируется метод onClick
            public void onClick(View view) {
                count++;   //при нажатии Увеличивается на 1.
                numb.setText(String.valueOf(count));

            }
        });




    }
}