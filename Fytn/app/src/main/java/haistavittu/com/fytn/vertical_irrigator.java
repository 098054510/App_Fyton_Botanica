package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vertical_irrigator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical_irrigator);
    }

    public void Menu (View view){
        Button button10C = (Button)findViewById(R.id.button10C);
        button10C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(vertical_irrigator.this, MainActivity.class);
                startActivity(it);
            }
        });
    }

    public void History (View view2){
        final Button History_vertical_irrigator = (Button)findViewById(R.id.History_vertical_irrigator);
        History_vertical_irrigator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2 = new Intent(vertical_irrigator.this, History_vertical_irrigator.class);
                startActivity(it2);
            }
        });
    }
}
