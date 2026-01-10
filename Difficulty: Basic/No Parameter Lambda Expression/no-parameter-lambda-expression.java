class Solution {
    public static Hello helperFunction() {
        // Your code here
        // System.out.println(()->"Hello");

        // Implement sayHello using lambda expression and return the object.
        // Write this in the lambda expression: System.out.println("Hello")
        Hello obj = () -> System.out.println("Hello");

        return obj;
    }
}
// already given
// interface Hello{
//     void hello(String s);
// }