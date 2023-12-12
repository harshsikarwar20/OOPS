public class GettersAndSetters {

    // why do we need Getter and setter?????????
    // for security reasons we make data memebers as private so we can only access them within the class itself so we 
    // cant modify(print / initialise) them from another class for that we need Getter and setters

    public static class student {
        private String name;
        // private int rollNo;
        // private double marks;

        // Setters-----------------------------------------------------
        void setname(String name){
            this.name = name;
        }
        // Getters-----------------------------------------------------
        String getName(){
            return name;
        }
    }
    public static void main(String[] args) {
        student st = new student();
        st.setname("ravi");
        System.out.println(st.getName());
    }
}
