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
import android.widget.Toast;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.CrackModel;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.Model.RepTech;
import com.example.concretecrackrepairguide.R;
import com.example.concretecrackrepairguide.Reptech.EpoxyInjection;
import com.example.concretecrackrepairguide.Reptech.FlexibleSealing;
import com.example.concretecrackrepairguide.Reptech.Grouting;
import com.example.concretecrackrepairguide.Reptech.Overlays;
import com.example.concretecrackrepairguide.Reptech.RoutingAndSealing;
import com.example.concretecrackrepairguide.Reptech.Stitching;

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

        /*ArrayList<Expand> list2 = new ArrayList<>();
        list2.add(new Expand("Cons 1" , "This has 3 para" , R.drawable.expanding_background));
        list2.add(new Expand("Cons 2" , "This has 4 para" , R.drawable.expanding_background2 , R.drawable.diagonal_crack));*/



        ExAdapter adapter = new ExAdapter(list2, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Setting the repair techniques

        //Initializing the TextViews
        TextView rt, epo, ras, gro, sti, fls, ovr, up, down;
        LinearLayout horTech = findViewById(R.id.rt_linear_hori);
        LinearLayout expTech = findViewById(R.id.expand_techniques);
        RepTech repTech = new RepTech(false);
        boolean[] list3 = it.getBooleanArrayExtra("IT");

        rt = findViewById(R.id.rpt);
        epo = findViewById(R.id.epo);
        ras = findViewById(R.id.ras);
        gro = findViewById(R.id.gro);
        sti = findViewById(R.id.sti);
        fls = findViewById(R.id.fls);
        ovr = findViewById(R.id.ovr);
        up = findViewById(R.id.up);
        down = findViewById(R.id.down);



        //Hiding the LinearLayout by default
        expTech.setVisibility(View.GONE);
        down.setVisibility(View.VISIBLE);
        up.setVisibility(View.GONE);
        epo.setVisibility(list3[0] ? View.VISIBLE : View.GONE);
        ras.setVisibility(list3[1] ? View.VISIBLE : View.GONE);
        gro.setVisibility(list3[2] ? View.VISIBLE : View.GONE);
        sti.setVisibility(list3[3] ? View.VISIBLE : View.GONE);
        fls.setVisibility(list3[4] ? View.VISIBLE : View.GONE);
        ovr.setVisibility(list3[5] ? View.VISIBLE : View.GONE);


        horTech.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                repTech.setExpanded(!repTech.isExpanded());
                expTech.setVisibility(repTech.isExpanded() ? View.VISIBLE : View.GONE);
                up.setVisibility(repTech.isExpanded() ? View.VISIBLE : View.GONE);
                down.setVisibility(repTech.isExpanded() ? View.GONE : View.VISIBLE);

            }

        });
        epo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CrackDetails.this, EpoxyInjection.class);
                startActivity(i);
            }
        });
        ras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CrackDetails.this, RoutingAndSealing.class);
                startActivity(i);
            }
        });
        gro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CrackDetails.this, Grouting.class);
                startActivity(i);
            }
        });
        sti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CrackDetails.this, Stitching.class);
                startActivity(i);
            }
        });
        fls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CrackDetails.this, FlexibleSealing.class);
                startActivity(i);
            }
        });
        ovr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CrackDetails.this, Overlays.class);
                startActivity(i);
            }
        });
    }
}