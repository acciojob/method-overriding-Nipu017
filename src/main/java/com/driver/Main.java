package com.driver;

class A {

    String meth()
    {
        return "Invoking method from class A";
    }
}
class B extends A{

    String meth()
    {
        return "Method is overridden in Extended class B";
    }
}

public class Main {

<<<<<<< HEAD
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.meth());
    }
=======
    public static void main(String[] args)
    {
         B obj = new B();
        System.out.println(obj.meth());
    }
  
>>>>>>> a0e6b808632047a869cf1ea6e26ba5d2bbf54f90
}