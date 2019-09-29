package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class How_to_Create extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to__create);
    }

    public void Back_to_caatinga (View view){
        Button buttonTen = (Button)findViewById(R.id.buttonTen);
        buttonTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it4 = new Intent(How_to_Create.this, caatinga_plants.class);
                startActivity(it4);
            }
        });
    }
}
