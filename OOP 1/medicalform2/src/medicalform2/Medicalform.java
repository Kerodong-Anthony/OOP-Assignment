package medicalform2;
import java.util.Scanner;
public class Medicalform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Anthy = new Scanner(System.in);
        String continueInput;

        do {
            System.out.print("Enter patient's name: ");
            String name = Anthy.next();

            System.out.print("Enter patient's age: ");
            int age = Anthy.nextInt();
//            Anthy.next(); // Consume newline

            System.out.print("Enter patient's medical condition: ");
            String condition = Anthy.next();

            System.out.println("Patient's Name: " + name);
            System.out.println("Patient's Age: " + age);
            System.out.println("Medical Condition: " + condition);

            System.out.print("Do you want to enter another patient's information? (yes/no): ");
            continueInput = Anthy.next();
        } while (continueInput.equalsIgnoreCase("yes"));

       

	}

}
