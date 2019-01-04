package com.hanlu.pojo;

/**
 * @author HMY
 * @date 2018/12/21-9:33
 */
public class IdCard {
    private int id;
    private String code;

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
