package com.entity;

public class Orders {
    private int oId;
    private String oName;

    public Orders(int oId, String oName) {
        this.oId = oId;
        this.oName = oName;
    }

    public void testOrders(){
        System.out.println("oId="+oId+",oName="+oName);
    }
}
