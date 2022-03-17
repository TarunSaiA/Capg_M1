package day3_mar9;

public interface Arthimetic {
    int add(int x,int y);
    default void display(int x) {
    	System.out.println("This is from default method"+x);
    }
    static void output() {
    	System.out.println("This is from static method");
    }
}
