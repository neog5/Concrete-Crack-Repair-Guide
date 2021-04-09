package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class PrematureDrying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premature_drying);

        RecyclerView recyclerView = findViewById(R.id.rv23);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Info :" , "• Crazing cracks are very fine, surface cracks that resemble spider webs or shattered glass. When the top of a concrete slab loses moisture too quickly, crazing cracks will likely appear. While unsightly, crazing cracks are not a structural concern.\n" +
                "• Crusting cracks typically happen during the concrete stamping process, which is a way of adding texture or pattern to concrete surfaces. "));


        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}