package com.pavelwinter.greendmamytom;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.JoinEntity;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.ToMany;

import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;

/**
 * Created by newuser on 19.03.2017.
 */

@Entity
public class Product {

    @Id
    private Long _id;

    private String productName;

    @ToMany
    @JoinEntity(
            entity = JoinProductWithOrders.class,
            sourceProperty = "productId",
            targetProperty = "orderId")
    private List<Order> orderWithThisProduct;

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 1942392019)
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.refresh(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 713229351)
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.update(this);
    }

    /**
     * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
     * Entity must attached to an entity context.
     */
    @Generated(hash = 128553479)
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
        myDao.delete(this);
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    @Generated(hash = 300833552)
    public synchronized void resetOrderWithThisProduct() {
        orderWithThisProduct = null;
    }

    /**
     * To-many relationship, resolved on first access (and after reset).
     * Changes to to-many relations are not persisted, make changes to the target entity.
     */
    @Generated(hash = 1126942804)
    public List<Order> getOrderWithThisProduct() {
        if (orderWithThisProduct == null) {
            final DaoSession daoSession = this.daoSession;
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            OrderDao targetDao = daoSession.getOrderDao();
            List<Order> orderWithThisProductNew = targetDao._queryProduct_OrderWithThisProduct(_id);
            synchronized (this) {
                if(orderWithThisProduct == null) {
                    orderWithThisProduct = orderWithThisProductNew;
                }
            }
        }
        return orderWithThisProduct;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated(hash = 1171535257)
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getProductDao() : null;
    }

    /** Used for active entity operations. */
    @Generated(hash = 694336451)
    private transient ProductDao myDao;

    /** Used to resolve relations */
    @Generated(hash = 2040040024)
    private transient DaoSession daoSession;

    public Long get_id() {
        return this._id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Generated(hash = 2060881688)
    public Product(Long _id, String productName) {
        this._id = _id;
        this.productName = productName;
    }

    @Generated(hash = 1890278724)
    public Product() {
    }
}


