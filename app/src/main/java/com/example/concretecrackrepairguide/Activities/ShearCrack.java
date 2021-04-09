package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class ShearCrack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shear_crack);

        RecyclerView recyclerView = findViewById(R.id.rv26);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Characteristics :" , "• Generate nearer to the supports of the beam\n" +
                "• It may be single or in groups.\n" +
                "• Maximum width at neutral axis region or at the bottom of the beam."));
        list.add(new Expand("Possible reasons :" , "• Shear capacity of beam is insufficient.\n" +
                "• Cross section on torsional reinforcement is insufficient.\n" +
                "• Caused due to loaded more than define load."));

        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}