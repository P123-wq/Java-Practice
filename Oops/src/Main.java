//inheritance
class Calculator{
    public int add(int i,int j) {
        int result = i + j;
        return result;
    }
}

class CalAdv extends Calculator
{
    public int sub(int i,int j){
        int result=i-j;
        return result;
    }



    }


// Super Keyword
class Abc{
    public Abc(){
        System.out.println("In A");
    }
    public Abc(int i){
        System.out.println("In Int A");
    }
}
class Cde extends Abc {
    public Cde() {
        super();
        System.out.println("In C");
    }
    public Cde(int i){
        super(i);
        System.out.println("In Int C");
    }


}

// Method Override

class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    @Override
    public void show(){
        super.show();
        System.out.println("In B");
    }
}
//since, both the classes have method of same name, when we create object of subclass, the method (of same name) of
// the subclass override the method of superclass.
// we can write @override to indicate this.
//to call that method of superclass, we write- super.method_name() , in the subclass method

class C extends A{
    public void show(){

        System.out.println("In C");
    }

}
//1 more concept with same example-
// create a reference of a superclass and object of subclass(dynamic method dispatch)

//we can create reference of A and object of B. i.e A obj=new b(); obj.show()
// since object is of B, it will call the method of class B
//condition is- both of them must contain the method of the same name.

// since C also extends A. we can write-> obj=new c(); obj.show();
//since, it is decided at run time which show method(b's or C's) will be executed it is called runtime polymorphism.
//and everytime method of different calss is called this is called dynamic method dispatch.












public class Main {
    public static void main(String[] args)
    {
        //Calculator obj=new Calculator();
        //int r=obj.add(4,5);
        //System.out.println(r);


        CalAdv obj2=new CalAdv();
        int r1=obj2.add(4,5);
        int r2=obj2.sub(7,3);
        System.out.println(r1 +" " + r2);
        // when we make subclass object it calls subclass constructor  and also automatically calls default superclass constructor

        Cde iu=new Cde();
        Cde obj4=new Cde(5);
        //there is an inbuilt function called 'super' inside the constructors of the subclass, which automatically calls the default constructor of parent class
        //like for example above, we are calling a default constructor for subclass Cde,  the super() inside that constructor
        //calls the default constructor of superclass Abc.
        //but when we call the parametrised constructor for subclass Cde,  the super() inside that constructor
        // calls the default constructor of superclass Abc instead of parametrised constructor.
        // to call the parametrised constructor of Abc, in the parametrised constructor of Cde we write- super(i)
        //to invoke the parametrised constructor of Abc.


        //method Override
        B obj5=new B();
        obj5.show();

        A obj6=new B();      //runtime polymorphism as this linking is done at runtime(object is assigned at runtime so which show method(A's or B's is also decided at runtime)
        obj6.show();

        obj6=new C();
        obj6.show();         // Dynamic method dispatch (first the obj6 was the object of B and now it is object of C , but reference is same(A))







    }
}