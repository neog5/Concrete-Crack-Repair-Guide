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

import com.example.concretecrackrepairguide.Activities.CrackDetails;
import com.example.concretecrackrepairguide.Model.CrackModel;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class CrAdapter extends RecyclerView.Adapter<CrAdapter.ViewHolder1>{

    ArrayList<CrackModel> list;
    Context cnt;

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
                boolean list3[] = new boolean[6];

                switch (position){

                    case 0: //Corrosion crack beam

                    case 1: //Corrosion crack beam 1
                        list2.add(new Expand("Info  " , "• Corrosion crack in reinforced concrete beam caused along the line of reinforcement. Because of these crack concrete be apart from the reinforcing bars.These crack is also called bond crack.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = false;
                        list3[5] = false;
                        break;

                    case 2: //Corrosion crack column

                    case 3: //Corrosion crack column 1

                        list2.add(new Expand("Characteristics  " , "• Runs along the line of reinforcement.\n" +
                                "• Generally it has uniform width.\n" +
                                "• Also occurs in slab.", R.drawable.expanding_background));
                        list2.add(new Expand("Possible reasons  " , "• Due to these crack bond between reinforcement bars and concrete is not sufficient.\n" +
                                "• Occurs due to corrosion of bars.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = false;
                        list3[5] = false;
                        break;

                    case 4: //Crazing Crack

                    case 5: //Crazing Crack 1

                        list2.add(new Expand("Info  " , "• Craze cracks on concrete is when the surface of concrete develops a lot of fine cracks.\n" +
                                "• Crazing of concrete is a result of conditions and curing methods at the point the concrete is laid or even the way it is finished.\n" +
                                "• Crazing usually only shows up within the first week after the slab was laid.\n", R.drawable.expanding_background));
                        list3[0] = false;
                        list3[1] = false;
                        list3[2] = false;
                        list3[3] = false;
                        list3[4] = true;
                        list3[5] = true;
                        break;

                    case 6: //Diagonal crack

                    case 7: //Diagonal crack 1

                    case 8: //Diagonal crack 2
                        list2.add(new Expand("Characteristics  " , "• Runs diagonally across the section.\n" +
                                "• It can occur anywhere in the height.\n" +
                                "• Crack has uniform thickness.", R.drawable.expanding_background));
                        list2.add(new Expand("Possible reasons  " , "• Load carrying capacity of the column is inadequate\n" +
                                "• Cross-section or main reinforcement is insufficient.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = false;
                        list3[4] = false;
                        list3[5] = false;

                        break;

                    case 9: //Expansion crack

                    case 10: //Expansion crack 1
                        list2.add(new Expand("Characteristics  " , "• Heat causes concrete to expand.\n" +
                                "• The expanding force can be enough to cause concrete to crack", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = false;
                        list3[5] = false;
                        break;

                    case 11: //Flexure crack

                    case 12: //Flexure crack 1

                    case 13: //Flexure crack 2

                    case 14: //Flexure crack 3

                    case 15: //Flexure crack 4
                        list2.add(new Expand("Characteristics  " , "• It generate in maximum moment region.\n" +
                                "• Flexural crack may be single or in groups.\n" +
                                "• Maximum width at the bottom or top of the beam.\n" +
                                "• This type of crack also occurs in slab.", R.drawable.expanding_background));
                        list2.add(new Expand("Possible reasons  " , "• Flexural capacity of beam is insufficient.\n" +
                                "• When cross section of the beam or reinforcement in beam is insufficient.\n" +
                                "• Caused due to more than defined load.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = false;
                        list3[4] = false;
                        list3[5] = false;
                        break;

                    case 16: //Heaving concrete crack

                    case 17: //Heaving concrete crack 1
                        list2.add(new Expand("Info  " , "• Due to decreases in the thermal temperature, the ground freezes. This ground movement due to freezing causes cracks in concrete which can be termed as heaving concrete crack.", R.drawable.expanding_background));
                        list3[0] = false;
                        list3[1] = false;
                        list3[2] = false;
                        list3[3] = true;
                        list3[4] = false;
                        list3[5] = false;
                        break;

                    case 18: //Horizontal crack
                        list2.add(new Expand("Characteristics  " , "• Occur at the beam column junction.\n" +
                                "• Moment resistance capacity of column inadequate in the corresponding region.\n" +
                                "• Inadequate quantum of reinforcement or disposition of reinforcement not satisfactory.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = true;
                        list3[5] = false;
                        break;

                    case 19: //Horizontal crack 1
                        list2.add(new Expand("Characteristics  " , "• Occur at the beam column junction.\n" +
                                "• Moment resistance capacity of column inadequate in the corresponding region.\n" +
                                "• Inadequate quantum of reinforcement or disposition of reinforcement not satisfactory.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = false;
                        list3[5] = false;
                        break;

                    case 20: //Overload
                        list2.add(new Expand("Info  " , "• Although concrete is a very strong building material, it does have its limits. Placing excessive amounts of weight on top of a concrete slab can cause cracking.", R.drawable.expanding_background));
                        list3[0] = false;
                        list3[1] = false;
                        list3[2] = false;
                        list3[3] = false;
                        list3[4] = false;
                        list3[5] = true;
                        break;

                    case 21: //Plastic shrinkage

                    case 22: //Plastic shrinkage 1
                        list2.add(new Expand("Characteristics  " , "• Plastic shrinkage cracks typically occur on horizontal surfaces exposed to the atmosphere.\n" +
                                "• Plastic shrinkage cracks are typically two to four inches deep and approximately one-eighth inch wide.\n" +
                                "• The cracks tend to follow the edges of large aggregate particles or reinforcing bars and never break through the aggregate particles.69", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = true;
                        list3[5] = false;
                        break;

                    case 23: //Premature Drying
                        list2.add(new Expand("Info  " , "• Crazing cracks are very fine, surface cracks that resemble spider webs or shattered glass. When the top of a concrete slab loses moisture too quickly, crazing cracks will likely appear. While unsightly, crazing cracks are not a structural concern.\n" +
                                "• Crusting cracks typically happen during the concrete stamping process, which is a way of adding texture or pattern to concrete surfaces.", R.drawable.expanding_background));
                        list3[0] = false;
                        list3[1] = false;
                        list3[2] = false;
                        list3[3] = false;
                        list3[4] = true;
                        list3[5] = true;
                        break;

                    case 24: //Settling
                        list2.add(new Expand("Info  " , "• When the void is created in the soil particles below the concrete surface, settling concrete cracks are formed.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = true;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = true;
                        list3[5] = false;
                        break;

                    case 25: //Settling 1
                        list2.add(new Expand("Info  " , "• When the void is created in the soil particles below the concrete surface, settling concrete cracks are formed.", R.drawable.expanding_background));
                        list3[0] = false;
                        list3[1] = false;
                        list3[2] = false;
                        list3[3] = false;
                        list3[4] = true;
                        list3[5] = true;
                        break;

                    case 26: //Shear Crack
                        list2.add(new Expand("Characteristics  " , "• Generate nearer to the supports of the beam\n" +
                                "• It may be single or in groups.\n" +
                                "• Maximum width at neutral axis region or at the bottom of the beam.", R.drawable.expanding_background));
                        list2.add(new Expand("Possible reasons  " , "• Shear capacity of beam is insufficient.\n" +
                                "• Cross section on torsional reinforcement is insufficient.\n" +
                                "• Caused due to loaded more than define load.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = false;
                        list3[2] = true;
                        list3[3] = false;
                        list3[4] = true;
                        list3[5] = false;
                        break;

                    case 27: //Stepped Crack
                        list2.add(new Expand("Info  " , "• This type of cracks are easy to identify as they are on the exterior side of the wall.\n" +
                                "• The stair-stepping crack is caused by separation in the brick by shifting foundations.", R.drawable.expanding_background));
                        list3[0] = true;
                        list3[1] = false;
                        list3[2] = true;
                        list3[3] = true;
                        list3[4] = false;
                        list3[5] = false;
                        break;

                    case 28: //Stepped Crack 1

                    case 29: //Stepped Crack 2
                        list2.add(new Expand("Info  " , "• This type of cracks are easy to identify as they are on the exterior side of the wall.\n" +
                                "• The stair-stepping crack is caused by separation in the brick by shifting foundations.", R.drawable.expanding_background));
                        list3[0] = false;
                        list3[1] = false;
                        list3[2] = false;
                        list3[3] = false;
                        list3[4] = true;
                        list3[5] = false;
                        break;

                    case 30: //Torsional Crack
                        list2.add(new Expand("Characteristics  " , "• Generate nearer to the maximum torsional region.\n" +
                                "• Formed in single way, generally occurs in uniform width.", R.drawable.expanding_background));
                        list2.add(new Expand("Possible reasons  " , "•• Torsional strength of beam is insufficient.\n" +
                                "• Cross section or torsional reinforcement is insufficient.", R.drawable.expanding_background));
                        list3[0] = false;
                        list3[1] = false;
                        list3[2] = false;
                        list3[3] = true;
                        list3[4] = true;
                        list3[5] = false;
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
                i.putExtra("IT", list3);
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
