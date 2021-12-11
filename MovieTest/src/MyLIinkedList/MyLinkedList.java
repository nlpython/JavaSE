package MyLIinkedList;

public class MyLinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int count;

    public MyLinkedList() {
        first = null;
        last = null;
        count = 0;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int size() {
        return count;
    }

    public boolean add(T obj) {
        Node<T> temp = new Node<T>(obj);
        if (count == 0) {
            first = temp;
            last = temp;
            temp.setPre(null);
            temp.setNext(null);
        } else {
            last.setNext(temp);
            temp.setPre(last);
            last = temp;
            last.setNext(null);
        }
        count++;
        return true;
    }

    public void add(int index, T obj) {
        if (index > count - 1 || index < 0) {
            throw new RuntimeException("IndexOutOfRange!");
        } else {
            if (index == 0) {
                addFirst(obj);
                return;
            }
            if (index == count - 1) {
                add(obj);
                return;
            }
            int i = 0;
            Node<T> temp = first;
            Node<T> node = new Node<T>(obj);
            while (i++ < index - 1) {
                temp = temp.getNext();
            }
            node.setPre(temp);
            node.setNext(temp.getNext());
            temp.setNext(node);
            node.getNext().setPre(node);
        }
    }

    public void addFirst(T obj) {
        Node<T> temp = new Node<T>(obj);
        first.setPre(temp);
        temp.setNext(first);
        first = temp;
        first.setPre(null);
        count++;
    }

    public void addAll(MyLinkedList<T> mll) {
        last.setNext(mll.first);
        mll.first.setPre(last);
        last = mll.last;
        count += mll.count;
    }

    public T pollFirst() {
        Node<T> temp = first;
        first = first.getNext();
        first.setPre(null);
        count--;
        return temp.getNow();
    }

    public T pollLast() {
        Node<T> temp = last;
        last = last.getPre();
        last.setNext(null);
        count--;
        return temp.getNow();
    }

    public boolean remove(T obj) {
        if (count == 0) {
            return false;
        }
        if (first.getNow().equals(obj)) {
            first = first.getNext();
            first.setPre(null);
        }

        Node<T> temp = first;
        while (temp.getNext() != null) {
            if (temp.getNow().equals(obj)) {
                temp.getPre().setPre(temp.getNext());
                temp.getNext().setPre(temp.getPre());
                return true;
            }
            temp = temp.getNext();
        }
        if (temp.getNow().equals(obj)) {
            last = last.getPre();
            last.setNext(null);
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean contains(T obj) {
        if (count == 0) {
            return false;
        }
        Node<T> temp = first;
        while (temp.getNext() != null) {
            if (temp.getNow().equals(obj)) {
                return true;
            }
            temp = temp.getNext();
        }
        return temp.getNow() == obj;
    }

    public T get(int index) {
        if (index > count - 1 || index < 0) {
            throw new RuntimeException("IndexOutOfRange!");
        } else {
            int i = 0;
            Node<T> temp = first;
            while (i++ < index) {
                temp = temp.getNext();
            }
            return temp.getNow();
        }
    }

    public void set(int index, T obj) {
        if (index > count - 1) {
            throw new RuntimeException("IndexOutOfRange!");
        } else {
            int i = 0;
            Node<T> temp = first;
            while (i++ < index) {
                temp = temp.getNext();
            }
            temp.setNow(obj);
        }
    }

    public T[] toArray() {
        if (count == 0) {
            return null;
        } else {
            T[] arr = (T[])(new Object[count]);
            int i = 0;
            Node<T> temp = first;
            while (i < count) {
                arr[i++] = temp.getNow();
                temp = temp.getNext();
            }
            return arr;
        }
    }

    @Override
    public String toString() {
        if (count == 0) {
            return "[]";
        }
        String s = "[";
        Node<T> temp = first;
        while (temp.getNext() != null) {
            s += temp.getNow().toString() + ", ";
            temp = temp.getNext();
        }
        s += temp.getNow().toString() + "]";
        return s;
    }
}
