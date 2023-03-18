package soloPractice.JavaOOP1.AccessModifiers;

class PrivateDataEx {

    private String name;

    //getter method
    public String getName() {
        return this.name;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
    }
}

class Maine {
    public static void main(String[] args) {
        PrivateDataEx d = new PrivateDataEx();

        //access the private variable using the getter and setter
        d.setName("java");
        System.out.println(d.getName());
    }
}
