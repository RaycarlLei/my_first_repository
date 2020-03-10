import java.util.Scanner;

class Calculator {

    public static void showMenu() {
        System.out.print("Calculator Menu\n---------------\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n");
        System.out.println();
    }
    public static void showSel(){
        System.out.print("Which operation do you want to perform? ");
        System.out.println();
    }

    static Scanner d =  new Scanner(System.in);
    //static Scanner s =  new Scanner(System.in);

    public static double getDouble(){

        double input = d.nextDouble();
        //s.close();
        return input;
    }


    /*public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        double firstNum = s.nextDouble();
        System.out.print("Enter second operand: ");
        double secondNum = s.nextDouble();

        showMenu();
        showSel();
        boolean keepRuning = true;
        double sum = 0.0;
        int cal = 0;
        while (keepRuning){

            int selection = (int)getDouble();

            Scanner scanner = new Scanner(System.in);
            Scanner d = new Scanner(System.in);
            //int selection = s.nextInt();
            //s.close();

            switch (selection) {
                case 0:
                    System.out.println("Thanks for using this calculator. Goodbye! ");
                    keepRuning = false;

                    break;

                case 1:
                    System.out.print("Enter first operand: ");
                    double firstAddNum = getDouble();
                    System.out.println();
                    System.out.print("Enter second operand: ");
                    double secondAddNum = getDouble();
                    System.out.println();
                    System.out.print("Current Result:");
                    System.out.println(firstAddNum + secondAddNum);
                    System.out.println();

                    sum = sum + firstAddNum + secondAddNum;
                    cal = cal + 1;
                    showMenu();
                    showSel();

                    break;


                case 2:
                    System.out.print("Enter first operand: ");
                    double firstSubNum = getDouble();
                    System.out.println();
                    System.out.print("Enter second operand: ");
                    double secondSubNum = getDouble();
                    System.out.println();
                    System.out.print("Current Result:");
                    System.out.println(firstSubNum - secondSubNum);
                    System.out.println();
                    sum = sum + firstSubNum - secondSubNum;
                    cal++;
                    showMenu();
                    showSel();
                    break;

                case 3:
                    System.out.print("Enter first operand: ");
                    double firstMulNum = getDouble();
                    System.out.println();
                    System.out.print("Enter second operand: ");
                    double secondMulNum = getDouble();
                    System.out.println();
                    System.out.print("Current Result:");
                    System.out.println(firstMulNum * secondMulNum);
                    System.out.println();
                    sum = sum + firstMulNum * secondMulNum;
                    cal++;
                    showMenu();
                    showSel();
                    break;

                case 4:
                    System.out.print("Enter first operand: ");
                    double firstDivNum = getDouble();
                    System.out.println();
                    System.out.print("Enter second operand: ");
                    double secondDivNum = getDouble();
                    System.out.println();
                    System.out.print("Current Result:");
                    System.out.println(firstDivNum / secondDivNum);
                    System.out.println();
                    sum = sum + firstDivNum / secondDivNum;
                    cal++;
                    showMenu();
                    showSel();
                    break;

                default:
                    System.out.println("Error: Invalid selection!");
                    showSel();



            }

        }


    }
}*/
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter first operand: ");
        double firstNum = s.nextDouble();
        System.out.print("Enter second operand: ");
        double secondNum = s.nextDouble();

        showMenu();
        showSel();
        boolean keepRuning = false;
        double sum = 0.0;
        int cal = 0;
        do {

            int selection = (int)s.nextDouble();
            s.close();

            switch (selection) {
                case 0:
                    System.out.println("Thanks for using this calculator. Goodbye! ");
                    keepRuning = false;

                    break;

                case 1:
                    double firstAddNum = firstNum;
                    double secondAddNum = secondNum;
                    System.out.println();
                    System.out.println("The result of the operation is "+(firstAddNum+secondAddNum)+". Goodbye!");
                    System.out.println();
                    break;


                case 2:
                    System.out.println("The result of the operation is "+(firstNum-secondNum)+". Goodbye!");

                    break;

                case 3:
                    System.out.println("The result of the operation is "+(firstNum*secondNum)+". Goodbye!");

                    break;

                case 4:
                    System.out.println("The result of the operation is "+(firstNum/secondNum)+". Goodbye!");
                    break;

                default:
//                    System.out.println("Error: Invalid selection!");
                    System.out.println("Error: Invalid selection! Terminating program.");
//                    showSel();



            }

        } while (keepRuning);


    }
}