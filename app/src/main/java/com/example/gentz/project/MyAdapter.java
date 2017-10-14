package com.example.gentz.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private int mResource;
    private ArrayList<MyItem> mItems = new ArrayList<MyItem>();

    public MyAdapter(Context context, int resource, ArrayList<MyItem> items) {
        mContext = context;
        mItems = items;
        mResource = resource;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    //자동 호출 함수
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(mResource, parent,false);
        }

        ImageView icon = (ImageView) convertView.findViewById(R.id.iconItem);
        icon.setImageResource(mItems.get(position).mIcon);


        TextView name = (TextView) convertView.findViewById(R.id.bunkerName);
        name.setText(mItems.get(position).nName);

        TextView age = (TextView) convertView.findViewById(R.id.bunkerNumber);

        age.setText(mItems.get(position).nNumber);
        Button btn1 = (Button)convertView.findViewById(R.id.call);
        btn1.setOnClickListener(new Button.OnClickListener()  {
            public void onClick(View v)  {
                String str = mItems.get(pos).nName + "의 전화번호는 "
                        +mItems.get(pos).nNumber+" 입니다.";
                Toast.makeText(mContext, str,Toast.LENGTH_SHORT).show();
            }
        });

        Button btn2 = (Button)convertView.findViewById(R.id.adress);
        btn2.setOnClickListener(new Button.OnClickListener()  {
            public void onClick(View v)  {
                String str = mItems.get(pos).nAdress;
                Toast.makeText(mContext, str,Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }
}