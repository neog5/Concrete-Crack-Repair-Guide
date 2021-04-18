package com.example.concretecrackrepairguide.Reptech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class Stitching extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Expand> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stitching);

        list.add(new Expand("1. Grind the crack across its surface to ensure it is smooth." , "" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));

        //list.add(new Expand("2  " , "" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));

        list.add(new Expand("3. Cut the groove where the crack locks are to be installed. Crack locks should be spaced at 300mm to 450mm intervals." , "" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));

        list.add(new Expand("4. Clean the groove and remove any debris from it." , "" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));

        list.add(new Expand("5.  Place the crack locks in the groove .  " , "" ,R.drawable.expanding_background2 ));

        list.add(new Expand("6. Seal it with epoxy resin and allow it to cure." , "" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));

        list.add(new Expand("Some materials which can be used:\n" +
                "1. Reinforcing bar:-\n" +
                "Stainless steel with ultimate tensile strength – 1050N/mm2  to 1200N/mm2\n" +
                "2. Grout Material:-\n" , "" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));

        recyclerView = findViewById(R.id.s_rv);
        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}