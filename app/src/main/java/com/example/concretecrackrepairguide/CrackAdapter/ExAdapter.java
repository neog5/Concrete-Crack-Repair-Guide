package com.example.concretecrackrepairguide.CrackAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.concretecrackrepairguide.Model.CrackModel;
import com.example.concretecrackrepairguide.Model.Expand;
import com.example.concretecrackrepairguide.R;

import java.util.ArrayList;

public class ExAdapter extends RecyclerView.Adapter<ExAdapter.ViewHolder2>{
    ArrayList<Expand> list2;
    Context cnt;

    public ExAdapter(ArrayList<Expand> list2, Context cnt) {
        this.list2 = list2;
        this.cnt = cnt;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(cnt).inflate(R.layout.sample_expandable,parent,false);
        return new ExAdapter.ViewHolder2(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder, int position) {
        Expand model = list2.get(position);
        holder.title.setText(model.getTitle());
        holder.content.setText(model.getContent());
        holder.content.setVisibility(list2.get(position).isExpanded() ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return list2.size();
    }

    public class ViewHolder2 extends RecyclerView.ViewHolder {
        TextView title, content;
        public ViewHolder2(@NonNull View itemView) {

            super(itemView);

            title = itemView.findViewById(R.id.title);
            content = itemView.findViewById(R.id.expandable);
            title.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Expand ex = list2.get(getAdapterPosition());
                    ex.setExpanded(!ex.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
