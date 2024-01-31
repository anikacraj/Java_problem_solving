interface St {
    void push(int item);
    int pop();
}

class M implements St {
    private int s[];
    private int tos;

    M(int size) {
        s = new int[size];
        tos = -1;
    }

    public void push(int item) {
        tos++;
        s[tos] = item;
    }

    public int pop() {
        return s[tos--];
    }
}

public class Stack {
    public static void main(String[] args) {
        M ob = new M(10);
        ob.push(10);
        ob.push(20);
        System.out.println(ob.pop());
        System.out.println(ob.pop());
    }
}
