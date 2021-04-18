package com.example.concretecrackrepairguide.Reptech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class FlexibleSealing extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Expand> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flexible_sealing);

        list.add(new Expand("Steps  ","• The surface must be thoroughly cleaned and prepared. Remove all loose particles, dirt, dust, laitance, and mould release agents, curing compounds, oils, grease, floor hardeners and any waterproofing materials for best results.\n" +
                "• Remove laitance, dirt and dust by mechanical scarification such as wire brushing, scrapping, scabling or grit blasting.\n" +
                "• Clean the dust by pressurized air or by washing with water.\n" +
                "• Oil and grease should be removed by degreasing with solvents like turpentine or thinners.\n" +
                "• Visible signs of mould growth should be removed & treated with a fungicidal solutions.\n" +
                "2. In flexible sealing, a recess is cut along  the line of the crack and filled with a suitable flexible material.\n" +
                "3. The width of the recess and strain capacity of the sealing material, determine the movement of the joint that can be accommodated.\n",R.drawable.expanding_background2));
        list.add(new Expand("Some materials which can be used  " ,"" ,R.drawable.expanding_background2 , R.drawable.crazed_concrete1));

        recyclerView = findViewById(R.id.fs_rv);
        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}