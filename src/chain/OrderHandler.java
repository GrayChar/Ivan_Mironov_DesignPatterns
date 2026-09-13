package chain;

public abstract class OrderHandler {

    protected OrderHandler next;

    public void setNext(OrderHandler next) {
        this.next = next;
    }

    public abstract void handle(int amount);
}
