package com.example.lizhongxiang.myblogs.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.lizhongxiang.myblogs.R;
import com.example.lizhongxiang.myblogs.model.ZHAbstractModel;

import java.util.LinkedList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lizhongxiang on
 *
 * @author : lzx
 * 时间 : 2018/4/12.
 */
public class ZHAbstractAdapter extends BaseAdapter {

    private ZHAbstractModel zhAbstractModel;
    private Context mConext;

    public ZHAbstractAdapter(ZHAbstractModel zhAbstractModel, Context mConext) {
        this.zhAbstractModel = zhAbstractModel;
        this.mConext = mConext;
    }

    @Override
    public int getCount() {
        return zhAbstractModel.getStories().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ZHAbstractAdapter.ViewHolder holder;

        if(null == convertView){
            convertView = LayoutInflater.from(mConext).inflate(R.layout.list_zh_abstract_item,parent,false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        holder.zhItemAbstract.setText(zhAbstractModel.getStories().get(position).getTitle());
        return convertView;
    }

    static class ViewHolder{
        @BindView(R.id.zh_item_abstract) TextView zhItemAbstract;

        public ViewHolder(View view) {
            ButterKnife.bind(this,view);
        }
    }
}
