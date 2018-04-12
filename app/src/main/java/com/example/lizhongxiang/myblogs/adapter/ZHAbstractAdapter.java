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

/**
 * Created by lizhongxiang on
 *
 * @author : lzx
 * 时间 : 2018/4/12.
 */
public class ZHAbstractAdapter extends BaseAdapter {

    private LinkedList<ZHAbstractModel> zhAbstractModels;
    private Context mConext;

    public ZHAbstractAdapter(LinkedList<ZHAbstractModel> zhAbstractModels, Context mConext) {
        this.zhAbstractModels = zhAbstractModels;
        this.mConext = mConext;
    }

    @Override
    public int getCount() {
        return zhAbstractModels.size();
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
        convertView = LayoutInflater.from(mConext).inflate(R.layout.list_zh_abstract_item,parent,false);
        TextView zhItemAbstract = (TextView)convertView.findViewById(R.id.zh_item_abstract);
        zhItemAbstract.setText(zhAbstractModels.get(position).getAbstractText());
        return convertView;
    }
}
