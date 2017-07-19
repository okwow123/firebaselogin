package com.example.root.mydatabase;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button button;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.editText);
        textView= (TextView)findViewById(R.id.textView);

        button =(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String dbname=editText.getText().toString();
                opendatabase(dbname);
            }
        });

    }

    public void opendatabase(String dbname){
        println("opendatabase call!");
        db = openOrCreateDatabase(dbname,MODE_PRIVATE,null);
        if (db!=null){
            println("database open!");
        }
    }

    public void println(String data){
        textView.append(data+"\n");
    }


}
