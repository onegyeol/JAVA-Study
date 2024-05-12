import java.util.*;

public class MyStack{
    int top, size;
    int[] data;

    public MyStack(int size){
        this.size = size;
        data = new int[size];
        top = 0;
    }

    public void init_stack(){
        top = 0;
        data[top] = 0;
    }

    public int is_full(){
        if(top == size) return 1;
        else return 0;
    }

    public int is_empty(){
        if(top == 0) return 1;
        else return 0;

    }
    public void push(int value){
        if(is_full() == 0){
            data[top] = value;
            top++;
        }
    }

    public int pop(){
        if(is_empty() == 0){
            top--;
            return data[top];
        }
        return 0;
    }

    void print(){
        System.out.println("현재 스택 상태");
        for(int i=0; i<top; i++){
            System.out.print(data[i] + " ");
        }
    }

   public static void main(String[] args) {
        MyStack s = new MyStack(5);

        s.init_stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        /**
         * 캡슐화 . 변수 관리 쉬움
         * (코드가 길어질 때에 주소값을 하나하나 기억하고 있는 것보다 변수 하나로 관리하는 게 더 편하기 때문)
         */

        int a = s.pop();
        System.out.println("pop한 값 : " + a);
        int b = s.pop();
        System.out.println("pop한 값 : " + b);

        s.print();
   }
}