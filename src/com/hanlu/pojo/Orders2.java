package com.hanlu.pojo;

import java.util.List;

/**
 * @author HMY
 * @date 2018/12/24-20:34
 */
public class Orders2 {
    private int id;
    private String number;
    private List<Product> productList;

    @Override
    public String toString() {
        return "Orders2{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", productList=" + productList +
                '}';
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
