package com.example.qiejinkai.learnrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by qiejinkai on 16/3/30.
 */
class MyAdapter extends RecyclerView.Adapter {

    private MainActivity mainActivity;
    private String [] datas ;

    public MyAdapter(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private View root;

        private TextView tvTitle,tvContent;


        public MyViewHolder(View root) {
            super(root);
            this.root = root;

            tvTitle = (TextView) root.findViewById(R.id.tvTitle);
            tvContent = (TextView)root.findViewById(R.id.tvContent);
        }

        public View getRoot() {
            return root;
        }

        public TextView getTvContent() {
            return tvContent;
        }

        public TextView getTvTitle() {
            return tvTitle;
        }


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_cell,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        CellData cellData = cellDatas[position];

        MyViewHolder myViewHolder = (MyViewHolder)holder;

        myViewHolder.getTvContent().setText(cellData.getContent()+position);
        myViewHolder.getTvTitle().setText(cellData.getTitle()+position);

    }

    @Override
    public int getItemCount() {

        return cellDatas.length;
    }

    private CellData[] cellDatas = {new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content"),new CellData("title","content")};
}
