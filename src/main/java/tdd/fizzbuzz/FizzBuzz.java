package tdd.fizzbuzz;

public class FizzBuzz {
    String result = "";

    public String countOff(int order) {
        if (order % 3 == 0) {
            this.result += "Fizz";
        }
        if (order % 5 == 0) {
            this.result += "Buzz";
        }
        if (order % 7 == 0) {
            return "Whizz";
        }
        if (!this.result.equals("")) {
            return this.result;
        }
        return String.valueOf(order);
    }
}
