package MyLIinkedList;

public class Node<T> {
    private Node<T> pre;
    private T now;
    private Node<T> next;

    public Node (T obj) {
        pre = null;
        next = null;
        now = obj;
    }

    public Node<T> getPre() {
        return pre;
    }

    public void setPre(Node<T> pre) {
        this.pre = pre;
    }

    public T getNow() {
        return now;
    }

    public void setNow(T now) {
        this.now = now;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
