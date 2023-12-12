public class Super {
    public static class Parent{
        private String parentclass = "parent";

        Parent(){
            System.err.println("This is parent class constructor");
            System.out.println(this.parentclass);
        }
        void print(){
            System.out.println("This is function of parent class");
        }
    }

    public static class Child extends Parent{
        private String childclass = "child";
        
        Child(){
            super(); // Default constructor calling...
            System.out.println("This is child class constructor");
            System.out.println(this.childclass);
            
            System.out.println(super.parentclass); // variable...
            super.print(); // function calling...  // can from here also also from down written function also...
        }
        void print(){
            super.print(); // function calling...
        }
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}
// _______________________________________________________________________________________________________________________________________________
/* Note :-
            // After inherited the super keyword will be called anyhow so you might use super keyword with values in it or 
            // create a default constructor in parent class. The super keyword is called after giving of data members in child class.

// _______________________________________________________________________________________________________________________________________________ 

// with the help of super keyword we can call the function , variable as well as constructor of the parent class...

// _______________________________________________________________________________________________________________________________________________

// invokation is done from child class to parent class. because when we create object of child class firstly constructor of child class is called
// then it calls the constructor of parent class....*/
// when we create the object of child class the order of object invocation is child to parent but order of object execution is parent to child. 

// _______________________________________________________________________________________________________________________________________________


