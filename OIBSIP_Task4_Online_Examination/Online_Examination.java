package task4;

import java.util.Scanner;

public class Online_Examination {
	
	
	Scanner sc = new Scanner(System.in);
    String userid = "Aniruddha";
    int password =4545;
    
    //login
    void login() {
    	
    	System.out.println("\tWELCOME TO THE ONLINE EXAM PORTAL!!!");
    	
    	//taking username
        System.out.print("Enter your username:");
        userid = sc.next();
        
        //taking user password
        System.out.print("Enter your password:");
        password = sc.nextInt();
        
        if (userid.equals("Aniruddha") && password ==4545) {
            System.out.println("**Your login is Successful**");
            view_menu();
        } else {
            System.out.println("**Login failed, please try again!!**");
            login();
        }
    	
    }
    public void view_menu() {
		int Choice;
		System.out.println("**User Menu**");
		System.out.println("1.Update Profile \n 2.Write Exam \n 3.Exit ");
		System.out.println("Enter your Choice: ");
		Choice = sc.nextInt();
		switch(Choice) {
		case 1:
			update_details();
			break;
		case 2:
			examination();

			break;
		case 3:
			//closing session
            System.out.println("Thanks !!!");
			System.exit(0);
			break;
		default:
			System.out.println("Please enter valid choice.");
		}
	}
    
    
    //update profile and password
    public void update_details(){
    	System.out.println("");
		String update_name;
		int update_pwd;
		System.out.println("Update your profile and password here.. ");
		System.out.println("Enter the Username: ");
		update_name = sc.next();
		if(update_name.equals(userid)) {
		System.out.println("Enter New Password for your Account");
		update_pwd = sc.nextInt();
		userid = update_name;
		password=update_pwd;
		
		
        System.out.println("Your details are updated Successfully....");
		}
		else {
			System.out.println("please enter the correct userName");
		}
		view_menu();
	}
    
    public void examination() {
    	
    	int ans;
    	int score=0;
    	long start_time=System.currentTimeMillis();
		long end_time=start_time+30;
    	
		
		//timer and auto submit
		while(System.currentTimeMillis()<end_time)
		{
    	System.out.println("You have 5 quetions and time limit is 5 minutes");
		System.out.println("");
		System.out.println("Each quetion for 2 marks and negative marking is there...");
		System.out.println("");
		
		System.out.println("****You have to answer the following questions: ****");
		System.out.println();
		
		//selecting answers for MCQs
		//1
		System.out.println("Q1. Which of the following option leads to the portability and security of Java?");
		System.out.println("1)Bytecode is executed by JVM"+"\n"+"2)The applet makes the Java code secure and portable\n"+"3)Use of exception handling\n"+"4)Dynamic binding between objects\n");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==1)
		{
			score=score+2;
		}
		else
		{
			score--;
		}
		
		System.out.println();
		
		//2.
		
		
		System.out.println("Q2. ____ is used to find and fix bugs in the Java programs.");
		System.out.println("1)JVM"+"\t"+"2)JRE"+"\t"+"3)JDK\t"+"4)JDB"+"\t");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==4)
		{
			score=score+2;
		}
		else
		{
			score--;
		}
		
		System.out.println();
		
		
		//3.
		
		
		System.out.println("Q3. Which of the following is a valid declaration of a char?");
		System.out.println("1)char ch = '\\utea';"+"\t"+"2) char ca = 'tea';"+"\t"+"3)char cr = \\u0223;"+"\t"+"4)char cc = '\\itea';");
				
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
				
		if(ans==1)
		{
			score=score+2;
			}
		else
		{
			score--;
			}
		System.out.println();
		
		//4
		
		
		System.out.println("Q4. What is the return type of the hashCode() method in the Object class?");
		System.out.println("1)Object"+"\t"+"2)int"+"\t"+"3)long"+"\t"+"4)void");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==2)
		{
			score=score+2;
		}
		else
		{
			score--;
		}
		
		System.out.println();
		
		
		//5
		
		
		System.out.println("Q5. Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?");
		System.out.println("1)javap tool"+"\t"+"2)javaw command "+"\t"+"3)Javadoc tool"+"\t"+"4)javah command");
		
		System.out.println("Enter your ans: ");
		ans=sc.nextInt();
		System.out.println("----your Answer is saved----");
		
		if(ans==3)
		{
			score=score+2;
		}
		else
		{
			score--;
		}
		
		break;
		}
		
		
		
		
		
		System.out.println();
		
		System.out.println("you have finished your Exam!!!");
		System.out.println();
		System.out.println("Congratulations!!!");
		System.out.println();
		System.out.println("*****your Score is "+""+score+"/10"+"*****");
		System.out.println();
		
		view_menu();
		
    
		
    }
    
    public static void main(String[] args) {

		Online_Examination e1 =new Online_Examination();
		e1.login(); 
		

	}

}