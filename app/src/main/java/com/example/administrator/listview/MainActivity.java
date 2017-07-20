package com.example.administrator.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //设置三个不同的type 对应不同的item
//    private static final int FirstType = 111;
//    private static final int SecondType = 222;
//    private static final int ThirdType = 333;
    private String imageUrl1="http://img.ph.126.net/ocT0cPlMSiTs2BgbZ8bHFw==/631348372762626203.jpg";
    private String imageUrl2="http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg";
    private String imageUrl3="http://img.bimg.126.net/photo/WCd29-LJv2c25us72pSM3g==/5427963450905130180.jpg";
    private String imageUrl4="https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=223138572,2764436179&fm=28&gp=0.jpg";
    private String imageUrl5="http://t1.niutuku.com/960/24/24-617747.jpg";
    private String imageUrl6="http://pic54.nipic.com/file/20141201/13740598_112413393000_2.jpg";
    List<String> imageList=new ArrayList<>();
    private ListView mLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        imageList.add(imageUrl1);
        imageList.add(imageUrl2);
        imageList.add(imageUrl3);
        imageList.add(imageUrl4);
        imageList.add(imageUrl5);
        imageList.add(imageUrl6);
//        //"玉皇", "王母", "长蛾", "八戒", "如来", "易宸锋", "守星者", "部长", "大师", "收藏家"
//        List<String> listString=new ArrayList<>();
//        listString.add("玉皇");
//        listString.add("王母");
//        listString.add("长蛾");
//        listString.add("八戒");
//        listString.add("如来");
//        listString.add("易宸锋");
        List<Bean> list = new ArrayList<>();
        List<String> listString=new ArrayList<>();
        listString.add("0我不管老子是2的");
        listString.add("1我不管老子谁的也不是");
        listString.add("2我不管老子是2的");
        listString.add("3我不管老子是3的");
        listString.add("4我不管老子是2的");
        listString.add("5我不管老子谁的也不是");
//        listString.add("6我不管老子是2的");
//        listString.add("7我不管老子谁的也不是");
//        listString.add("8我不管老子是2的");

        for (int i = 0; i < imageList.size(); i++) {
            Bean bean;
            if(i%2==0){//类型一：2的倍数
                bean=  new Bean(listString.get(i),imageList.get(i));
                System.out.println("22222222222222222的倍数"+bean.getTitle());
            }else if(i%3==0){//类型二：3的倍数
                bean=  new Bean(listString.get(i),imageList.get(i));
                System.out.println("3333333333333333333的倍数"+bean.getTitle());
            }else{//类型三：其他
                bean=  new Bean(listString.get(i),imageList.get(i));
                System.out.println("其他+++++++++++++++++！！！！"+bean.getTitle());
            }
            list.add(bean);
        }
        MyAdapter adapter = new MyAdapter(list, this);
        mLv.setAdapter(adapter);

    }

    private void initView() {
        mLv = (ListView) findViewById(R.id.lv);
    }
}
