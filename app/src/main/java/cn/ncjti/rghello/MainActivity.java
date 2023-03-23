package cn.ncjti.rghello;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//    private TextView textView;
    int i=0;
    private ListView mListView;
    //商品名称与价格数据集合
    private String[] titles = {"桌子", "苹果", "蛋糕", "线衣", "猕猴桃", "围巾"};
    private String[] prices = {"1800元", "10元/kg", "300元", "350元", "10元/kg",
            "280元"};
    //图片数据集合
    private int[] icons = {R.drawable.table, R.drawable.apple, R.drawable.cake,
            R.drawable.wireclothes, R.drawable.kiwifruit, R.drawable.scarf};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//加载布局
        mListView = findViewById(R.id.lv); //初始化ListView控件
        MyBaseAdapter mAdapter = new MyBaseAdapter(); //创建一个Adapter的实例
        mListView.setAdapter(mAdapter);                  //设置Adapter
    }
    class MyBaseAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int position) {
            return titles[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Log.d("getView",""+i++);
            View  view=View.inflate(MainActivity.this,R.layout.list_item,null);
            TextView title=view.findViewById(R.id.title);
            TextView price=view.findViewById(R.id.price);
            ImageView iv=view.findViewById(R.id.iv);
            title.setText(titles[position]);
            price.setText(prices[position]);
            iv.setBackgroundResource(icons[position]);
            return view;
        }
    }

}