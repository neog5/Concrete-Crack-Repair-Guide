package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class CorrosionCrackColumn1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corrosion_crack_column1);

        RecyclerView recyclerView = findViewById(R.id.rv69);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Characteristics :" , "• Runs along the line of reinforcement.\n" +
                "• Generally it has uniform width.\n" +
                "• Also occurs in slab."));
        list.add(new Expand("Possible reasons :" , "• Due to these crack bond between reinforcement bars and concrete is not sufficient.\n" +
                "• Occurs due to corrosion of bars."));


        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}