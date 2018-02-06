//REDWAN AHMED
// CISC3150 HWQ # 4
// Reference "https://stackoverflow.com/questions/1794281/java-infinite-loop-using-scanner-in-hasnextint"
// reference "https://www.programcreek.com/java-api-examples/index.php?class=java.util.Scanner&method=hasNextInt"
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class CISC3150HWq4{
public static void main(String [] args){



		File intFile = new File("C:\\Users\\redwa\\Desktop\\hw1Q4input.txt");

		Scanner keyboard;

		try {

			keyboard = new Scanner(intFile);

			while(keyboard.hasNextInt()){

				System.out.println(keyboard.nextInt());

			}

			keyboard.close();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}
  }
