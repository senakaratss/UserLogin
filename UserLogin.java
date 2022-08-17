import java.util.Scanner;
public class UserLogin {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		System.out.println("Username: ");
		String userName=kb.nextLine();
		System.out.println("Password: ");
		String passwrd=kb.nextLine();
		if(userName.equals("patika")&& passwrd.equals("java")) {
			System.out.println("Successful login!!!");
			}
		else if(userName.equals("patika")&& !passwrd.equals("java")) {
			System.out.println("The password is wrong!!!\nWould you like to reset your password(yes/no)");
			String x=kb.nextLine();
			if(x.equals("yes")) {
				System.out.println("Enter a new password: ");
				String newPasswrd=kb.nextLine();
				if(newPasswrd.equals(passwrd)||newPasswrd.equals("java")){
					System.out.println("Could not create password, please enter another password.");
				}
				else {
					System.out.println("Password created.");
				}
				
			}
			else {
				System.out.println("Have a nice day!");
			}
			
			
		}
		else {
			System.out.println("Your username and password are wrong.");
		}
	}
		
}
