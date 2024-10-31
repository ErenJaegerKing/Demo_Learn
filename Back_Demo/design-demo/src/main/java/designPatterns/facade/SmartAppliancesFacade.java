package designPatterns.facade;

public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String msg) {
        //你好 哈哈哈哈哈
        // 你好
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {

        }
    }

    private void on() {
//        System.out.println("起床了");
//        light.on();
//        tv.on();
//        airCondition.on();

    }

    private void off() {
        System.out.println("睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }
}
