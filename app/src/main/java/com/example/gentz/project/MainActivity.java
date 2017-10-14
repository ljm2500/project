package com.example.gentz.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<MyItem> data = new ArrayList<MyItem>();
        data.add(new MyItem(R.drawable.dobonglibrary, "도봉도서관", "02-6714-7400","서울특별시 도봉구 삼양로 556 도봉도서관"));
        data.add(new MyItem(R.drawable.hansung, "한성대입구역", "02-6110-4191","서울특별시 성북구 삼선교로 지하 1 (삼선동1가)"));
        data.add(new MyItem(R.drawable.higjschool, "청원고등학교", "02-3399-7771","서울 노원구 한글비석로 506"));
        data.add(new MyItem(R.drawable.market, "영등포시장지하상가", "02-2290-6487","서울특별시 영등포구 영등포로 219 (영등포동5가)"));
        data.add(new MyItem(R.drawable.police, "은평경찰서", "182","서울특별시 은평구 연서로 365 (불광동, 은평경찰서)"));
        data.add(new MyItem(R.drawable.seong, "파티움성균관(유림회관)", "02-744-0678","서울특별시 종로구 성균관로 31 (명륜3가, 유림회관)"));
        data.add(new MyItem(R.drawable.seoulhospital, "서울삼육병원", "1577-3675","서울특별시 동대문구 망우로 82 (휘경동)"));
        data.add(new MyItem(R.drawable.seoultax, "서울본부세관", "02-510-1114","서울특별시 강남구 언주로 721 (논현동, 서울세관)"));

        adapter = new MyAdapter(this, R.layout.list_item, data);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }

}