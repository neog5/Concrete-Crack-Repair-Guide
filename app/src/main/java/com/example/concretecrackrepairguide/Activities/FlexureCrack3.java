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

        RecyclerView recyclerView = findViewById(R.id.rv14);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Characteristics :" , "• It generate in maximum moment region.\n" +
                "• Flexural crack may be single or in groups.\n" +
                "• Maximum width at the bottom or top of the beam.\n" +
                "• This type of crack also occurs in slab."));
        list.add(new Expand("Possible reasons :" , "• Flexural capacity of beam is insufficient.\n" +
                "• When cross section of the beam or reinforcement in beam is insufficient.\n" +
                "• Caused due to more than defined load."));


        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}