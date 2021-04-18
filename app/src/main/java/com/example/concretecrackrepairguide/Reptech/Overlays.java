package com.example.concretecrackrepairguide.Reptech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class Overlays extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Expand> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overlays);

        list.add(new Expand("Procedure  " , "1. Clean the floor.\n" +
                "2. You can use vacuum to do this.\n" +
                "3. Hydrate the floor with clean water.\n" +
                "4. Pour out scratch coat.\n" +
                "5. Use a flat metal trowel to move material.\n" +
                "6. Pull material tight to fill in low spots from texture coat.\n" +
                "7. Apply appropriate material coat.\n" , R.drawable.expanding_background2));

        list.add(new Expand("Some of the materials used  " , "1. Normal or high early strength Portland cement concrete and mortar\n" +
                "2. Latex modified concrete\n" +
                "3. Fibre reinforced concrete\n" +
                "4. Silica fume concrete\n" +
                "5. High alumina cement concrete and mortar\n" +
                "6. Polymer concrete\n" +
                "7. Epoxy concrete\n" , R.drawable.expanding_background2));

        recyclerView = findViewById(R.id.ov_rv);
        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}