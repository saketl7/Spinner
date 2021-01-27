package com.example.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageview = (ImageView)findViewById(R.id.imageView);
        TextView textview = (TextView)findViewById(R.id.txView1);
        TextView textview2 = (TextView)findViewById(R.id.txView2);
        Spinner myspinner = (Spinner)findViewById(R.id.spTest);
        Spinner myspinner2 = (Spinner)findViewById(R.id.spTest2);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String >(MainActivity.this, android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);
        myspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.prime));
                    myspinner2.setAdapter(myAdapter2);
                    myspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position==0){
                                imageview.setImageResource(R.drawable.movies);
                                textview.setText("");
                            }
                            if(position==1){
                                imageview.setImageResource(R.drawable.robot);
                                textview.setText("Drama,Techno thriller, Psychological thriller");
                                textview2.setText("8.6/10 - IMDB\n" +
                                        "94% - Rotten Tomatoes\n " +
                                        "8.7/10 - TV.com\n");
                            }
                            if(position==2){
                                imageview.setImageResource(R.drawable.joker);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("Hey");
                            }
                            if(position==3){
                                imageview.setImageResource(R.drawable.jackryan);
                                textview.setText("Action, Action fiction, Political thriller, Spy fiction");
                                textview2.setText("8.1/10-IMDb\n"+
                                        "71%-Rotten Tomatoes\n"+
                                "8.2/10-TV.com");
                            }
                            if(position==4){
                                imageview.setImageResource(R.drawable.inception);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==5){
                                imageview.setImageResource(R.drawable.comic);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
                if(position==2){
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.netflix));
                    myspinner2.setAdapter(myAdapter2);
                    myspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position==0){
                                imageview.setImageResource(R.drawable.movies);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==1){
                                imageview.setImageResource(R.drawable.suits);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==2){
                                imageview.setImageResource(R.drawable.spy);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==3){
                                imageview.setImageResource(R.drawable.games);
                                textview.setText("Mystery, Thriller, Drama, Crime novel");
                                textview2.setText("8.7/10-IMDb\n" +
                                        "76%-Rotten Tomatoes");
                            }
                            if(position==4){
                                imageview.setImageResource(R.drawable.stranger);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==5){
                                imageview.setImageResource(R.drawable.reason);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }
                if(position==3){
                    ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MainActivity.this,
                            android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.hotstar));
                    myspinner2.setAdapter(myAdapter2);
                    myspinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                            if (position==0){
                                imageview.setImageResource(R.drawable.movies);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==1){
                                imageview.setImageResource(R.drawable.ops);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==2){
                                imageview.setImageResource(R.drawable.aarya);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==3){
                                imageview.setImageResource(R.drawable.loki);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==4){
                                imageview.setImageResource(R.drawable.justice);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                            if(position==5){
                                imageview.setImageResource(R.drawable.hostages);
                                textview.setText("315 appearances - 87 goals");
                                textview2.setText("My name is Mr Robot");
                            }
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> parent) {

                        }
                    });

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}