public class RecursiveMethod {
    public static void main(String[] args) {

        System.out.println(factorialLoop(15));
        System.out.println(factoraialRecursive(10));

        loop(1000);
        }

    static int factorialLoop(int value) {
        var result = 1;

        for (int i = 1; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    static int factoraialRecursive(int value){
        if (value == 1){
            return 1;
        }else{
            return value * factoraialRecursive(value -1);
        }
    }

    static void loop(int value){
        if (value == 0){
            System.out.println("Selesai");
        }else {
            System.out.println("Loop " + value);
            loop(value -1);
        }
    }
}
