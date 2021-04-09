package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class Crazing1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazing1);

        RecyclerView recyclerView = findViewById(R.id.rv5);
        ArrayList<Expand> list = new ArrayList<>();

        list.add(new Expand("Info :" , "• Craze cracks on concrete is when the surface of concrete develops a lot of fine cracks.\n" +
                "• Crazing of concrete is a result of conditions and curing methods at the point the concrete is laid or even the way it is finished.\n" +
                "• Crazing usually only shows up within the first week after the slab was laid."));


        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}