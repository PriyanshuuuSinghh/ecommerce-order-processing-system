package com.example.model;

public class Order {

    public int orderId;
    public int userId;
    public int productId;
    public int quantity;
    public String status;

    public Order(int orderId,int userId,int productId,int quantity,String status ){
        this .orderId=orderId;
        this.userId=userId;
        this.productId=productId;
        this.quantity=quantity;
        this.status=status;
    }
    public int getOrderId(){
        return orderId;
    }
    public int getUserId(){
        return userId;
    }
    public int getProductId(){
        return productId;
    }
    public int getQuantity(){
        return quantity;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status=status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}

