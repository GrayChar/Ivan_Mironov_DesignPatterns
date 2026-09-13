package chain;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Boss boss = new Boss();
        Director director = new Director();

        manager.setNext(boss);
        boss.setNext(director);

        manager.handle(5000);
        manager.handle(30000);
        manager.handle(100000);
    }
}
