import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean createPassword = true;

        while(createPassword) {
            String uppercase_chars = "QWERTYUIOPASDFGHJKLZXCVBNM";
            String lowercase_chars = "qwertyuiopasdfghjklzxcvbnm";
            String special_chars = "!@#$%^&*()-=_+[]{}|<>,./?`~";
            String num_chars = "0123456789";
            String password = "";

            System.out.println("------------------");
            System.out.println("PASSWORD GENERATOR");
            System.out.println("created by: Naveed Mahmoudian");
            System.out.println("------------------");

            int minDigits = 8;
            int digits = 0;
            boolean validateDigits = false;

            while(!validateDigits) {
                try {
                    System.out.println("How many digits?");
                    digits = input.nextInt();
                    input.nextLine();
                    if(digits >= minDigits) {
                        validateDigits = true;
                    } else {
                        System.out.println("Password must be at least " + minDigits + " characters");
                    }
                } catch (Exception e) {
                    System.out.println("Enter a valid integer");
                    input.nextLine();
                }
            }

            System.out.println("Uppercase characters? (y/n)");
            boolean uppercase = input.nextLine().equalsIgnoreCase("y");

            System.out.println("Lowercase characters? (y/n)");
            boolean lowercase = input.nextLine().equalsIgnoreCase("y");

            System.out.println("Numbers? (y/n)");
            boolean numbers = input.nextLine().equalsIgnoreCase("y");

            System.out.println("Special characters? (y/n)");
            boolean special = input.nextLine().equalsIgnoreCase("y");

            if (uppercase && lowercase && numbers && special) { // all true
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 4);

                    switch(rand) {
                        case 0:
                            password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                            break;
                        case 1:
                            password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                            break;
                        case 2:
                            password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                            break;
                        case 3:
                            password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                            break;
                    }
                }
            } else if (uppercase && !lowercase && !numbers && !special) { // only uppercase
                for (int i = 0; i < digits; i++) {
                    password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                    continue;
                }
            }  else if (!uppercase && lowercase && !numbers && !special) { // only lowercase
                for (int i = 0; i < digits; i++) {
                    password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                    continue;
                }
            } else if (!uppercase && !lowercase && numbers && !special) { // only numbers
                for (int i = 0; i < digits; i++) {
                    password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                    continue;
                }
            } else if (!uppercase && !lowercase && !numbers && special) { // only special
                for (int i = 0; i < digits; i++) {
                    password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                    continue;
                }
            } else if (uppercase && lowercase && !numbers && !special) { // upper, lower
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 2);

                    switch(rand) {
                        case 0:
                            password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                            break;
                        case 1:
                            password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                            break;
                    }
                }
            } else if (uppercase && !lowercase && numbers && !special) { // upper, numbers
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 2);

                    switch(rand) {
                        case 0:
                            password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                            break;
                        case 1:
                            password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                            break;
                    }
                }
            } else if (uppercase && !lowercase && !numbers && special) { // upper, special
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 2);

                    switch(rand) {
                        case 0:
                            password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                            break;
                        case 1:
                            password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                            break;
                    }
                }
            } else if (!uppercase && lowercase && numbers && !special) { // lower, numbers
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 2);

                    switch(rand) {
                        case 0:
                            password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                            break;
                        case 1:
                            password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                            break;
                    }
                }
            } else if (!uppercase && lowercase && !numbers && special) { // lower, special
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 2);

                    switch(rand) {
                        case 0:
                            password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                            break;
                        case 1:
                            password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                            break;
                    }
                }
            } else if (!uppercase && !lowercase && numbers && special) { // numbers, special
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 2);

                    switch(rand) {
                        case 0:
                            password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                            break;
                        case 1:
                            password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                            break;
                    }
                }
            } else if (uppercase && lowercase && numbers && !special) { // upper, lower, numbers
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 3);

                    switch(rand) {
                        case 0:
                            password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                            break;
                        case 1:
                            password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                            break;
                        case 2:
                            password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                            break;
                    }
                }
            } else if (uppercase && lowercase && !numbers && special) { // upper, lower, special
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 3);

                    switch(rand) {
                        case 0:
                            password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                            break;
                        case 1:
                            password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                            break;
                        case 2:
                            password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                            break;
                    }
                }
            } else if (uppercase && !lowercase && numbers && special) { // upper, numbers, special
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 3);

                    switch(rand) {
                        case 0:
                            password += uppercase_chars.charAt((int)(Math.random() * uppercase_chars.length()));
                            break;
                        case 1:
                            password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                            break;
                        case 2:
                            password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                            break;
                    }
                }
            } else if (!uppercase && lowercase && numbers && special) { // lower, numbers, special
                for (int i = 0; i < digits; i++) {
                    int rand = (int)(Math.random() * 3);

                    switch(rand) {
                        case 0:
                            password += lowercase_chars.charAt((int)(Math.random() * lowercase_chars.length()));
                            break;
                        case 1:
                            password += num_chars.charAt((int)(Math.random() * num_chars.length()));
                            break;
                        case 2:
                            password += special_chars.charAt((int)(Math.random() * special_chars.length()));
                            break;
                    }
                }
            } else  { // all false
                System.out.println("Invalid selection");
                input.close();
            }

            System.out.println(password);

            System.out.println("Create another password? (y/n)");
            createPassword = input.nextLine().equalsIgnoreCase("y");
        }

        input.close();

    }
}