package com.example.parcialdam;


import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    DBHelper dbHelper;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottonGuardar();
    }

    public void bottonGuardar() {
        EditText nombre = (EditText) findViewById(R.id.editTextNombre);
        EditText apellido= (EditText) findViewById(R.id.editTextApellido);
        Button guardar = (Button) findViewById(R.id.buttonGuardar);

         dbHelper = DBHelper.getInstance(MainActivity.this);
         SQLiteDatabase db=  dbHelper.getWritableDatabase();
         guardar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {



         }
     });




    }


}