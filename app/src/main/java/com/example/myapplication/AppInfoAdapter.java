package com.example.myapplication;

import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.support.v4.os.IResultReceiver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AppInfoAdapter extends BaseAdapter {

    private List<ApplicationInfo> mInfos;

    public AppInfoAdapter(List<ApplicationInfo> mInfos) {
        this.mInfos = mInfos;
    }

    @Override
    public int getCount() {
        return mInfos.size();
    }

    @Override
    public Object getItem(int position) {
        return mInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        viewHolder holder;
        if(convertView==null){
            holder=new viewHolder();
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_app,parent,false);
            holder.imageView=convertView.findViewById(R.id.icon_image);
            holder.textView=convertView.findViewById(R.id.app_name_text);
            convertView.setTag(holder);
        }else{
            holder=(viewHolder) convertView.getTag();
        }

    ApplicationInfo info=mInfos.get(position);
        Drawable icon=info.loadIcon(parent.getContext().getPackageManager());
        holder.imageView.setImageDrawable(icon);
        String name=String.valueOf(info.loadLabel(parent.getContext().getPackageManager()));

    holder.textView.setText(name);

        return convertView;
    }
    private static class viewHolder{
        ImageView imageView;
        TextView textView;
    }
}
