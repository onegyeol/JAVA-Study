import java.util.*;

public class MyList{
    int[] data;
    int size, idx;

    public MyList(int size){
        this.size = size;
        idx = 0;
        data = new int[size];
    }

    public int isEmpty(){
        if(idx==0) return 1;
        else return 0;
    }

    public void add(int value){
        data[idx] = value;
        idx++;
    }

    public int get(int index){
        if(index < size) return data[index];
        else return 0;
    }

    public int remove(int index){
        int value = 0;
        if(isEmpty() == 0 && index < size){
            value = data[index];
            for(int i=index; i<size-1; i++){
                data[i] = data[i+1];
            }
            data[size-1] = 0;
            idx--;
        }
        return value;
    }

    public boolean contains(int value){
        for(int i=0; i<size; i++){
            if(data[i] == value) return true;
        }
        return false;
    }

    void print(){
        System.out.println("현재 리스트 상태");
        for(int i=0; i<size; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MyList list = new MyList(5);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.print();

        int a = list.get(2);
        System.out.println("인덱스 2번의 값 : " + a);

        int b = list.remove(1);
        System.out.println("삭제된 인덱스 1의 값 : " + b);

        list.print();

        System.out.println("1 포함 여부 : " +  list.contains(1));

    }
}