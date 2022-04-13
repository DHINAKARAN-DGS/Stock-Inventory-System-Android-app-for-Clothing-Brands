package com.daatstudios.praganyas_collection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class DisplayAdapter extends RecyclerView.Adapter<DisplayAdapter.VIEWHOLDER> {


    List<DisplayModel> displayModelList;

    public DisplayAdapter(List<DisplayModel> displayModelList) {
        this.displayModelList = displayModelList;
    }

    @NonNull
    @Override
    public DisplayAdapter.VIEWHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.products_container,parent,false);
        return new VIEWHOLDER(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DisplayAdapter.VIEWHOLDER holder, int position) {
        String title = displayModelList.get(position).getTitle();
        String image = displayModelList.get(position).getImage();
        String price = displayModelList.get(position).getPrice();
        String size = displayModelList.get(position).getSize();
        holder.setData(title,image,price,size);
    }

    @Override
    public int getItemCount() {
        return displayModelList.size();
    }

    public class VIEWHOLDER extends RecyclerView.ViewHolder {
        TextView name,pprice,psize;
        ImageView pic;
        Button add;
        public VIEWHOLDER(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.textView3);
            pprice=itemView.findViewById(R.id.textView11);
            pic=itemView.findViewById(R.id.imageView);
            psize=itemView.findViewById(R.id.size4xl2);
            add =  itemView.findViewById(R.id.button);
        }

        public void setData(String title, String image, String price, String size) {
            name.setText(title);
            pprice.setText(price);
            Glide.with(itemView.getContext()).load(image).into(pic);
            psize.setText(size);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    
                }
            });

        }
    }
}
