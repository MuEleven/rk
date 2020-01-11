package com.bw.rikao.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bw.rikao.R;
import com.bw.rikao.bean.TwoBean;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHodel> {
    private List<TwoBean.ResultBean> list;
    public MyAdapter(List<TwoBean.ResultBean> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHodel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.iteam, null);
        return new MyViewHodel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHodel holder, int i) {
        holder.text.setText(list.get(i).getTitle());
        Glide.with(holder.image).load(list.get(i).getImageUrl())
                .into(holder.image);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (onItemClickLintLner != null) {
                            onItemClickLintLner.OnItemClick(i);
                        }
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHodel extends RecyclerView.ViewHolder {
        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.text)
        TextView text;

        public MyViewHodel(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    OnItemClickLintLner onItemClickLintLner;
    public void setOnItemClickLintLner(OnItemClickLintLner onItemClickLintLner) {
        this.onItemClickLintLner = onItemClickLintLner;
    }

public interface OnItemClickLintLner {
    void OnItemClick(int i);

  }
}
