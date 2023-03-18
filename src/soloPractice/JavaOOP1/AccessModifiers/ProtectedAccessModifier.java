package soloPractice.JavaOOP1.AccessModifiers;

class ProtectedAccessModifier {

    //DECLARATIONS ARE VISIBLE WITHIN THE PACKAGE OR ALL SUBCLASSES (in the source folder)
    //NOT POSSIBLE FOR CLASSES OR INTERFACES

    //protected method
    protected void display() {
        System.out.println("JaVa");
    }

    class Data extends ProtectedAccessModifier {
        public void main(String[] args) {
            //create an object of Data class
            Data data = new Data();
            //access protected method
            data.display();
        }
    }
}
