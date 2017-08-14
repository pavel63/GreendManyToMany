package com.pavelwinter.greendmamytom;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.DaoException;

/**
 * Created by newuser on 19.03.2017.
 */

@Entity
public class Order {

    @Id
    private Long _id;

    private String orderName;



    

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getOrderName() {
        return this.orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Generated(hash = 668295080)
    public Order(Long _id, String orderName) {
        this._id = _id;
        this.orderName = orderName;
    }

    @Generated(hash = 1105174599)
    public Order() {
    }
}
