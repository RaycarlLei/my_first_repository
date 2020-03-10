import java.util.Scanner;

class SciCalculator {



    public static void showMenu() {
        System.out.print("Calculator Menu\n---------------\n0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");
        System.out.println();
    }
    public static void showSel(){
        System.out.println("Enter Menu Selection:");
    }

    static Scanner d =  new Scanner(System.in);



     static double lastResult = 0.0;
    //static Scanner s =  new Scanner(System.in);

    public static double getDouble(){
        if (d.hasNextDouble()){
            double input = d.nextDouble();

            return input;
        } else {
            String inputString = d.next();
            if(inputString == "RESULT ")
                System.out.println("inputString = " + inputString);
                return lastResult;
        }

        //s.close();
    }


    public static int getInt(){
        int input = d.nextInt();
        //s.close();
        return input;
    }

    public static String getString(){
        String result = d.nextLine();
        return result;
    }

    public static void main(String[] args) {

        boolean keepRuning = true;
        double sum = 0.0;
        int cal = 0;

        System.out.println("Current Result: 0.0");
        showMenu();
        showSel();
        while (keepRuning){

            int selection = getInt();

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
                    lastResult = firstAddNum+secondAddNum;

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

                    lastResult = firstSubNum-secondSubNum;
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

                    lastResult = firstMulNum*secondMulNum;
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

                    lastResult = firstDivNum/secondDivNum;
                    sum = sum + firstDivNum / secondDivNum;
                    cal++;
                    showMenu();
                    showSel();
                    break;

                case 5:
                    System.out.print("Enter first operand: ");
                    double firstExpNum = getDouble();
                    System.out.println();
                    System.out.print("Enter second operand: ");
                    double secondExpNum = getDouble();
                    System.out.println();
                    System.out.print("Current Result:");
                    System.out.println(Math.pow(firstExpNum, secondExpNum));
                    System.out.println();

                    lastResult = Math.pow(firstExpNum,secondExpNum);
                    sum = sum + Math.pow(firstExpNum, secondExpNum);
                    cal++;
                    showMenu();
                    showSel();
                    break;

                case 6:
                    System.out.print("Enter first operand: ");
                    double firstLogNum = getDouble();
                    System.out.println();
                    System.out.print("Enter second operand: ");
                    double secondLogNum = getDouble();
                    System.out.println();
                    System.out.print("Current Result:");
                    System.out.println(Math.log(secondLogNum) / Math.log(firstLogNum));
                    System.out.println();

                    lastResult = Math.log(secondLogNum) / Math.log(firstLogNum);
                    sum = sum + Math.log(secondLogNum) / Math.log(firstLogNum);
                    cal++;
                    showMenu();
                    showSel();
                    break;

                case 7:
                    if (cal == 0) {
                        System.out.println("Error: No calculations yet to average! ");
                        showSel();
                        break;
                    } else {
                        System.out.println("Sum of calculations: " + ((double)Math.round(sum * 100) )/ 100);
                        System.out.println("Number of calculations: " + cal);
                        double ave = (double) Math.round(sum * 100 / cal) / 100;
                        System.out.println("Average of calculations:  " + ave);
                        showSel();
                        break;
                    }
                default:
                    System.out.println("Error: Invalid selection!");
                    showSel();



            }

        }


    }
}

