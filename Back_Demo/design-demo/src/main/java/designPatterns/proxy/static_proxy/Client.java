package designPatterns.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
