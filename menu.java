import java.util.Scanner;

public class menu 
{int option=0;
    public void display_menu() 
    {   Scanner in = new Scanner(System.in);
    	System.out.println(" \n\t\t\t\t\t\t\t\t\t\t\t\t\t   Menu: ");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t 1.Read story books ");

		System.out.println("\t\t\t\t\t\t\t\t\t\t\t 2.Exit the program");
		System.out.println("\n");
		
		int op=0;
		
	while(op==0)
		
		{
		
		try{
		
		System.out.println("");
		System.out.print("\t\t\t\t\t\t\t\t\t\t\tSelect one of the options above: ");
		option=in.nextInt();
		break;
		}catch(Exception axcc)
		{
		System.out.println("");	
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t .. Wrong Input Please Enter Integer ..");	
		in.nextLine();	
		}
		
		}//////
		
		
    }
    
	{
         display_menu();
		
		
  
	switch (option) 
	{
	    case 1:
		
		
		{
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t    1. A liar shepard                                        ");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t    2. Unity is important                                    ");
	    Scanner lines = new Scanner(System.in);
		
       int mnm=0;
       int num=0;
       while(mnm==0)
		   
		   {


		try{
		System.out.println("");
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t  Enter number of story : ");
		num = lines.nextInt();
		break;
		
		}catch(Exception bb)
		{
		System.out.print("");	
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t .. Wrong Input Please Enter Integer ..");	
		lines.nextLine();
		
		}
		
		   }//end while loop mnm
		
		
		
 
        if (num == 1){
			System.out.print ("Once upon a time, there lived a shepherd boy who was bored watching his flock of sheep on the hill. To amuse himself, he shouted, Wolf! Wolf!");
		    System.out.print ("The sheep are being chased by the wolf! The villagers came running to help the boy and save the sheep. They found nothing and the boy just laughed looking");
			System.out.print ("at their angry faces. Dont cry ,'wolf'    when there's no wolf boy!, they said angrily and left. The boy just laughed at them. ");
			System.out.print ("After a while, he got bored and cried, wolf! again, fooling the villagers a second time.");
		    System.out.print ("The angry villagers warned the boy a second time and left. The boy continued watching the flock.");
			System.out.print ("After a while, he saw a real wolf and cried loudly, Wolf! Please help! The wolf is chasing the sheep. Help!");
			System.out.print (" But this time, no one turned up to help. By evening, when the boy didn’t return home, the villagers wondered what happened to him ");
			System.out.print ("and went up the hill. The boy sat on the hill weeping. "); 
			System.out.print ("Why didn't you come when I called out that there was a wolf?" );
			System.out.print ("he asked angrily. " );
			System.out.print ("An old villager approached him and said, People won’t believe liars even when they tell the truth. We'll look for your sheep tomorrow morning. Let's go home now.");
		} 
		if (num == 2){
			System.out.print ("Four cows lived in a forest near a meadow. They were good friends and did everything together. ");
			System.out.print ("They grazed together and stayed together, because of which no tigers or  lions were able to kill them for food.");
			System.out.print ("But one day, the friends fought and each cow went to graze in a different direction. ");
			System.out.print (" A tiger and a lion saw this and decided that it was the perfect opportunity to kill the cows.");
			System.out.print ("They hide in the bushes and surprised the cows and killed them all, one by one.");
			
			
		}
		
	  else { System.out.println ("                                            story doesn't exist");}
	          
			
	   new menu();
	    break;
		}
  
	    case 2 :
		{
	    	System.out.println ( "                                          Program is off" );
	    	break;
		}

	    default:
	    System.out.println ( "                                        Please enter a valid option." );
	    new menu();
	    
	}
   }
}