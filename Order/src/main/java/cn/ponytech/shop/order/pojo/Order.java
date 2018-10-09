package cn.ponytech.shop.order.pojo;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.List;

public class Order {
    String orderId;
    Long userId;
    Date createTime;
    Date updateTime;
    List<OrderDetail> orderDetails;

    public Order(){

    }

    public Order(String orderId, Long userId, Date createTime, Date updateTime) {
        this.orderId = orderId;
        this.userId = userId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", userId='" + userId + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                "}";
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
