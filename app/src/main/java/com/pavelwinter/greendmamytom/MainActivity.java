package com.pavelwinter.greendmamytom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.greenrobot.greendao.query.QueryBuilder;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    DaoSession mDaoSession;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("ZAPUSK","z");

        mDaoSession=((App)getApplication()).getDaoSession();

        OrderDao orderDao=mDaoSession.getOrderDao();
        ProductDao productDao=mDaoSession.getProductDao();
        JoinProductWithOrdersDao joinProductWithOrdersDao=mDaoSession.getJoinProductWithOrdersDao();

        Order order1=new Order(null,"Zakaz1");
        Order order2=new Order(null,"Zakaz2");
        Order order3=new Order(null,"Zakaz3");
        Order order4=new Order(null,"Zakaz4");

        Order order5=new Order(null,"Zakaz5");


        Product product1=new Product(null,"Product1");
        Product product2=new Product(null,"Product2");
        Product product3=new Product(null,"Product3");
        Product product4=new Product(null,"Product4");

       JoinProductWithOrders joinProductWithOrders1=new JoinProductWithOrders(null,1L,2L);
       JoinProductWithOrders joinProductWithOrders2=new JoinProductWithOrders(null,2L,1L);
       JoinProductWithOrders joinProductWithOrders3=new JoinProductWithOrders(null,1L,1L);
       JoinProductWithOrders joinProductWithOrders4=new JoinProductWithOrders(null,2L,1L);
       JoinProductWithOrders joinProductWithOrders5=new JoinProductWithOrders(null,1L,0L);

       JoinProductWithOrders joinProductWithOrders6=new JoinProductWithOrders(null,3L,4L);
       JoinProductWithOrders joinProductWithOrders7=new JoinProductWithOrders(null,3L,1L);


        orderDao.insert(order1);
        orderDao.insert(order2);
        orderDao.insert(order3);
        orderDao.insert(order4);

        orderDao.insert(order5);

        productDao.insert(product1);
        productDao.insert(product2);
        productDao.insert(product3);
        productDao.insert(product4);

        joinProductWithOrdersDao.insert(joinProductWithOrders1);
        joinProductWithOrdersDao.insert(joinProductWithOrders2);
        joinProductWithOrdersDao.insert(joinProductWithOrders3);
        joinProductWithOrdersDao.insert(joinProductWithOrders4);
        joinProductWithOrdersDao.insert(joinProductWithOrders5);
        joinProductWithOrdersDao.insert(joinProductWithOrders6);
        joinProductWithOrdersDao.insert(joinProductWithOrders7);





        QueryBuilder <Product>queryBuilder=productDao.queryBuilder()
                .where(ProductDao.Properties._id.eq(3));
        queryBuilder.build();

        List<Product>productList=queryBuilder.list();
        Log.d("LENG",String.valueOf(productList.size()));

       List<Order>orderList=productList.get(0).getOrderWithThisProduct();


        for (int i=0;i<orderList.size();i++) {

            String s=orderList.get(i).getOrderName();

            Log.d("NMESS",s);

        }

    }
}
