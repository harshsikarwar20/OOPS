public class ThisKeyword {

    // uses of "this" KEYWORD-------------------------------------
    // 1. for removing name conflict.
    // 2. Constructor chaning.
    // 3. refer memeber function within the class.
    // 4. return the current object from a method or a constructor.
    // 5. pass the current object as a parameter to a method or constructor.

    // 3. refer memeber function within the class.
    public static class student {
        private String name;
        private int rollno;
        private int marks;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getRollno() {
            return rollno;
        }
        public void setRollno(int rollno) {
            this.rollno = rollno;
        }
        public int getMarks() {
            return marks;
        }
        public void setMarks(int marks) {
            this.marks = marks;
        }

        student(){
            name = "Anonomous";
            rollno = 0;
            marks = 0;
        }

        student(String name , int rollno , int marks){
            this.name = name;
            this.rollno = rollno;
            this.marks = marks;
        }
        
        public void printMarks(){
            // 3. refer memeber function within the class.
            int marks = this.getMarks();   // <----------
            if(marks > 33){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
            }
        }
    }

    // 2. Constructor chaning.
    public static class cuboid{
        int length;
        int breadth;
        int height;
        
        cuboid(int length , int breadth , int height){
            this.length = length;
            this.breadth = breadth;
            this.height = height;
        }
        cuboid(){
            // this.length = 1;
            // this.breadth = 1;
            // this.height = 1;
            this(1);
            // Do above one or below one both are same---------------------
        }
        cuboid(int side){
            // this.length = side;
            // this.breadth = side;
            // this.height = side;
            this(side,side,side);
        }
        cuboid(int length , int breadth){
            // this.length = length;
            // this.breadth = breadth;
            // this.height = 0;
            this(length , breadth , 0);
        }

        // 4. return the current object from a method or a constructor.
        cuboid merge(cuboid other){
            this.length = this.length + other.length;
            this.breadth = this.breadth + other.breadth;
            this.height = this.height + other.height;
            return this;
            
            // tejsavi(this);
        }

        void tejsavi(cuboid c1){
            System.out.println(c1.length);
        }
    }

    public static void main(String[] args) {
        // 3. refer memeber function within the class.
        // student st = new student("Tejsavi" , 24 , 100);
        // st.printMarks();

        // student st1 = new student("Tejsavi" , 24 , 20);
        // st1.printMarks();

        // 2. Constructor chaning.
        cuboid c1 = new cuboid();
        cuboid c2 = new cuboid(5);
        
        // 4. return the current object from a method or a constructor.
        // c1.merge(c2);
        // c2 is behaving like other and c1 is for this keyword at line no. 89-------------------------
        cuboid c3 = c1.merge(c2);
        System.out.println(c3.length);

        // 5. pass the current object as a parameter to a method or constructor.
        c2.merge(c1);
    }
}