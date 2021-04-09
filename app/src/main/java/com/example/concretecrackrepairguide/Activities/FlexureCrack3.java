package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class FlexureCrack3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexure_crack3);

        RecyclerView recyclerView = findViewById(R.id.rv2);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Info" , "•\tCorrosion crack in reinforced concrete beam caused along the line of reinforcement. Because of these crack concrete be apart from the reinforcing bars.These crack is also called bond crack."));


        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}