package com.example.concretecrackrepairguide.Reptech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class RoutingAndSealing extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Expand> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routing_and_sealing);

        list.add(new Expand("Steps  " ,"1. SURFACE PREPARATION\n" +
                "• The surface must be thoroughly cleaned and prepared. Remove all loose particles, dirt, dust, laitance, and mould release agents, curing compounds, oils, grease, floor hardeners and any waterproofing materials for best results.\n" +
                "• Remove laitance, dirt and dust by mechanical scarification such as wire brushing, scrapping, scabling or grit blasting.\n" +
                "• Clean the dust by pressurized air or by washing with water.\n" +
                "• Oil and grease should be removed by degreasing with solvents like turpentine or thinners.\n" +
                "• Visible signs of mould growth should be removed & treated with a fungicidal solutions.\n" +
                "2. The procedure consists of preparing a groove at the surface ranging in depth, typically from 6 to 25 mm.\n" +
                "3. A concrete saw, hand tools on pneumatic tools may be used.\n" +
                "4. The groove is then cleaned by waterblasting, sandblasting or air blasting and allowed to dry.\n" +
                "5. A sealant is placed into the dry groove and allowed to cure.\n" ,R.drawable.expanding_background2));

        list.add(new Expand("Some materials used  " ,"" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));



        recyclerView = findViewById(R.id.rs_rv);
        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}