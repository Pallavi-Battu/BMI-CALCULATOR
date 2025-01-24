import java.util.Scanner;

 public class BMICalculator{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter your weight:");
        double weight = scanner.nextDouble();
        System.out.print("enter your height");
        double height = scanner.nextDouble();
        double bmi = weight / (height+height);
        System.out.print("your bmi :"+bmi);
        if(bmi < 20){
            System.out.print("have low bmi");
        }else if(bmi >= 20 && bmi == 40){
             System.out.print("your bmi is normal");
        }else{
            System.out.print("your bmi is high");
        }
        scanner.close();



    }
 }