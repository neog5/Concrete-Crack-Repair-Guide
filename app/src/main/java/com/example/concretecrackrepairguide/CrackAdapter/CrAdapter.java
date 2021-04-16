package com.example.concretecrackrepairguide.CrackAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.concretecrackrepairguide.Activities.CorrosionCrackBeam;
import com.example.concretecrackrepairguide.Activities.CorrosionCrackBeam1;
import com.example.concretecrackrepairguide.Activities.CorrosionCrackColumn;
import com.example.concretecrackrepairguide.Activities.CorrosionCrackColumn1;
import com.example.concretecrackrepairguide.Activities.CrackDetails;
import com.example.concretecrackrepairguide.Activities.CrazedConcrete1;
import com.example.concretecrackrepairguide.Activities.Crazing1;
import com.example.concretecrackrepairguide.Activities.DiagonalCrack;
import com.example.concretecrackrepairguide.Activities.DiagonalCrack1;
import com.example.concretecrackrepairguide.Activities.DiagonalCrack2;
import com.example.concretecrackrepairguide.Activities.Expansion;
import com.example.concretecrackrepairguide.Activities.Expansion1;
import com.example.concretecrackrepairguide.Activities.FlexureCrack;
import com.example.concretecrackrepairguide.Activities.FlexureCrack1;
import com.example.concretecrackrepairguide.Activities.FlexureCrack2;
import com.example.concretecrackrepairguide.Activities.FlexureCrack3;
import com.example.concretecrackrepairguide.Activities.FlexureCrack4;
import com.example.concretecrackrepairguide.Activities.HeavingConcreteCrack;
import com.example.concretecrackrepairguide.Activities.HeavingConcreteCrack1;
import com.example.concretecrackrepairguide.Activities.HorizontalCrack;
import com.example.concretecrackrepairguide.Activities.HorizontalCrack1;
import com.example.concretecrackrepairguide.Activities.Overload;
import com.example.concretecrackrepairguide.Activities.PlasticShrinkage;
import com.example.concretecrackrepairguide.Activities.PlasticShrinkage1;
import com.example.concretecrackrepairguide.Activities.PrematureDrying;
import com.example.concretecrackrepairguide.Activities.Settling;
import com.example.concretecrackrepairguide.Activities.Settling1;
import com.example.concretecrackrepairguide.Activities.ShearCrack;
import com.example.concretecrackrepairguide.Activities.SteppedCrack;
import com.example.concretecrackrepairguide.Activities.SteppedCrack1;
import com.example.concretecrackrepairguide.Activities.SteppedCrack2;
import com.example.concretecrackrepairguide.Activities.TorsionalCrack;
import com.example.concretecrackrepairguide.MainActivity;
import com.example.concretecrackrepairguide.Model.CrackModel;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class CrAdapter extends RecyclerView.Adapter<CrAdapter.ViewHolder1>{

    ArrayList<CrackModel> list;
    Context cnt;

    //ArrayList<Expand> list2 = new ArrayList<>();


    public CrAdapter(ArrayList<CrackModel> list, Context cnt) {
        this.list = list;
        this.cnt = cnt;
    }

    @NonNull
    @Override
    public ViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(cnt).inflate(R.layout.sample,parent,false);
        return new ViewHolder1(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder1 holder, int position) {
        CrackModel model = list.get(position);
        holder.img.setImageResource(model.getPic());
        holder.txt.setText(model.getName());

        holder.crd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cnt , CrackDetails.class);
                i.putExtra("Het" , model);
                ArrayList<Expand> list2 = new ArrayList<>();
                switch (position){
                    case 0:
                        list2.add(new Expand("Info :" , "•\tCorrosion crack in reinforced concrete beam caused along the line of reinforcement. Because of these crack concrete be apart from the reinforcing bars.These crack is also called bond crack."));
                        break;

                    case 1:
                        list2.add(new Expand("Info :" , "•\tCorrosion crack in reinforced concrete beam caused along the line of reinforcement. Because of these crack concrete be apart from the reinforcing bars.These crack is also called bond crack."));
                        break;

                    case 2:

                        list2.add(new Expand("Characteristics :" , "• Runs along the line of reinforcement.\n" +
                                "• Generally it has uniform width.\n" +
                                "• Also occurs in slab."));
                        list2.add(new Expand("Possible reasons :" , "• Due to these crack bond between reinforcement bars and concrete is not sufficient.\n" +
                                "• Occurs due to corrosion of bars."));
                        break;

                    case 3:

                        list2.add(new Expand("Characteristics :" , "• Runs along the line of reinforcement.\n" +
                                "• Generally it has uniform width.\n" +
                                "• Also occurs in slab."));
                        list2.add(new Expand("Possible reasons :" , "• Due to these crack bond between reinforcement bars and concrete is not sufficient.\n" +
                                "• Occurs due to corrosion of bars."));
                        break;

                    case 4:

                        list2.add(new Expand("Info :" , "• Craze cracks on concrete is when the surface of concrete develops a lot of fine cracks.\n" +
                                "• Crazing of concrete is a result of conditions and curing methods at the point the concrete is laid or even the way it is finished.\n" +
                                "• Crazing usually only shows up within the first week after the slab was laid.\n"));
                        break;
                    default:
                        break;
                }

                /*switch (position){

                    case 0:
                       // i = new Intent(cnt, CorrosionCrackBeam.class);
                        list2.add(new Expand("Info :" , "•\tCorrosion crack in reinforced concrete beam caused along the line of reinforcement. Because of these crack concrete be apart from the reinforcing bars.These crack is also called bond crack."));
                        //cnt.startActivity(i);
                        break;
                    case 1:
                       // i = new Intent(cnt, CorrosionCrackBeam1.class);
                        //cnt.startActivity(i);
                        break;
                    case 2:
                       // i = new Intent(cnt, CorrosionCrackColumn.class);
                        //cnt.startActivity(i);
                        break;
                    case 3:
                        //i = new Intent(cnt, CorrosionCrackColumn1.class);
                        //cnt.startActivity(i);
                        break;
                    case 4:
                        //i = new Intent(cnt, CrazedConcrete1.class);
                        //cnt.startActivity(i);
                        break;
                    case 5:
                        //i = new Intent(cnt, Crazing1.class);
                        //cnt.startActivity(i);
                        break;
                    case 6:
                        //i = new Intent(cnt, DiagonalCrack.class);
                        //cnt.startActivity(i);
                        break;
                    case 7:
                        //i = new Intent(cnt, DiagonalCrack1.class);
                        //cnt.startActivity(i);
                        break;
                    case 8:
                        //i = new Intent(cnt, DiagonalCrack2.class);
                        //cnt.startActivity(i);
                        break;
                    case 9:
                        //i = new Intent(cnt, Expansion.class);
                        //cnt.startActivity(i);
                        break;
                    case 10:
                        //i = new Intent(cnt, Expansion1.class);
                        //cnt.startActivity(i);
                        break;
                    case 11:
                        //i = new Intent(cnt, FlexureCrack.class);
                        //cnt.startActivity(i);
                        break;
                    case 12:
                        //i = new Intent(cnt, FlexureCrack1.class);
                        //cnt.startActivity(i);
                        break;
                    case 13:
                        //i = new Intent(cnt, FlexureCrack2.class);
                        //cnt.startActivity(i);
                        break;
                    case 14:
                        //i = new Intent(cnt, FlexureCrack3.class);
                        //cnt.startActivity(i);
                        break;
                    case 15:
                        //i = new Intent(cnt, FlexureCrack4.class);
                        //cnt.startActivity(i);
                        break;
                    case 16:
                        //i = new Intent(cnt, HeavingConcreteCrack.class);
                        //cnt.startActivity(i);
                        break;
                    case 17:
                        //i = new Intent(cnt, HeavingConcreteCrack1.class);
                        //cnt.startActivity(i);
                        break;
                    case 18:
                        //i = new Intent(cnt, HorizontalCrack.class);
                        //cnt.startActivity(i);
                        break;
                    case 19:
                        //i = new Intent(cnt, HorizontalCrack1.class);
                        //cnt.startActivity(i);
                        break;
                    case 20:
                        //i = new Intent(cnt, Overload.class);
                        //cnt.startActivity(i);
                        break;
                    case 21:
                        //i = new Intent(cnt, PlasticShrinkage.class);
                        //cnt.startActivity(i);
                        break;
                    case 22:
                        //i = new Intent(cnt, PlasticShrinkage1.class);
                        //cnt.startActivity(i);
                        break;
                    case 23:
                        //i = new Intent(cnt, PrematureDrying.class);
                        //cnt.startActivity(i);
                        break;
                    case 24:
                        //i = new Intent(cnt, Settling.class);
                        //cnt.startActivity(i);
                        break;
                    case 25:
                        //i = new Intent(cnt, Settling1.class);
                        //cnt.startActivity(i);
                        break;
                    case 26:
                        //i = new Intent(cnt, ShearCrack.class);
                        //cnt.startActivity(i);
                        break;
                    case 27:
                        //i = new Intent(cnt, SteppedCrack.class);
                        //cnt.startActivity(i);
                        break;
                    case 28:
                        //i = new Intent(cnt, SteppedCrack1.class);
                        //cnt.startActivity(i);
                        break;
                    case 29:
                        //i = new Intent(cnt, SteppedCrack2.class);
                        //cnt.startActivity(i);
                        break;
                    case 30:
                        //i = new Intent(cnt, TorsionalCrack.class);
                        //cnt.startActivity(i);
                        break;
                    /*case 31:
                        i = new Intent(cnt, CrackDetails.class);
                        i.putExtra("Het",model);
                        list2.add(new Expand("Characteristics :" , "• Runs along the line of reinforcement.\n" +
                                "• Generally it has uniform width.\n" +
                                "• Also occurs in slab."));
                        list2.add(new Expand("Possible reasons :" , "• Due to these crack bond between reinforcement bars and concrete is not sufficient.\n" +
                                "• Occurs due to corrosion of bars."));
                        i.putExtra("ashwini" , list2);
                        cnt.startActivity(i);
                        break;
                    default:
                        break;
                }*/

                i.putExtra("Ashwini" , list2);
                cnt.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();


    }

    public class ViewHolder1 extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        CardView crd;
        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            txt = itemView.findViewById(R.id.txt);
            crd = itemView.findViewById(R.id.card);

        }
    }

}
