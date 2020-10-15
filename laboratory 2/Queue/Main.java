import java.util.ArrayList;

class Queue{
    int size;
    boolean check;
    ArrayList<String> list;
    int init = -1;
    int fin = -1;

public Queue(){
    list = new ArrayList<>();
    check = true;
}
public Queue(int size){
    this.size = size;
    check = false;
    list = new ArrayList<>();
}

void push(String val){
    if(init == -1) init ++;
    else list.add(++fin, val);
}
void pull() {
     ++init;
}

void display(){
    for (String i : list) {
      System.out.println(i);
    }
}
void checkSize(){
    if (check) System.out.println("Queue never full");
    if (!check && size == list.size()) System.out.println("Queue full");
    if (!check && size > list.size()) System.out.println("Queue not full");
    if (!check && size < list.size()) System.out.println("Queue exceeds full capacity");

}
}

public class Main {

    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(5);

        queue1.push("1");
        queue1.push("2");
        queue1.push("3");
        queue1.pull();
        queue1.display();

        queue2.push("1");
        queue2.push("2");
        queue2.push("3");
        queue2.pull();
        queue2.display();

        queue1.checkSize();
        queue2.checkSize();

    }
}