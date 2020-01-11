package com.bw.rikao.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.rikao.R;
import com.bw.rikao.bean.Receipt;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ThreeAdapter extends RecyclerView.Adapter<ThreeAdapter.ThreeViewHodel> {

    private List<Receipt.ResultBean> list = new ArrayList<>();
    private Context context;

    public List<Receipt.ResultBean> getList() {
        return list;
    }

    @NonNull
    @Override
    public ThreeViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ThreeViewHodel holder, int position) {
        View inflate = View.inflate(context, R.layout.iteamthree, null);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ThreeViewHodel extends RecyclerView.ViewHolder {
        @BindView(R.id.name)
        EditText name;
        @BindView(R.id.phone)
        EditText phone;
        @BindView(R.id.dizhi)
        EditText dizhi;
        @BindView(R.id.youbina)
        EditText youbina;
        public ThreeViewHodel(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
