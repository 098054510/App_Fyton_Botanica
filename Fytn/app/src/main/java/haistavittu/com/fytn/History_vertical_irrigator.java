package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class History_vertical_irrigator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_vertical_irrigator);
    }

    public void Back (View view){
        Button button10D = (Button)findViewById(R.id.button10D);
        button10D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(History_vertical_irrigator.this, vertical_irrigator.class);
                startActivity(it);
            }
        });
    }
}
