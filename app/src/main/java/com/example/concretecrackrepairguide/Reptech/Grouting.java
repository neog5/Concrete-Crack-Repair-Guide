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
    ArrayList<Expand> list1 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grouting);

        list.add(new Expand("• Purpose  of  grouting:" , "• Purpose  of  grouting: \n" +
                "(1) To  increase  the  density  of  foundation  material\n" +
                "(2) To  increase  the  bearing  capacity  of  soil.\n" +
                "(3) To  strengthen  the  purpose  concrete.\n" +
                "(4) To  prevent  the  seepage  of  water  from  dam  or  tunnel.\n" +
                "(5) To  reduce  uplift  pressure  below  dam.\n" +
                "(6) To  fill the  cracks  in  reinforced concrete.\n" +
                " \n" +
                "Based  on  the  grouting  material  used, there are three methods.\n" +
                "(1) Portland  cement  grouting\n" +
                "(2) Chemical  grouting\n" +
                "(3) Epoxy  grouting\n" +
                "\n" +
                "(1) Portland Cement Grouting\n" +
                "Wide cracks, particularly in gravity dams and thick concrete walls, may be repaired by filling with portland cement grout. This method is effective in stopping water leaks, but it will not structurally bond cracked sections. The procedure consists of cleaning the concrete along the crack by air jetting; installing built-up seats (grout nipples) at suitable intervals (to provide a pressure tight connection with the injection apparatus); sealing the crack between the seats with a cement paint, sealant, or grout; flushing the crack to clean it and test the seal; and then grouting the whole area. Grout mixtures may contain cement and water or cement plus sand and water, depending on the width of the crack. However, the water-cement ratio should be kept as low as practical to maximize the strength and minimize shrinkage. Water reducers or other admixtures may be used to improve the properties of the grout. For small volumes, a manual injection gun may be used; for larger volumes, a pump should be used. After the crack is filled, the pressure should be maintained for several minutes to insure good penetration\n" +
                "(2) Chemical Grouting\n" +
                "Chemical grouts consist of solutions of two or more chemicals (such as urethanes, sodium silicates, and acrylomides) that combine to form a gel, a solid precipitate, or a foam, as opposed to cement grouts that consist of suspensions of solid particles in a fluid. Cracks in concrete as narrow as 0.05 mm have been filled with chemical grout. The advantages of chemical grouts include applicability in moist environments (excess moisture available), wide limits of control of gel time, and their ability to be applied in very fine fractures. Disadvantages are the high degree of skill needed for satisfactory use and their lack of strength.\n" +
                "\n" , R.drawable.expanding_background2));

        list.add(new Expand("• Materials  used  for  grouting:" , "(1) Cement + Water\n" +
                "(2) Cement + Stone  dust + Water\n" +
                "(3) Cement + Clay + Water\n" +
                "(4) Cement + Clay + Sand + Water\n" +
                "(5) Asphalt\n" +
                "(6) Clay + Water\n" +
                "(7) Admixtures\n" +
                "\n" , R.drawable.expanding_background2));



        recyclerView = findViewById(R.id.gr_rv);
        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        list1.add(new Expand("" , "" , R.drawable.expanding_background2));

        list1.add(new Expand("" , "" , R.drawable.expanding_background2));

        list1.add(new Expand("" , "" , R.drawable.expanding_background2));

        recyclerView = findViewById(R.id.gr_rv1);
        ExAdapter adapter1 = new ExAdapter(list1, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager1);
    }

}