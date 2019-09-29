package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class caatinga_plants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caatinga_plants_page);
    }

    public void back_to_Menu (View view2){
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(caatinga_plants.this, MainActivity.class);
                startActivity(it2);
            }
        });
    }

    public void details (View view3){
        Button button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3 = new Intent(caatinga_plants.this, Details_Plant.class);
                startActivity(it3);
            }
        });
    }

    public void Create (View view4){
        Button button9 = (Button)findViewById((R.id.button9));
        button9.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it4 = new Intent(caatinga_plants.this, How_to_Create.class);
                startActivity((it4));
            }
        }));
    }
}
