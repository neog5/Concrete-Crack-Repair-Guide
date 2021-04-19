package com.example.concretecrackrepairguide.Reptech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class Grouting extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Expand> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grouting);


        list.add(new Expand("• Materials  used  for  grouting:" , "(1) Cement + Water\n" +
                "(2) Cement + Stone  dust + Water\n" +
                "(3) Cement + Clay + Water\n" +
                "(4) Cement + Clay + Sand + Water\n" +
                "(5) Asphalt\n" +
                "(6) Clay + Water\n" +
                "(7) Admixtures\n" +
                "\n"  , R.drawable.expanding_background2 , R.drawable.stitching_table1));




        list.add(new Expand("• Procedure  for  grouting :" , "(1) Surface preparation.\n" +
                "The surface must be thoroughly cleaned and prepared. Remove all loose particles, dirt, dust, laitance, and mould release agents, curing compounds, oils, grease, floor hardeners and any waterproofing materials for best results.\n" +
                " Remove laitance, dirt and dust by mechanical scarification such as wire brushing, scrapping, scabling or grit blasting.\n" +
                "  Clean the dust by pressurized air or by washing with water.\n" +
                " Oil and grease should be removed by degreasing with solvents like turpentine or thinners.\n" +
                " \tVisible signs of mould growth should be removed & treated with a fungicidal solutions\n" +
                "(2) Drilling  of  grouting  holes.\n" +
                "For  drilling  grouting  holes, equipments  like  jack  hammer, diamond  drill, shot  drill, etc. are used. The  choice  of  type  of  drilling  equipment  depends  upon  the  type  of  stone, size of  hole and  depth  of  hole.\n" +
                "(3) Arrangement  of  grout  pipes.\n" +
                "Grout  pipes  of  4 to  5 cm  dia  and  45 to  90 cm  length  are  inserted  in  the  grout  holes. The  space  surrounding  the  pipe  is  filled with  cement  mortar. The  top  end  of  the  pipe  is  connected  to  the pump.\n" +
                "(4) Cleaning  of  cracks.\n" +
                "Before  injecting  grout  mixture  in  the  cracks, it  is  necessary  to  clean  the  cracks. The  loose  material  inn the  cracks  can  be  removed  by  injecting  air-water  mixture  by pressure  in  the  cracks.\n" +
                "(5) Inserting  grout  in  the  holes.  \n" +
                "Normally, grout  is  inserted  in  the  holes   at  a  pressure  0.65 kg/cm2  per  m  depth  of  hole.\n" , R.drawable.expanding_background2));



        
        recyclerView = findViewById(R.id.gr_rv);
        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

}