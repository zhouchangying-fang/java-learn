package com.baidu;

public class Client {
    public static void main(String[] args){
        Host host = new Host();
        ProxyInvocationHandler hdl = new ProxyInvocationHandler();
        hdl.setRent(host);
        Rent proxy = (Rent) hdl.getProxy();
        proxy.rent();
    }
}
