package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void caatinga_plants (View view){
        Button going_to_caatinga_plants = (Button)findViewById(R.id.going_to_caatinga_plants);
        going_to_caatinga_plants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent It = new Intent(MainActivity.this, caatinga_plants.class);
                startActivity(It);
            }
        });
    }

    public void Vertical_Irrigator (View view2){
        final Button Project_vertical_irrigator_button = (Button)findViewById(R.id.Project_irrigator_button);
        Project_vertical_irrigator_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent It2 = new Intent(MainActivity.this, vertical_irrigator.class);
                startActivity(It2);
            }
        });

    }
}
