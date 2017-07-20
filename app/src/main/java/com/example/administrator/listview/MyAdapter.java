package com.example.administrator.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/7/20.
 */

public class MyAdapter extends BaseAdapter {
    private List<Bean> list;
    private Context context;

    public MyAdapter(List<Bean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            holder = new ViewHolder();
            if (position % 2 == 0) {
                convertView = convertView.inflate(context, R.layout.item2, null);
                holder.textView =  convertView.findViewById(R.id.tvtitle2);
                holder.imageView=convertView.findViewById(R.id.image2);
                convertView.setTag(holder);
            }else if(position % 3 == 0){
                convertView = convertView.inflate(context, R.layout.item3, null);
                holder.textView =  convertView.findViewById(R.id.tvtitle3);
                holder.imageView=convertView.findViewById(R.id.image3);
                convertView.setTag(holder);
            }else{
                convertView = convertView.inflate(context, R.layout.item, null);
                holder.textView =  convertView.findViewById(R.id.tvtitle);
                holder.imageView=convertView.findViewById(R.id.image);
                convertView.setTag(holder);
            }
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.textView.setText(list.get(position).title);
        ImageLoaderUtils.setImageView(list.get(position).ImageUrl,context,holder.imageView);
        return convertView;
    }

    static class ViewHolder {
        TextView textView;
        ImageView imageView;
    }
}
