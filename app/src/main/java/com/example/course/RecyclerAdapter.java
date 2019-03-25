package com.example.course;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.RecyclerViewHolder>{

    ArrayList<ListProvider> arrayList = new ArrayList<ListProvider>(){};

    public RecyclerAdapter (ArrayList<ListProvider> arraylist){
        this.arrayList = arraylist;


    }


    @Override
    public RecyclerViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        View view;
        RecyclerViewHolder recyclerViewHolder;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_layout,parent,false);
        recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }
    @Override
    public void onBindViewHolder (RecyclerViewHolder holder, int position){
        ListProvider listProvider;
        listProvider = arrayList.get(position);
        holder.list_week.setText(listProvider.getWeek());
        holder.list_lecture.setText(listProvider.getLecture());
        holder.list_lab.setText(listProvider.getLab());
        holder.list_lectopic.setText(listProvider.getLecturetopic());
        holder.list_labtopic.setText(listProvider.getLabtopic());
        holder.list_lecassess.setText(listProvider.getLectureassess());
        holder.list_labassess.setText(listProvider.getLectureassess());



    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }



    public static class RecyclerViewHolder extends RecyclerView.ViewHolder
    {

        TextView list_week,list_lecture,list_lab,list_lectopic,list_labtopic,list_lecassess,list_labassess;

        TextView title_week,title_activity,title_topic,title_assessment;


        public RecyclerViewHolder (View view) {

            super (view);
            list_week = (TextView)view.findViewById(R.id.week);
            list_lecture = (TextView)view.findViewById(R.id.lecture);
            list_lab = (TextView)view.findViewById(R.id.lab);
            list_lectopic = (TextView)view.findViewById(R.id.lec_topic);
            list_labtopic = (TextView)view.findViewById(R.id.lab_topic);
            list_lecassess = (TextView)view.findViewById(R.id.lec_assessment);
            list_labassess = (TextView)view.findViewById(R.id.lab_assessment);



    }
    }

}
