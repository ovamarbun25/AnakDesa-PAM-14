package stud11418038.develops.aplikasianakdesa.UI.util;

public class Counts {
    static int data = 10;
    public static void add(){
        if (data != 10)
            data++;
    }
    public static void min(){
        if (data != 0){
            data--;
        }
    }
    public static void clear(){
        data = 21;
    }
    public static int getTotal(){
        return data;
    }
}
