package sg.edu.rp.c346.id21040411.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tvMod1);
        tv2 = findViewById(R.id.tvMod2);
        tv3 = findViewById(R.id.tvMod3);
        tv4 = findViewById(R.id.tvMod4);
        tv5 = findViewById(R.id.tvMod5);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Two.class);
                intent.putExtra("Module","C203");
                intent.putExtra("Name","Web AppIn Development in php");
                intent.putExtra("Venue","W65H");
                startActivity(intent);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Two.class);
                intent.putExtra("Module","C206");
                intent.putExtra("Name","Software Development Process");
                intent.putExtra("Venue","E66K");
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Two.class);
                intent.putExtra("Module","C218");
                intent.putExtra("Name","UI/UX Design for Apps");
                intent.putExtra("Venue","E66B");
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Two.class);
                intent.putExtra("Module","C235");
                intent.putExtra("Name","IT Security and Management");
                intent.putExtra("Venue","E66G");
                startActivity(intent);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Intent intent = new Intent(MainActivity.this, Activity_Two.class);
                intent.putExtra("Module","C346");
                intent.putExtra("Name","Mobile App Development");
                intent.putExtra("Venue","E62E");
                startActivity(intent);
            }
        });
    }
}