public class Main {
    public static void main(String[] args) {
        System.out.println("Số nguyên tố nhỏ hơn 100: ");
        int number = 2;
        while (number <= 100){
            if (checkPrime(number)){
                System.out.print(number + ",");
                number++;
                continue;
            }
            number++;
        }

    }
    public static boolean checkPrime(int number) {
        boolean check = true;
        if (number < 2){
            check = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0){
                    check = false;
                    break;
                }
                check = true;
            }
        }
        return check;
    }
}
