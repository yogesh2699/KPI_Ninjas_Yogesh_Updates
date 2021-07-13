package com.kpi;



interface A{
    int x = 10;
    void show();
}
interface B{
    int x = 20;
    void show();

}
class C implements A,B{
    int x = 30;
    public void show()
    {
        System.out.println(x);
        System.out.println(A.x);
        System.out.println(B.x);
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
