package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class PlasticShrinkage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plastic_shrinkage);

        RecyclerView recyclerView = findViewById(R.id.rv21);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Characteristics :" , "• Plastic shrinkage cracks typically occur on horizontal surfaces exposed to the atmosphere.\n" +
                "• Plastic shrinkage cracks are typically two to four inches deep and approximately one-eighth inch wide.\n" +
                "• The cracks tend to follow the edges of large aggregate particles or reinforcing bars and never break through the aggregate particles.69" +
                ""));


        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}