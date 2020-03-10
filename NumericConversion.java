import java.util.Scanner;
class NumericConversion {
    public static void showMenu(){
        System.out.println("Decoding Menu\n ------------- \n1. Decode hexadecimal \n2. Decode binary \n3. Convert binary to hexadecimal \n4. Quit \n");
    }
    public static void showEnterOption(){
        System.out.print("\nPlease enter an option: ");
    }
    public static void showConvert(){
        System.out.print("Please enter the numeric string to convert: ");
    }
    public static void printResult(int finalResult){
        System.out.println("Result: " + finalResult);
    }
    public static int getDecimal(int binary)
    //inspired by www.javatpoint.com/java-binary-to-decimal
    {
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
    public static int getInt(){
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        //s.close();
        return input;
    }
    public static int getInt2(){
        Scanner s2 = new Scanner(System.in);
        int input = s2.nextInt();
        //s.close();
        return input;
    }

    public static String getString(){
        showConvert();
        Scanner s1 = new Scanner(System.in);
        String input ="";
        if (s1.hasNextLine()){
            input = s1.nextLine();
        }
        //s1.close();
        return input;
    }

    public static long hexStringDecode(String hex) {
        /*hex = hex.toLowerCase();
        if (hex.length()>=2){
            if (hex.charAt(0)=='0' && hex.charAt(1)=='x'){
                long result =0;
                int digit = 0;
                for (int i =2;i<hex.length();i++){
                    digit = hex.length()-i-2;
                    switch (hex.charAt(i)){
                        case 'a':
                        case 'A':
                            result += 10*Math.pow(16,digit);
                        case 'b':
                            result += 11*Math.pow(16,digit);
                        case 'c':
                            result += 12*Math.pow(16,digit);
                        case 'd':
                            result += 13*Math.pow(16,digit);
                        case 'e':
                            result += 14*Math.pow(16,digit);
                        case 'f':
                            result += 15*Math.pow(16,digit);
                        default:
                            result += (int)hex.charAt(i)*Math.pow(16,digit);

                    }
                }
                return result;
            }else {
                long result =0;
                int digit = 0;
                for (int i =0;i<hex.length();i++){
                    digit = hex.length()-i;
                    switch (hex.charAt(i)){
                        case 'a':
                            result += 10*Math.pow(16,digit);
                        case 'b':
                            result += 11*Math.pow(16,digit);
                        case 'c':
                            result += 12*Math.pow(16,digit);
                        case 'd':
                            result += 13*Math.pow(16,digit);
                        case 'e':
                            result += 14*Math.pow(16,digit);
                        case 'f':
                            result += 15*Math.pow(16,digit);
                        default:
                            result += (int)hex.charAt(i)*Math.pow(16,digit);

                    }
                }
                return result;
            }
        }
        return 0;*/
        try{
            int decimal = Integer.parseInt(hex,16);
            return decimal;
        } catch (NumberFormatException e) {

        } finally {
            hex= hex.replace('x','0');
            int decimal =Integer.parseInt(hex,16);
            return decimal;
        }
    }

  //  Decodes an entire hexadecimal string and returns its value.


/*    public static short hexCharDecode(char digit) {

    }
 */  // Decodes a single hexadecimal digit and returns its value.



    public static short binaryStringDecode(String binary) {
        try{
            short decimal = (short)Integer.parseInt(binary,2);
            return decimal;
        } catch (NumberFormatException e) {

        } finally {
            binary= binary.replace('b','0');
            short decimal =(short) Integer.parseInt(binary,2);
            return decimal;
        }
    }
    //Decodes a binary string and returns its value.



    public static String binaryToHex (int binary){
        try{
            int temp = getDecimal(binary);
            String hex = String.valueOf(Integer.parseInt(String.valueOf(temp),16));
            return hex;
        } catch (NumberFormatException e) {

        } finally {
            return "";
        }
    }
    //*Decodes a binary string, re-encodees it as hexadecimal, and returns the hexadecimal string.





    public static void main(String[] args) {
        boolean keepGoing =true;

        loop1:
        while (keepGoing){
            showMenu();
            int i=0;
            showEnterOption();
            int operation =0;
            if(i==0){
                operation = getInt();
            } else{
                operation = getInt2();
            }
            if(operation ==4){
                break loop1;
            }
            switch (operation){
                case 4:
                    keepGoing =false;
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    showConvert();
                    String inputTemp =getString();
                    printResult((int)hexStringDecode(inputTemp));
                    i=2;
                case 2:
                    showConvert();
                    String inputBinary = getString();
                    printResult(binaryStringDecode(inputBinary));
                    i=2;
                case 3:
                    showConvert();
                    String rawInput = getString();
                    rawInput=rawInput.replace('b','0');
                    int finalInput = Integer.parseInt(String.valueOf(rawInput));
                    printResult(Integer.parseInt(binaryToHex(finalInput)));
                    i=2;

            }
            showMenu();

            showEnterOption();
            if(i==0){
                operation = getInt();
            } else{
                operation = getInt2();
            }
            if(operation ==4){
                break loop1;
            }

        }
    }
}