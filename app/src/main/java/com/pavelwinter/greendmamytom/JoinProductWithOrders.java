package com.pavelwinter.greendmamytom;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by newuser on 19.03.2017.
 */

@Entity
public class JoinProductWithOrders {

    @Id
    private Long _id;

    private Long productId;
    private Long orderId;
    public Long getOrderId() {
        return this.orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getProductId() {
        return this.productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public Long get_id() {
        return this._id;
    }
    public void set_id(Long _id) {
        this._id = _id;
    }
    @Generated(hash = 95691645)
    public JoinProductWithOrders(Long _id, Long productId, Long orderId) {
        this._id = _id;
        this.productId = productId;
        this.orderId = orderId;
    }
    @Generated(hash = 809943382)
    public JoinProductWithOrders() {
    }
}
