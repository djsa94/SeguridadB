package com.example.daniel.seguridadb;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.botonAtacar);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i<10; i++){
                    Toast toast = Toast.makeText(getApplication().getApplicationContext(), "hizo algo",  Toast.LENGTH_SHORT);
                    toast.show();

                    Intent intent = new Intent("com.example.daniel.seguridada2.crearContacto");
                    intent.putExtra("telefono","555");
                    intent.putExtra("nombre", "666");
                    intent.putExtra("email", "666@gmail.com");

                    getApplicationContext().sendBroadcast(intent);
                    //startActivity(intent);


                }
            }
        });

    }
}
