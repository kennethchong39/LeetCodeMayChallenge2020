private Stack<Integer> s;
private Stack<Integer> p;
public StockSpanner() {
    s = new Stack();
    p = new Stack();
}

public int next(int price) {
    int r = 1;
    while(!p.isEmpty() && p.peek() <= price) {
        p.pop();
        r += s.pop();
    }

    p.push(price);
    s.push(r);

    return r;
}
