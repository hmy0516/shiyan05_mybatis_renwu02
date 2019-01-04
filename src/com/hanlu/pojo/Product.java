package com.hanlu.pojo;

import java.util.List;

/**
 * @author HMY
 * @date 2018/12/24-21:33
 */
public class Product {
    private int id;
    private String name;
    private Double price;
    private List<Orders2> orders2List;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", orders2List=" + orders2List +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Orders2> getOrders2List() {
        return orders2List;
    }

    public void setOrders2List(List<Orders2> orders2List) {
        this.orders2List = orders2List;
    }
}
