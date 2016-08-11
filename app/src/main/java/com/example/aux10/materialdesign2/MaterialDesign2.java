package com.example.aux10.materialdesign2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MaterialDesign2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design2);

        final Button button = (Button) findViewById(R.id.boton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"hola",Toast.LENGTH_SHORT).show();
            }
        });

    }
    //Button button = (Button)findViewById(R.id.boton);




}
