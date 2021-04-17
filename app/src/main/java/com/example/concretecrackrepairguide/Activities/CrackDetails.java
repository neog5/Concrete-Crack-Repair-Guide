package com.example.concretecrackrepairguide.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.CrackModel;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.Model.RepTech;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class CrackDetails extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    RecyclerView recyclerView;

    boolean reverseRt(boolean a) {
        return a = !a;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crack_details);

        Intent it = getIntent();

        //Setting the image and text
        CrackModel crackModel ;
        crackModel = it.getParcelableExtra("Het");
        imageView = findViewById(R.id.main_image);
        textView = findViewById(R.id.main_text);
        recyclerView = findViewById(R.id.main_rv);

        imageView.setImageResource(crackModel.getPic());
        textView.setText(crackModel.getName());



        ArrayList<Expand> list2 = it.getParcelableArrayListExtra("Ashwini");




        ExAdapter adapter = new ExAdapter(list2, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Setting the repair techniques

        //Initializing the TextViews
        TextView rt, epo, ras, gro, sti, fls, ovr;
        LinearLayout expTech = findViewById(R.id.expand_techniques);
        RepTech repTech = new RepTech(false);
        boolean[] list3 = it.getBooleanArrayExtra("3000 bacche");

        rt = findViewById(R.id.rpt);
        epo = findViewById(R.id.epo);
        ras = findViewById(R.id.ras);
        gro = findViewById(R.id.gro);
        sti = findViewById(R.id.sti);
        fls = findViewById(R.id.fls);
        ovr = findViewById(R.id.ovr);


        //Hiding the LinearLayout by default
        expTech.setVisibility(View.GONE);
        epo.setVisibility(list3[0] ? View.VISIBLE : View.GONE);
        ras.setVisibility(list3[1] ? View.VISIBLE : View.GONE);
        gro.setVisibility(list3[2] ? View.VISIBLE : View.GONE);
        sti.setVisibility(list3[3] ? View.VISIBLE : View.GONE);
        fls.setVisibility(list3[4] ? View.VISIBLE : View.GONE);
        ovr.setVisibility(list3[5] ? View.VISIBLE : View.GONE);


        rt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                repTech.setExpanded(!repTech.isExpanded());
                expTech.setVisibility(repTech.isExpanded() ? View.VISIBLE : View.GONE);

            }
        });

    }
}