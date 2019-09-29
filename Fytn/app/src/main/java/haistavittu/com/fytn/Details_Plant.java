package haistavittu.com.fytn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Details_Plant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details__plant);
    }

    public void Back (View view4){
      Button button10_A = (Button)findViewById(R.id.button10_A);
      button10_A.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent it4 = new Intent(Details_Plant.this, caatinga_plants.class);
              startActivity(it4);
          }
      });
    }
}
