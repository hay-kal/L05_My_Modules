package sg.edu.rp.c346.id21040411.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Two extends AppCompatActivity {

    TextView tvMod;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        tvMod = findViewById(R.id.textView);
        btnBack = findViewById(R.id.btnBack);

        Intent intentReceived = getIntent();
        String modSelected = intentReceived.getStringExtra("Module");
        String modName = intentReceived.getStringExtra("Name");
        String modVenue = intentReceived.getStringExtra("Venue");


        tvMod.setText("Module Code: " + modSelected + "\n" +
                "Module Name: " + modName + "\n" +
                "Academic Yea: 2022" + "\n" +
                "Semester: 1" + "\n" +
                "Module Credit: 4" + "\n" +
                "Venue: " + modVenue);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

    }
}