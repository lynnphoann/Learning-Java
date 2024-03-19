public class Customer {
    private String name;
    private double creditLimit;
    private String email;
    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getemail() {
        return email;
    }
    
    public Customer(String name, String email) {
        
        this(name, 1000, email);
        System.out.println("this is chain constructer");
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("this is main constructer");
    }


    // Customer() 
}
