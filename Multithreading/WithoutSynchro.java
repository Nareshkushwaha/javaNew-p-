// package Multithreading;
class A {
    String name;

    A(String name) {
        this.name = name;
    }
}

class B {
    A p;// class refrence variable

    B(A p) {
        this.p = p;
    }

    void show() {
        System.out.println(p.name);
    }
}

 class WithoutSynchro {
    public static void main(String[] args) {
        A k = new A("kajal");
        B l = new B(k);
        l.show();
    }
}