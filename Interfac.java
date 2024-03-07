class Test implements Interf {

    @Override
    public void m2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm2'");
    }

    @Override
    public Object m1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'm1'");
    }

    public void m3() {
        System.out.println("hey");
    }
}

public class Interfac {
    public static void main(String[] args) {

        // lambda notation for the interface methods, the interface should be the
        // functional interce
        INTERFACE i = () -> {
            System.out.println("hello");
            return "";
        };
        // #### alternate way to define the single line lambda functions
        // INTERFACE i2= () ->{
        // System.out.println("bhdf");
        // };

        // another way to declare a method of interface

        // INTERFACE i = INTERFACE()
        // {
        // m1();
        // { System.out.println();
        // }
        // return "";
        // }

        // with the use of generics
        INTERFACE<String> n = () -> {
            System.out.println("hdfsd");
            return "";
        };

        // we can also control the return type and the arguments pass in a interface
        // using the generics and can say dynamic return and args

        Test t1 = new Test();
        t1.m2();
        t1.m2();
        t1.m3();

        Interf in = new Test();
        in.m1();
        in.m2();

        INTERFACE ni = new Test();
        ni.m1();

    }
}
