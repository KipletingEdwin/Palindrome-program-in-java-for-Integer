//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Palindrome for an Integer
        int input = 151;
        String reversedInput = "";
        String stringNumber = Integer.toString(input);


        for(int i = stringNumber.length() - 1; i >=0; i--){
            reversedInput = reversedInput + stringNumber.charAt(i);
        }

        if (stringNumber.equals(reversedInput)){
            System.out.println("It is a palindrome");
        } else{
            System.out.println("It is not a palindrome");
        }



    }
}