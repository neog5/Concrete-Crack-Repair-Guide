package com.example.concretecrackrepairguide.Reptech;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.concretecrackrepairguide.CrackAdapter.ExAdapter;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class EpoxyInjection extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Expand> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epoxy_injection);

        //Adding the list items
        list.add(new Expand("1. Clean the cracks", "• The first step is to clean the cracks that have been contaminated; to the extent this is possible and practical. Contaminants such as oil, grease, dirt, or fine particles of concrete prevent epoxy penetration and bonding, and reduce the effectiveness of repairs.\n" +
                "• Preferably, contamination should be removed by vacuuming or flushing with water or other specially effective cleaning solutions.", R.drawable.expanding_background2));

        list.add(new Expand("2. Seal the surfaces", "Surface cracks should be sealed to keep the epoxy from leaking out before it has gelled. Where the crack face cannot be reached, but where there is backfill, or where a slab-on-grade is being repaired, the backfill material or sub base material is sometimes an adequate seal.\n" +
                "A surface can be sealed by applying an epoxy, polyester, or other appropriate sealing material to the surface of the crack and allowing it to harden. If a permanent glossy appearance along the crack is objectionable and if high injection pressure is not required, a strippable plastic surface sealer may be applied along the face of the crack.\n" +
                "When the job is completed, the surface sealer can be stripped away to expose the gloss-free surface. Cementitious seals can also be used where appearance of the completed work is important.\n" +
                "If extremely high injection pressures are needed, the crack can be cut out to a depth of 1/2 in. (13 mm) and width of about 3/4 in. (20 mm) in a V-shape, filled with an epoxy, and struck off flush with the surface.\n", R.drawable.expanding_background2));

        list.add(new Expand("3. Install the entry and venting ports:", "Three methods are used:\n" +
                "i.) Fittings inserted into drilled holes:\n This method was the first to be used, and is often used in conjunction with V-grooving of the cracks. The method entails drilling a hole into the crack, approximately 3/4 in. (20 mm) in diameter and 1/2 to 1 in. (13 to 25 mm) below the apex of the V grooved section.\n" +
                "\n" +
                "ii.) Bonded flush fitting:\n When the cracks are not V grooved , a method frequently used to provide an entry port is to bond a fitting flush with the concrete face over the crack. The flush fitting has an opening at the top for the adhesive to enter and a flange at the bottom that is bonded to the concrete.\n" +
                "\n" +
                "iii.) Interruption in seal:\n Another system of providing entry is to omit the seal from a portion of the crack. This method can be used when special gasket devices are available that cover the unsealed portion of the crack and allow injection of the adhesive directly into the crack without leaking.", R.drawable.expanding_background2));

        list.add(new Expand("4. Mix the epoxys", "This is done either by batch or continuous methods. In batch mixing, the adhesive components are premixed according to the manufacturer’s instructions, usually with the use of a mechanical stirrer, like a paint mixing paddle.\n" +
                "Care must be taken to mix only the amount of adhesive that can be used prior to commencement of gelling of the material.", R.drawable.expanding_background2));

        list.add(new Expand("5. Inject the epoxy", "• Hydraulic pumps, paint pressure pots, or air-actuated caulking guns may be used. The pressure used for injection must be selected carefully. Increased pressure often does little to accelerate the rate of injection.\n" +
                "If the crack is vertical or inclined, the injection process should begin by pumping epoxy into the entry port at the lowest elevation until the epoxy level reaches the entry port above.\n" +
                "For horizontal cracks, the injection should proceed from one end of the crack to the other in the same manner. The crack is full if the pressure can be maintained. If the pressure can not be maintained, the epoxy is still flowing into unfilled portions or leaking out of the crack.", R.drawable.expanding_background2));

        list.add(new Expand("6. Remove the surface seal", "• After the injected epoxy has cured, the surface seal should be removed by grinding or other means as appropriate.", R.drawable.expanding_background2));


        recyclerView = findViewById(R.id.ep_rv);
        ExAdapter adapter = new ExAdapter(list, this);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}