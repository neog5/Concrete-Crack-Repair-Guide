package com.example.concretecrackrepairguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.CrAdapter;
import com.example.concretecrackrepairguide.Model.CrackModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        ArrayList<CrackModel> list = new ArrayList<>();

        list.add(new CrackModel(R.drawable.corrosion_crack_beam, "Corrosion Crack Beam"));
        list.add(new CrackModel(R.drawable.corrosion_crack_beam1, "Corrosion Crack Beam 1"));
        list.add(new CrackModel(R.drawable.corrosion_crack_column, "Corrosion Crack Column"));
        list.add(new CrackModel(R.drawable.corrosion_crack_column, "Corrosion Crack Column 1"));
        list.add(new CrackModel(R.drawable.crazed_concrete1, "Crazed Concrete 1"));
        list.add(new CrackModel(R.drawable.crazing1, "Crazing 1"));
        list.add(new CrackModel(R.drawable.diagonal_crack, "Diagonal Crack"));
        list.add(new CrackModel(R.drawable.diagonal_crack1, "Diagonal Crack 1"));
        list.add(new CrackModel(R.drawable.diagonal_crack2, "Diagonal Crack 2"));
        list.add(new CrackModel(R.drawable.expansion, "Expansion"));
        list.add(new CrackModel(R.drawable.expansion, "Expansion 1"));
        list.add(new CrackModel(R.drawable.flexure_crack, "Flexure Crack"));
        list.add(new CrackModel(R.drawable.flexure_crack1, "Flexure Crack 1"));
        list.add(new CrackModel(R.drawable.flexure_crack2, "Flexure Crack 2"));
        list.add(new CrackModel(R.drawable.flexure_crack3, "Flexure Crack 3"));
        list.add(new CrackModel(R.drawable.flexure_crack4, "Flexure Crack 4"));
        list.add(new CrackModel(R.drawable.heaving_concrete_crack_1, "Heaving Concrete Crack"));
        list.add(new CrackModel(R.drawable.heaving_concrete_crack_1, "Heaving Concrete Crack 1"));
        list.add(new CrackModel(R.drawable.horizontal_crack, "Horizontal Crack"));
        list.add(new CrackModel(R.drawable.horizontal_crack1, "Horizontal Crack 1"));
        list.add(new CrackModel(R.drawable.overload, "Overload"));
        list.add(new CrackModel(R.drawable.plastic_shrinkage, "Plastic Shrinkage"));
        list.add(new CrackModel(R.drawable.plastic_shrinkage1, "Plastic Shrinkage 1"));
        list.add(new CrackModel(R.drawable.premature_drying, "Preamature Drying"));
        list.add(new CrackModel(R.drawable.settling, "Settling"));
        list.add(new CrackModel(R.drawable.settling_1, "Settling 1"));
        list.add(new CrackModel(R.drawable.shear_crack, "Shear Crack"));
        list.add(new CrackModel(R.drawable.stepped_crack, "Stepped Crack"));
        list.add(new CrackModel(R.drawable.stepped_crack1, "Stepped Crack 1"));
        list.add(new CrackModel(R.drawable.stepped_crack2, "Stepped Crack 2"));
        list.add(new CrackModel(R.drawable.torsional_crack, "Torsional Crack"));
        list.add(new CrackModel(R.drawable.corrosion_crack_beam, "Crack Details"));


        CrAdapter adapter = new CrAdapter(list, this);
        recyclerView.setAdapter(adapter);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);



    }
}