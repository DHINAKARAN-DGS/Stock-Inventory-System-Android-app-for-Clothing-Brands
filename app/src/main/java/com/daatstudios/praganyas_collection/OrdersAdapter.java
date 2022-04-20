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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orders_container, parent, false);
        return new VIEWHOLDER(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VIEWHOLDER holder, int position) {
        String name = ordersModelList.get(position).getTitle();
        String sizes = ordersModelList.get(position).getAvailable();
        holder.setData(name, sizes, position);
    }

    @Override
    public int getItemCount() {
        return ordersModelList.size();
    }

    public class VIEWHOLDER extends RecyclerView.ViewHolder {

        EditText set, met, let, xlet, xxlet, xxxlet, xl4et, xl5et, fset,priceet;
        TextView title, pricetv;

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
            priceet = itemView.findViewById(R.id.o_p_price);

            title = itemView.findViewById(R.id.name_o);
            pricetv = itemView.findViewById(R.id.price_o);


        }

        public void setData(String name, String avai, int pos) {
            title.setText(name);
            pricetv.setText(avai);

            set.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setS(set.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            met.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setM(met.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            let.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setL(let.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            xlet.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setXl(xlet.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            xxlet.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setXxl(xxlet.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            xxxlet.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setXxxl(xxxlet.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            xl4et.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setXl4(xl4et.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            xl5et.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setXl5(xl5et.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            fset.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setFs(fset.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });

            priceet.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    OrdersActivity.ordersModelList.get(pos).setPrice(priceet.getText().toString().trim());
                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
        }
    }
}
