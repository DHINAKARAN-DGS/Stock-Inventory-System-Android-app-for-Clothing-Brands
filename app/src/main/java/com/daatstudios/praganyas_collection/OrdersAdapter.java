package com.daatstudios.praganyas_collection;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrdersAdapter extends RecyclerView.Adapter<OrdersAdapter.VIEWHOLDER> {
    List<OrdersModel> ordersModelList;

    public OrdersAdapter(List<OrdersModel> ordersModelList) {
        this.ordersModelList = ordersModelList;
    }

    @NonNull
    @Override
    public VIEWHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_container,parent,false);
        return new VIEWHOLDER(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VIEWHOLDER holder, int position) {
        String name = ordersModelList.get(position).getTitle();
        String price = ordersModelList.get(position).getPrice();
        String s = ordersModelList.get(position).getS();
        String m = ordersModelList.get(position).getM();
        String l = ordersModelList.get(position).getL();
        String xl = ordersModelList.get(position).getXl();
        String xxl = ordersModelList.get(position).getXxl();
        String xxxl = ordersModelList.get(position).getXxxl();
        String xl4 = ordersModelList.get(position).getXl4();
        String xl5 = ordersModelList.get(position).getXl5();
        String fs = ordersModelList.get(position).getFs();
        holder.setData(name,price,s,m,l,xl,xxl,xxxl,xl4,xl5,fs);
    }

    @Override
    public int getItemCount() {
        return ordersModelList.size();
    }

    public class VIEWHOLDER extends RecyclerView.ViewHolder {

        EditText set,met,let,xlet,xxlet,xxxlet,xl4et,xl5et,fset;
        TextView title,pricetv;

        public VIEWHOLDER(@NonNull View itemView) {
            super(itemView);

            set = itemView.findViewById(R.id.o_s_size);
            met = itemView.findViewById(R.id.o_m_size);
            let = itemView.findViewById(R.id.o_l_size);
            xlet = itemView.findViewById(R.id.o_xl_size);
            xxlet = itemView.findViewById(R.id.o_xxl_size);
            xxxlet = itemView.findViewById(R.id.o_xxxl_size);
            xl4et = itemView.findViewById(R.id.o_4xl_size);
            xl5et = itemView.findViewById(R.id.o_5xl_size);
            fset = itemView.findViewById(R.id.o_fs_size);

            title=itemView.findViewById(R.id.name_o);
            pricetv=itemView.findViewById(R.id.price_o);

            set.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    Toast.makeText(itemView.getContext(), set.getText().toString(), Toast.LENGTH_SHORT).show();
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

        }

        public void setData(String name, String price, String s, String m, String l, String xl, String xxl, String xxxl, String xl4, String xl5, String fs) {
            title.setText(name);
            pricetv.setText(price);

        }
    }
}
