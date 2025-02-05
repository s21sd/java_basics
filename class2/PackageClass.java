// one program can have multiple classes but only one public class
// public class name should be same as file name
// class name should start with capital letter
// outer class can't be private or protected

public class PackageClass {
    public static void main(String[] args) {
        S s1 = new S(); // Uses the local S
        Sunny.S s2 = new Sunny.S(); // Uses Sunny.S
    }
    
}
