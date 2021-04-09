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
import com.example.concretecrackrepairguide.Activities.DiagonalCrack;
import com.example.concretecrackrepairguide.MainActivity;
import com.example.concretecrackrepairguide.Model.CrackModel;
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
                Intent i ;
                switch (position){

                    case 0:
                        i = new Intent(cnt, CorrosionCrackBeam.class);
                        cnt.startActivity(i);
                        break;
                    case 1:
                        i = new Intent(cnt, CorrosionCrackBeam1.class);
                        cnt.startActivity(i);
                        break;
                   /* case 3:
                        i = new Intent(cnt, CorrosionCrackBeam.class);
                        cnt.startActivity(i);
                        break;
                    case 4:
                        i = new Intent(cnt, CorrosionCrackBeam.class);
                        cnt.startActivity(i);
                        break;
                    case 5:
                        i = new Intent(cnt, DiagonalCrack.class);
                        cnt.startActivity(i);
                        break;*/

                    default:
                        break;
                }

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
