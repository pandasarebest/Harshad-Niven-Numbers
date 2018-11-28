import java.util.ArrayList;
import java.util.Scanner; 

public class Main {
 
 
 
    public static void main(String[] args) {
        ArrayList<Integer> isHarshadNumber = new ArrayList<Integer>();
        ArrayList<Integer> tempList = new ArrayList<>();
 
 
        int jump =0;
        System.out.println("Enter two values, to find a list of Harshad numbers within that range.");
        System.out.println("Please enter the smallest number: ");
 
        Scanner sc = new Scanner(System.in);
        int harshadNumLow = sc.nextInt();
        System.out.println("Please enter the largest number: ");
        int harshadNumHigh = sc.nextInt();
        for (int j = harshadNumLow; j <= harshadNumHigh; j++) {
            if (isHarshad(j) == true) {
                isHarshadNumber.add(j);
            }
        }
        System.out.println("The following numbers are Harshad Numbers: ");
        for(int k = 0; k < isHarshadNumber.size(); k++) {
            tempList.add(isHarshadNumber.get(k));
//            System.out.println(isHarshadNumber.get(k) + ", ");
            jump++;
            if(jump == 20){
                System.out.println(tempList);
                tempList.clear();
                System.out.println("\n");
                jump = 0;
            }
        }
    }
    public static boolean isHarshad(int n){
        int sumDigits=0;
        String harshadString = Integer.toString(n);
        if(harshadString.length() == 1){
            return true;
        }else{
            char[] harshArray = harshadString.toCharArray();
 
            for(int i = 0; i < harshArray.length; i++){
                sumDigits += Character.getNumericValue(harshArray[i]);
            }
 
            if((n%sumDigits) == 0){
                return true;
            }else{
                return false;
            }
 
        }
    }
 
}
