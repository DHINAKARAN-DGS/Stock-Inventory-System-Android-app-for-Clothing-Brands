package com.daatstudios.praganyas_collection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ConfirmationAdapter extends RecyclerView.Adapter<ConfirmationAdapter.VIEWHOLDER> {
    List<ConfirmationModel> confirmationModelList;

    public ConfirmationAdapter(List<ConfirmationModel> confirmationModelList) {
        this.confirmationModelList = confirmationModelList;
    }

    @NonNull
    @Override
    public VIEWHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_confirmation_container,parent,false);
        return new VIEWHOLDER(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VIEWHOLDER holder, int position) {
        String txt  = confirmationModelList.get(position).getMain();
        String price  = confirmationModelList.get(position).getPrice();
        holder.setData(txt,price);
    }

    @Override
    public int getItemCount() {
        return confirmationModelList.size();
    }

    public class VIEWHOLDER extends RecyclerView.ViewHolder {
        TextView text;
        EditText pricetv;
        public VIEWHOLDER(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.main_confirm);
            pricetv = itemView.findViewById(R.id.price_confirm);
        }

        public void setData(String txt, String price) {
            text.setText(txt);
            pricetv.setText(price);
        }
    }
}
