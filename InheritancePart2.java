public class InheritancePart2 {

    public static class Teacher{
        private String teacherName;
        private int teacherage;

        Teacher(String teacherName , int teacherage){
            this.teacherName = teacherName;
            this.teacherage = teacherage;
        }
        Teacher(){

        }
        public void print(){
            System.out.println("This is the function of parent class");
        }
    }

    public static class Student extends Teacher {
        private String studentName;
        private int studentage;

        // String teacherName ,int teacherage , 
        Student(String studentName , int studentage) {
            // super(teacherName,teacherage);

        

            this.studentName = studentName;
            this.studentage = studentage;
        }
        public void print(){
            
            super.teacherName = "Pinki mam";// variable..................
            System.out.println(super.teacherName);
            super.print(); // Function........................
            System.out.println("This is the function of child class");
        }
    }
    public static void main(String[] args) {
        Student s = new Student("Harsh", 23);
        s.print();
    }
}
