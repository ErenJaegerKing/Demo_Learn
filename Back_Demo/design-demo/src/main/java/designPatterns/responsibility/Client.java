package designPatterns.responsibility;

public class Client {
    public static void main(String[] args) {
        LeaveRequest leave = new LeaveRequest("小花", 5, "身体不适");
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);
        groupLeader.submit(leave);
    }
}