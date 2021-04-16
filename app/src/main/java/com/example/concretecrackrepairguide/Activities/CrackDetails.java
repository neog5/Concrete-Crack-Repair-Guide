package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.CrackModel;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class CrackDetails extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crack_details);
        CrackModel crackModel ;
        Intent it = getIntent();
        crackModel = it.getParcelableExtra("Het");

        imageView = findViewById(R.id.main_image);
        textView = findViewById(R.id.main_text);
        recyclerView = findViewById(R.id.main_rv);

        imageView.setImageResource(crackModel.getPic());
        textView.setText(crackModel.getName());


        ArrayList<Expand> list2 = it.getParcelableArrayListExtra("Ashwini");




        ExAdapter adapter = new ExAdapter(list2, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}