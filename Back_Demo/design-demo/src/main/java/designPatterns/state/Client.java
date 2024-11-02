package designPatterns.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());

        context.open();
        context.close();
        context.run();
        context.stop();
        context.open();
        context.run();
        context.run();
        context.open();
        context.open();
        context.run();
        context.run();
    }
}
