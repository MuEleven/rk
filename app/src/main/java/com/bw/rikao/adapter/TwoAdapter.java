package com.bw.rikao.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.rikao.R;
import com.bw.rikao.bean.Gw;

import java.util.ArrayList;
import java.util.List;

public class TwoAdapter extends RecyclerView.Adapter<TwoAdapter.TwoViewHodel> {
    List<Gw.ResultBean> list = new ArrayList<>();
    private Context context;

    public List<Gw.ResultBean> getList() {
        return list;
    }

    @NonNull
    @Override
    public TwoAdapter.TwoViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TwoAdapter.TwoViewHodel holder, int position) {
        View inflate = View.inflate(context, R.layout.iteamtwo, null);
        inflate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "这是详情页", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TwoViewHodel extends RecyclerView.ViewHolder {
        public TwoViewHodel(@NonNull View itemView) {
            super(itemView);
        }
    }
}
