package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class HorizontalCrack1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_crack1);

        RecyclerView recyclerView = findViewById(R.id.rv19);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Characteristics :" , "• Occur at the beam column junction.\n" +
                "• Moment resistance capacity of column inadequate in the corresponding region.\n" +
                "• Inadequate quantum of reinforcement or disposition of reinforcement not satisfactory."));


        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}