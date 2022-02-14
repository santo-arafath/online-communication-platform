import java.util.*;
import java.io.*;
import java.time.*;

 public class  Test 
 {
	 
	 public static void main(String []args)throws Exception
	 
	 
	 {
		 
		 int ch=0;
		 //int accountcreate=-1;
		 int accessaa=0;
		 int fouraccessaa=0;
		 int access=0;
		 int fourfaccess=0;
		 int antryee=0;
		 int antry=0;
		 
		 int iubantry=0;
		 int iubantryee=0;
		 
		 // exception while variables
		 
		 int regggg=0;
		 
		 
		 
		 Scanner input=new Scanner(System.in);
		 
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
		System.out.println("\t\t\t\t\t\t\t***********************************************************************************************************************************");
		System.out.println("\t\t\t\t\t\t\t***********************************************************************************************************************************");     
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                    ^^^^                          ^^^^ ^^^^^^^^^^^^   ^^^^^^^^^      ^^^         ^^^   ^^^^^^^^^                 |");  
		System.out.println("\t\t\t\t\t\t\t|                     ^^^^                        ^^^^  ^^^^^^^^^^^^   ^^^^^^^^^^^    ^^^         ^^^   ^^^^^^^^^^^               |");
		System.out.println("\t\t\t\t\t\t\t|                      ^^^^                      ^^^^   ^^^            ^^^       ^^   ^^^         ^^^   ^^^       ^^              |");
		System.out.println("\t\t\t\t\t\t\t|                       ^^^^                    ^^^^    ^^^            ^^^       ^^   ^^^         ^^^   ^^^       ^^              |");
		System.out.println("\t\t\t\t\t\t\t|                        ^^^^       ^^^^       ^^^^     ^^^^^^^^^^^^   ^^^^^^^^^^^    ^^^         ^^^   ^^^^^^^^^^^               |");
		System.out.println("\t\t\t\t\t\t\t|                         ^^^^     ^^^^^^     ^^^^      ^^^^^^^^^^^^   ^^^^^^^^^      ^^^         ^^^   ^^^^^^^^^                 |");
		System.out.println("\t\t\t\t\t\t\t|                          ^^^^   ^^^^^^^^   ^^^^       ^^^            ^^^            ^^^         ^^^   ^^^                       |");
		System.out.println("\t\t\t\t\t\t\t|                           ^^^^ ^^^^  ^^^^ ^^^^        ^^^            ^^^            ^^^         ^^^   ^^^                       |");
		System.out.println("\t\t\t\t\t\t\t|                            ^^^^^^^    ^^^^^^^         ^^^^^^^^^^^^   ^^^             ^^^^^^^^^^^^^    ^^^                       |");
		System.out.println("\t\t\t\t\t\t\t|                             ^^^^^      ^^^^^          ^^^^^^^^^^^^   ^^^               ^^^^^^^^^      ^^^                       |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t|                                                                                                                                 |");
		System.out.println("\t\t\t\t\t\t\t***********************************************************************************************************************************");
		int ooop=0;
		int wepup=0;
		while (wepup==0)
		
		{
		try{
		
		System.out.println("                                                                            "); 
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t  Select 1 to start or 0 to stop : " );
		ooop=input.nextInt();
		wepup=1;
		}catch(Exception b)
		{System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t ==>> Wrong input please Input Integer <<=="); 
		 input.nextLine();
		}
		
		}// wepup while end 
		
		
		
		if(ooop==1){ 
		 
		String passw="";
        String usss="";
		String psss="";
        int person =0;
        int usn=0;;
		String firstname="";
		String lastname="";
		String univer="";
		
		
		Registration user[]=new Registration[100];
		RegiFile frwd = new RegiFile();
		
		Blood bloodfrwd = new Blood();
		
		AiubGroup frwdchat = new AiubGroup();
		NsuGroup nsuchat = new NsuGroup();
		IubGroup iubchat = new IubGroup();
		AllUniversityGroup allchat = new AllUniversityGroup();
		
		
		
		LocalTime time = LocalTime.now();
        System.out.println(time);
		
		
		LocalDate date = LocalDate.now(); 
        System.out.println(time);   
		
		
		
		                                                Quiz q1=new Quiz();  //for Quiz class 
	                                                    Quiz q3=new Quiz();
	                                                    Quiz q2=new Quiz();
		
		
		
		
		
		 int ho=0;
		 while(ho==0)
			 
			 {
				passw=""; 
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
		System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");
		System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");     
		System.out.println("\t\t\t\t\t\t\t\t\t\t                                                      ");     
		System.out.println("\t\t\t\t\t\t\t\t\t\t                Date is :"+date                     );     
		System.out.println("\t\t\t\t\t\t\t\t\t\t                                                       ");     
		System.out.println("\t\t\t\t\t\t\t\t\t\t                Time is :"+time                    );     
		System.out.println("\t\t\t\t\t\t\t\t\t\t                                                       ");     
		System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");     
		System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");     
		System.out.println("\t\t\t\t\t\t\t\t\t\t|                     1.Admin                          |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|                     2.registration                   |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|                     3.login                          |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|                     4.Exit                           |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                      |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");
		
		int opt=0;
		int regiwhile=0;
		
		while(regiwhile==0)
			
			{
		regggg=0;// for second time 
		
		while (regggg==0)
			
			{
		
		try {
		System.out.println("                                                                            "); 
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t       Select an option from the list : " );
		 

		    opt=input.nextInt();
			regggg++;
		    break;//new add
		}catch(Exception c){System.out.print("");
			                System.out.print("\t\t\t\t\t\t\t\t\t\t\t ==>> Wrong input please Input Integer <<==");
							System.out.print("");
		                    input.nextLine();     }
								 
								 
		   
			}// regggi while end
			
			
		   //Exit option
		   
		   
		   input.nextLine();
		   
		   if(opt==4)
		   {
			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t>>>>Confirm<<< ");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tPress 1 for Yes ");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\tPress 2 for No ");
			System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter here : ");
			ch=input.nextInt();
			if(ch==1)
			{System.out.println("\t\t\t\t\t\t\t\t\t\t\tThank you for using ");
			break;	}else{break;}

				
			   
		   }else if (opt>4 || opt < 1)
		   {
			   
			System.out.print("\t\t\t\t\t\t\t\t\t\t\t ==++ Wrong input please try again ++==");   
			   
		   }else{break;}
		   //End of exit
		   
			}//regiwhile end
		   
		   
		   //Test
		   
		   
	switch(opt){
			 
			 
			 
			 //admin
			 case 1:{
				 
				 String usern,passww;
				 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                  Admin penel                   |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                    		                     	 "); 
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                  >>>>Login<<<<                   ");
				 System.out.println("                                                                        ");
				 
				 
				 int addsss=0;
				 
				 while(addsss==0)
				 { 
			        
				   System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Username : ");
				 usern=input.nextLine();
				   System.out.print("\t\t\t\t\t\t\t\t\t\t\t                 Password : ");
				 passww=input.nextLine();
				 
				 
				 if(usern.equals("admin")&&passww.equals("admin"))
					 
					 {
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				 System.out.println();
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                  Admin penel                   |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                |");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t                    		                     	 "); 	 
					
					
					
					
					
					
				     addsss=1;
				 System.out.println("\t\t\t\t\t\t\t\t\t\t\t            User number is : "+person);
				 System.out.println();
				 
				 if (person>0)
				 {
				      for (int ad=0;ad<person;ad++)
				         {
				           user[ad].showDetails();
				           
				 
				         }
						 
						 
						 
						//frwd.readFromFile();    // can be use to see Information  from File 
				 
		  }else {System.out.println("\t\t\t\t\t\t\t\t\t\t\t           No users are available !!!!");}
				 
				 
				 
				 int addl=0;
				 while(addl==0)
				 {
					





                int adminexception=0;
				while (adminexception==0)	
				{
                 try{
				
					 
				 System.out.print("\t\t\t\t\t\t\t\t\t\t\t          Enter 0 go back to main menu : ");
				 ho=input.nextInt();
				 adminexception=1;
				 }catch(Exception d)
				 
				               {       System.out.println(""); 
					                  System.out.println("\t\t\t\t\t\t\t\t\t\t\t    ==>> Wrong  Input Please Enter Integer <<== ");
				                      input.nextLine();  
										System.out.println("");
							   }
				 
				 
				 
				}//adminexception loop end
				 
				 
				 
				 
				 
				 if (ho!=0)
				 {System.out.println("\t\t\t\t\t\t\t\t\t\t                  Wrong input ");}
			     else{
				 addl=1; 
				 }
				 
				 }//loop
				 
				 break;
				 
		   }else{System.out.println("\t\t\t\t\t\t\t\t\t\t               |      Wrong password        |");
		         System.out.print("\t\t\t\t\t\t\t\t\t\t                 |    Press enter to retry    |");
				  input.nextLine();
					 }
					 
				 }//while loop
				 break;
			    }//case 1
				
				
				
				
				
			 //login
			 case 2:{
		 
		              Console cnsl
                             = System.console();
			             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		                     System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");
		                     System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");		 
		                     System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                      |");
		                     System.out.println("\t\t\t\t\t\t\t\t\t\t|                     Create Account                   |");
		                     System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                      |");
		                     System.out.println("\t\t\t\t\t\t\t\t\t\t********************************************************");
		 
		 
		 
		                        
		 
		 
		 
		                       System.out.print("\t\t\t\t\t\t\t\t\t\t\tFirstname         : ");
		                          String fname=input.nextLine();
								  
								  
								  
								  
		 
		                       System.out.print("\t\t\t\t\t\t\t\t\t\t\tLastname          : ");
		                           String Lname=input.nextLine();
								   
								   
							   System.out.print("\t\t\t\t\t\t\t\t\t\t\tUniversity name   : ");
		                           String univername=input.nextLine();
								   
								   
								   
		                       System.out.print("\t\t\t\t\t\t\t\t\t\t\tBlood group       : ");
		                           String blo=input.nextLine();
								   
								   
		 
		                       System.out.print("\t\t\t\t\t\t\t\t\t\t\tUsername          : ");
		                           String uname=input.nextLine();
		 
		                       
		                           String email=null;
								   
								   
								   
								  
								         int in,dot,in2,dot2;
										 int c =1;
							while(c==1){
								System.out.println("\t\t\t\t\t\t\t\t\t\t\tEmail pettern     :xxx@xxx.xxx");
								System.out.print("\t\t\t\t\t\t\t\t\t\t\tEmail             : ");
                                         email=input.nextLine();


                                         in=email.indexOf('@');

                                                if(in==-1)
												    {
													   System.out.println("\t\t\t\t\t\t\t\t\t\t\tInvalid email Adress!!");
												       c=1;
													 }
												
												
                                                else{
                                                      dot=email.indexOf('.');
													  
                                                          if(dot==-1)
														  
														      {   
																  System.out.println("\t\t\t\t\t\t\t\t\t\t\tInvalid email Adress!!");
												                   c=1;
																   
																   }
                                                          else{
                                                                    if(in<dot){
                                                                         String sub=email.substring(in+1);
	                                                                     in2=sub.indexOf('@');
	   
	                                                                        if(in2==-1){
	                                                                             String sub2=email.substring(dot+1);	
	                                                                              dot2=sub2.indexOf('.');
																				  
	                                                                                 if(dot2==-1){
																						    
																							
																							c=2;
																					 
				
	                                                                                 }else{
																						    System.out.println("\t\t\t\t\t\t\t\t\t\t\tInvalid email Adress!!!");
																							c=1;}
	 
	 
	                                                                       }else{System.out.println("\t\t\t\t\t\t\t\t\t\t\tInvalid email Adress!!!");
																		   c=1;}

                                                                    }else{System.out.println("\t\t\t\t\t\t\t\t\t\t\tInvalid email Adress!!!");
																	 c=1;}
                                                            }
                                                      }
                                                         
									}
       int l=0;
	   while (l==0){
		 
		                   char[] pass=cnsl.readPassword("\t\t\t\t\t\t\t\t\t\t\tPassword          : ");
		 
		 
		 
		 
		                   char[] cmpass=cnsl.readPassword("\t\t\t\t\t\t\t\t\t\t\tConfirm Password  : ");
		 
		 
		 
		        
		  
		                  
		 
		                   if (new String (pass).equals(new String(cmpass)))
							   
                                 {
							        
								 for (int m=0;m<pass.length;m++)
								 {
									passw=passw+pass[m];
								 }
								 //System.out.println("password   : "+passw);
								 user[person]=new Registration(fname,Lname,uname,email,passw,univername,blo);
								 
								 
								 
								 
								 
								 
								 
								 //object adding in file***
								 
								 
								 
								/* InputStreamReader isr = new InputStreamReader(System.in);
	                             BufferedReader bfr    = new BufferedReader(isr);
								 
								 
								 
								  File file[] =new File[100];
								  
								  file[person] =new File("Account.txt ");
								  file[person].createNewFile();*/
								  
								  
								  
								  
								   
		                          frwd.writeInFile("\r \n*********>>>>> Account No "+person+" Information <<<<<**********\r \nFirstname   : "+fname+"\r \nLastname  : "+Lname+ "\r \nUsername  : "+uname+"\r \nEmail   : "+email+"\r \nPassword  : "+ passw+"\r \n");
								  
								  
		                          bloodfrwd.writeInFile("\r \n	                                                                          *********>>>>> Lastname  : "+Lname+ "  <<<<<**********\r \n	                                                                          Email   : "+email+"\r \n	                                                                          Blood   : "+ blo+"\r \n");
								  //frwd.readFromFile();
									
                                  //FileWriter writer =new FileWriter(file);
								  
								  
								    
								  
								     // writer.write(frname); //write
	                                 // writer.flush();//save
									  
									  
									  
	                                                         //writer.close();
								 
								 
								 
								 
								 
								 
								 
								 
								 //end***
								 
								 
								 
								 System.out.println("");
								 System.out.println("\t\t\t\t\t\t\t\t\t**************************************************************************");
								 System.out.println("");
								 System.out.println("\t\t\t\t\t\t\t\t\t\t\tAccount Created  your password  : "+passw); 
								 System.out.println("\t\t\t\t\t\t\t\t\t\t\tYour user number is             : "+person); 
								 System.out.println("");
								 System.out.println("\t\t\t\t\t\t\t\t\t***************************************************************************");
								 l=1;
                                 person ++;
								 
	                             }
								 
								 
	 
	 
	                        else{System.out.println("\t\t\t\t\t\t\t\t\t\t\tPassword doesn't match");}
	 
	   
                }//loop 2 Test
				
				
				//user[0].showDetails();
				
			int menuWloop=0;	
				
				
			while(menuWloop==0)	
			{	
		 try{
        System.out.println("");			 
		System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter 0 for go to back to main menu : ");
        ho=input.nextInt();
		break;
			}catch(Exception menuExc)
			{
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t ...Wrong Input please Enter Integer ...  ");	
			input.nextLine();	
			}
		
			}//end menu wloop
		
     		
	 break; 
      	  
	 }//case 2
	 
	 //}//for loop 1
	 //try{
	        case 3:{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();	
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t|-------------------------------|");			
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t|-------------------------------|");	
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                               |");	
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t|            Login              |");	
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                               |");	
			System.out.println("\t\t\t\t\t\t\t\t\t\t\t---------------------------------");	
			System.out.println();
			
			int k;
			for(k=0;k<=3;k++);
			{
			          System.out.print("\t\t\t\t\t\t\t\t\t\t\tUsername     : ");	
			   String us=input.nextLine();
			   
			          System.out.print("\t\t\t\t\t\t\t\t\t\t\tPassword     : ");
               String ps=input.nextLine();
			   
			   
			   
			   int logexception=0;
			   
			   while(logexception==0)
			   {
			   
			   try {
			   
			          System.out.print("\t\t\t\t\t\t\t\t\t\t\tUser number  : ");
               usn=input.nextInt();
			   logexception++;
			   
			   }catch(Exception es)
			   {   System.out.println("");
				  System.out.println("\t\t\t\t\t\t\t\t\t\t ===)Wrong user Id -- User Is not Available  try again (=== ");
				  System.out.println("");
                  input.nextLine();				  
			   }
			  
			  //Test
			   }//logexception while end
			  
			  
			  
			  
			  
			  
			  try{
			  
			  
			  
			           System.out.println();
			
			         usss=user[usn].getUserName();
					 psss=user[usn].getPassword();
                     firstname=user[usn].getFirstName();
                     lastname=user[usn].getLastName();
					 univer=user[usn].getUniversity();
				
			    }catch(Exception loginWrongId)
			
			     {}
			
			
			
			
			
			
			
			
			        if(us.equals(usss) &&ps.equals(psss))
			
			         {
				
			             System.out.print(" login successfull"   );
			//k=4;
			//ho=1;
			          //login part   
					  
					  int loginloop=0;
					  while(loginloop==0)//login loop
					  {
					  
					  
			            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();	
                           
                       System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------");
								            System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                |");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t         ("+firstname.charAt(0)+lastname.charAt(0)   +")Welcome "+lastname+"    ");
				                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                |");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t-----------------------------------");
											
											
											System.out.println("\t\t\t\t\t\t\t\t\t--------------------------          -----------------------");
								            System.out.println("\t\t\t\t\t\t\t\t\t|                        |          |                      |");
											System.out.println("\t\t\t\t\t\t\t\t\t|    1.AIUB Group        |          |   6.Online Quiz      |");
											System.out.println("\t\t\t\t\t\t\t\t\t|    2.NSU Group         |     *    |   7.Calculator       |");
											System.out.println("\t\t\t\t\t\t\t\t\t|    3.IUB Group         |    ***   |   8.Blood            |");
											System.out.println("\t\t\t\t\t\t\t\t\t|    4.ALL Students Group|     *    |   9.Story            |");
											System.out.println("\t\t\t\t\t\t\t\t\t|    5.MY Details        |          |  10.Synonyms		 |");											
				                            System.out.println("\t\t\t\t\t\t\t\t\t|                        |          |  11.Sign Out         |");
											System.out.println("\t\t\t\t\t\t\t\t\t--------------------------           ----------------------");
											
											
											
											int option=0;
											int maniwloop=0;
											while(maniwloop==0)
											{
											try{
											System.out.print("\t\t\t\t\t\t\t\t\t\t\tSelect an option from this list : ");
											option=input.nextInt();
											break;
											}catch(Exception maniw)
											
											
											{
												
											                        System.out.println("");	
																	System.out.println("\t\t\t\t\t\t\t\t\t\t\t **** Wrong Input please enter Integer ****");	
																	input.nextLine();	
												
												
												
											}
											}//loop end
											
											
											  //Test   
											    
											
											/*switch 3*/      switch(option){
													  
												        case 1:{
															
															
															
															
															
															
															
																
												                String un="aiub";   
												                if( (univer.equalsIgnoreCase(un))==true)
															
															
												
												                 {
															
															//String messege;Test
															
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															    
																
																
																
																if(accessaa==0){
															        System.out.println("\t\t\t\t\t\t\t\t\t\t*******************************************************************************");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t                            Date Is --"+date+"                                 ");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                    ^^^        ^^^^   ^^       ^^  ^^^^^^^                   |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                   ^^ ^^       ^^^^   ^^       ^^  ^^^^^^^^                  |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                  ^^   ^^       ^^    ^^       ^^  ^^    ^^                  |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                 ^^^^^^^^^      ^^    ^^       ^^  ^^^^^^^                   |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                ^^^^^^^^^^^     ^^    ^^       ^^  ^^    ^^                  |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|               ^^         ^^   ^^^^    ^^^^^^^^^   ^^^^^^^^                  |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|              ^^           ^^  ^^^^      ^^^^^     ^^^^^^^                   |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                              STUDENTS GROUP                                 |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|*****************************************************************************|");
																}
																
															
															
															if(access==0){
															access++;
															frwdchat.writeInFile("\r \n                                                                                <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															frwdchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															frwdchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>     Aiub Group  <<<<<*********>>>>>");
															frwdchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															frwdchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															frwdchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															
															}else{
																
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															frwdchat.readFromFile();	
																
																
																
																
						
															}
															
															
															
															
															int chh=0;
															while(chh==0){
																
															



															
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tMessege        (: ");
															input.nextLine();
															String msg=input.nextLine();
															
													        
															
															frwdchat.writeInFile("\r \n                                                                              ("+firstname.charAt(0)+lastname.charAt(0)+")=>> " + msg + "                        --Sender "+lastname+ "--time is ( "+time+")" );
															
															
															
															
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															frwdchat.readFromFile();
															
															
															
															
															
															
															
															int aiubloop=0;
															while(aiubloop==0)
															
															{
														
														
															try {
															System.out.println("");
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter  0 to continue 1 to stop -->>: ");
															chh=input.nextInt();
															break;
															
															}catch(Exception aiubchat)
															        
																	
																	{
																	System.out.println("");	
																	System.out.println("\t\t\t\t\t\t\t\t\t\t\t **** Wrong Input please enter Integer ****");	
																	input.nextLine();	
																	}
															
															
															}//end aiub loop
															
															
															
															//Test
															
															
													        }//loop
															
															}//second if
															
															
															else{
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t\t You are not Aiubean Please select your University ");
																System.out.println("");
																
																}
																
																
															
														
														
														
															break;
															
															}//case 1 Test
															
															
															
															
															
												        case 2:{
															
															
												                String un1="nsu";   
												                if( (univer.equalsIgnoreCase(un1))==true)
															
															
					
												                 {
															
															
															
															
															
															
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															    
																
																
																
																if(antry==0){
															    System.out.println("");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t*******************************************************************************");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t                            Date Is --"+date+"                                 ");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^^     ^^   ^^^^^^^^   ^^       ^^                   |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^^^    ^^  ^^^^^^^^^   ^^       ^^                   |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^ ^^   ^^  ^^          ^^       ^^                   |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^  ^^  ^^   ^^^^^^^    ^^       ^^                   |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^   ^^ ^^         ^^   ^^       ^^                   |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^    ^^^^  ^^^^^^^^     ^^^^^^^^^                    |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^     ^^^  ^^^^^^^^       ^^^^^                      |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                              STUDENTS GROUP                                 |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|*****************************************************************************|");
															    System.out.println("");
																antry++;
																}
																
															
															
															if(antryee==0){
															antryee++;
															nsuchat.writeInFile("\r \n                                                                                <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															nsuchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															nsuchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>      NSU Group  <<<<<*********>>>>>");
															nsuchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															nsuchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															nsuchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															
															}else{
																
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															nsuchat.readFromFile();	
																
																
																
																
						
															}
															
															
															
															
															int chhh=0;
															while(chhh==0){
																
																
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tMessege        (: ");
															input.nextLine();
															String msg=input.nextLine();
															
													        
															
															nsuchat.writeInFile("\r \n                                                                              ("+firstname.charAt(0)+lastname.charAt(0)+")==>> " + msg + "                          Sender "+lastname+ "--time is ( "+time+")" );
															
															
															
															
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															nsuchat.readFromFile();
															
															
															
															
															int nsuloop=0;
															while(nsuloop==0)
															
															{
														
														
															try {
															System.out.println("");
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter  0 to continue 1 to stop -->>: ");
															chhh=input.nextInt();
															break;
															
															}catch(Exception nsuuuchat)
															        
																	
																	{
																	System.out.println("");	
																	System.out.println("\t\t\t\t\t\t\t\t\t\t\t **** Wrong Input please enter Integer ****");	
																	input.nextLine();	
																	}
															
															
															}//end msu loop
															
															
															
													        }//loop
															
															
															//Test
															
															
															
																 }//end if
																 else{
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t\t\t You are not Nsuean Please select your University ");
																System.out.println("");
																 
																	 
																 }//end else
															
															
															
															
															
															
															
															break;}//case 2 end
															
															
															
												        case 3:{
															
															
															String un2="iub";   
												                if( (univer.equalsIgnoreCase(un2))==true)
															
															
					
												                 {
															
															
															        
															
															
															
															         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															    
																
																
																
																if(iubantry==0){
															    System.out.println("");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t*******************************************************************************");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t                            Date Is --"+date+"                                 ");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                         ^^^^   ^^       ^^  ^^^^^^^                         |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                         ^^^^   ^^       ^^  ^^^^^^^^                        |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                          ^^    ^^       ^^  ^^    ^^                        |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                          ^^    ^^       ^^  ^^^^^^^                         |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                          ^^    ^^       ^^  ^^    ^^                        |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                         ^^^^    ^^^^^^^^^   ^^^^^^^^                        |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                         ^^^^      ^^^^^     ^^^^^^^                         |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                              STUDENTS GROUP                                 |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															      System.out.println("\t\t\t\t\t\t\t\t\t\t|*****************************************************************************|");
															    System.out.println("");
																iubantry++;
																}
																
															
															
															if(iubantryee==0){
															iubantryee++;
															iubchat.writeInFile("\r \n                                                                                <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															iubchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															iubchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>      IUB Group  <<<<<*********>>>>>");
															iubchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															iubchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>                 <<<<<*********>>>>>");
															iubchat.writeInFile(  " \n                                                                                <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															
															}else{
																
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															iubchat.readFromFile();	
																
																
																
																
						
															}
															
															
															
															
															int ch3=0;
															while(ch3==0){
																
																
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tMessege        (: ");
															input.nextLine();
															String msg=input.nextLine();
															
													        
															
															iubchat.writeInFile("\r \n                                                                              ("+firstname.charAt(0)+lastname.charAt(0)+")==>> " + msg + "                          Sender "+lastname+ "--time is ( "+time+")" );
															
															
															
															
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															iubchat.readFromFile();
															
															
															
															
															
															
															int iubloop=0;
															while(iubloop==0)
															
															{
														
														
															try {
															System.out.println("");
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter  0 to continue 1 to stop -->>: ");
															ch3=input.nextInt();
															break;
															
															}catch(Exception iubbbbchat)
															        
																	
																	{
																	System.out.println("");	
																	System.out.println("\t\t\t\t\t\t\t\t\t\t\t **** Wrong Input please enter Integer ****");	
																	input.nextLine();	
																	}
															
															
															}//end iub loop
															
															
															
															
															
															//Test
															
															
															
													        }//loop
															
															
															
															
															
															
																 }//end if 
																 else{
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t\t\t You are not Iubean Please select your University ");
																System.out.println("");
																 
																	 
																 }//end else
															
															
															
															
															
															
															
															
															
															
															
															
															break;}//case 3 end
															
															
															
															
															
												        case 4:{
															
															
															
															
															//Test
															
															//String messege;Test
															
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															    
																
																
																
																if(fouraccessaa==0){
															        System.out.println("\t\t\t\t\t\t\t\t\t\t*******************************************************************************");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t                            Date Is --"+date+"                                 ");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                        ^^^         ^^          ^^                           |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                       ^^ ^^        ^^          ^^                           |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                      ^^   ^^       ^^          ^^                           |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                     ^^^^^^^^^      ^^          ^^                           |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                    ^^^^^^^^^^^     ^^          ^^                           |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                   ^^         ^^    ^^^^^^^^    ^^^^^^^^                     |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                  ^^           ^^   ^^^^^^^^    ^^^^^^^^                     |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                              STUDENTS GROUP                                 |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                             |");
															        System.out.println("\t\t\t\t\t\t\t\t\t\t|*****************************************************************************|");
																}
																
															//faccess
															
															if(fourfaccess==0){
															fourfaccess++;
															allchat.writeInFile("\r \n                                                                             <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															allchat.writeInFile(  " \n                                                                             <<<<<*********>>>>>                 <<<<<*********>>>>>");
															allchat.writeInFile(  " \n                                                                             <<<<<*********>>>>>  Student Group  <<<<<*********>>>>>");
															allchat.writeInFile(  " \n                                                                             <<<<<*********>>>>>                 <<<<<*********>>>>>");
															allchat.writeInFile(  " \n                                                                             <<<<<*********>>>>>                 <<<<<*********>>>>>");
															allchat.writeInFile(  " \n                                                                             <<<<<*********>>>>>-----------------<<<<<*********>>>>>");
															
															}else{
																
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															allchat.readFromFile();	
																
																
																
																
						
															}
															
															
															
															
															int chh4=0;
															while(chh4==0){
																
															



															
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tMessege        (: ");
															input.nextLine();
															String msg=input.nextLine();
															
													        
															
															allchat.writeInFile("\r \n                                                                              ("+firstname.charAt(0)+lastname.charAt(0)+")=>> " + msg + "                        --Sender "+lastname+ "--time is ( "+time+")" );
															
															
															
															
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															allchat.readFromFile();
															
															
															
															
															
															
															
															int alloop=0;
															while(alloop==0)
															
															{
														
														
															try {
															System.out.println("");
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter  0 to continue 1 to stop -->>: ");
															chh4=input.nextInt();
															break;
															
															}catch(Exception alllchat)
															        
																	
																	{
																	System.out.println("");	
																	System.out.println("\t\t\t\t\t\t\t\t\t\t\t **** Wrong Input please enter Integer ****");	
																	input.nextLine();	
																	}
															
															
															}//end aiub loop
															
															
															
															//Test
															
															
													        }//loop
															
															
															
															
															
																
																
															
															
															
															
															
															
															
															
															
															
															
															
															break;}//end case 4 Test
															
															
															
															
															
															
												        case 5:{
															
															
															
															
															
															
															System.out.println("\t\t\t\t\t\t\t\t\t   *************************************************");
															System.out.println("\t\t\t\t\t\t\t\t\t   *************************************************");
															System.out.println("\t\t\t\t\t\t\t\t\t                                                    ");
															System.out.println("\t\t\t\t\t\t\t\t\t                    My details                    ");
															System.out.println("\t\t\t\t\t\t\t\t\t                                                    ");
															System.out.println("\t\t\t\t\t\t\t\t\t                                                    ");
															System.out.println("\t\t\t\t\t\t\t\t\t   *************************************************");
															System.out.println("");
															user[usn].showDetails();
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															break;
															
															}
														
														
														
														
														
														
														
														
														
														
														
														
														
														
												        case 6:{
															
															
															
															
															
															
															
															
														
															int number=0;
															int aaa=0;
															int ann=0;
	
															
	
															int quizcon =0;
	
														while(quizcon ==0 )
														{
                                                         aaa=0;
	                                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                      QUIZ                       |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                    --------                     |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                 1. Jave basic                   |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                 2. c++ basic                    |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                 3. python basic                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("");



														while (aaa==0)
														{

														try{
														System.out.print("\t\t\t\t\t\t\t\t\t\t\t Select Yout Quiz topic : "); 

	
  														number =input.nextInt();
  
  														aaa=1;

														}
														catch(Exception s){System.out.println("\t\t\t\t\t\t\t\t\t\t\t : Wrong input try again <<<+++ ");}
														input.nextLine();
														}
	
	
 														switch(number)	
	
	
	
															{
		
		
															case 1:{	
	
														int marks=0;
														char A='\0';
														char B='\0';
														char C='\0';
														char D='\0';
														char E='\0';
                                                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       5 question total 10 marks                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       Answer only option                        |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       Example : for option a enter (a)          |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");




														System.out.println("");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 1 . Which of the following option leads to the portability and security of Java ?             |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.Bytecode is executed by JVM                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.The applet makes the Java code secure and portable                                        | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.Use of exception handling                                                                 | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Dynamic binding between objects                                                           | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														A=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(A=='a'||A=='A')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														marks=marks+2;	
														}else if (A=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}

														else
														{System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
    														   System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}
	   
	   
	   
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 2 . Which of the following is not a Java features?                                            |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.Dynamic                                                                                   | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.Architecture Neutral                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.Use of pointers                                                                           | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Object-oriented                                                                           | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														B=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(B=='c'||B=='C')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														marks=marks+2;	
														}else if(B=='1')
 														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is C ");}


														else if (B=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is C ");}

														else
														{System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
   														    System.out.println("\t\t\t\t\t\t\t\t Correct ans is C ");}
	   
	   


														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 3 . The \u0021 article referred to as a                                                       |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.Unicode escape sequence                                                                   | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.Octal escape                                                                              | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.Hexadecimal                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Line feed                                                                                 | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														C=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(C=='a'||C=='A')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														marks=marks+2;	
														}else if (C=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}



														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}





														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 4 . _____ is used to find and fix bugs in the Java programs.                                  |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.JVM                                                                                       | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.JRE                                                                                       | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.JDK                                                                                       | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.JDB                                                                                       | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");


														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														D=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(D=='d'||D=='D')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														marks=marks+2;	
														}else if (D=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}



														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}





														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 5 .What does the expression float a = 35 / 0 return?                                          |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.0                                                                                         | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.Not a Number                                                                              | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.Infinity                                                                                  | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Run time exception                                                                        | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");


														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														E=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(E=='d'||E=='D')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														marks=marks+2;	
														}else if (E=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}


														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}


														q1.SetMarks(marks);
														
														
														
														
														

														int points1=0;
														int points1loop=0;

														while(points1loop==0)
														{
														try {

														System.out.println("");
														System.out.print("\t\t\t\t\t\t\t\tEnter 1 to show your points : ");
														points1=input.nextInt();
														//points3loop=1;
														break;
														//start


														}catch(Exception poi1)
														{
	
														System.out.print("");
														System.out.print("\t\t\t\t\t\t\t\t Wrong Input Enter Integer ");	
														System.out.print("");
														input.nextLine();
	
														}

														} // points2loop end








														if(points1==1)
														{
														q1.showMarks();}



														break;

															}//case 1 end
	
	
	
	
	
	
	
	

														case 2:{
	
	


                                                         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
														int markss=0;
														char fst='\0';
														char sec='\0';
														char thi='\0';
														char four='\0';
														char fif='\0';

														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       5 question total 10 marks                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       Answer only option                        |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       Example : for option a enter (a)          |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");




														System.out.println("");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 1 . Which operator is required to be overloaded as member function only?                      |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a._                                                                                         | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b._ _                                                                                       | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.++ (postfix version)                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d. =                                                                                        | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														fst=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(fst=='d'||fst=='D')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														markss=markss+2;	
														}else if (fst=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}

														else
														{System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}
	   
	   
	   
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 2 . Objects created using new operator are stored in __ memory.                               |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.Cache                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.Heap                                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.Stack                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.None of the above                                                                         | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														sec=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(sec=='b'||sec=='B')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														markss=markss+2;	
														}


														else if (sec=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}

														else
														{System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}
	   
	   


														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 3 . The default executable generation on UNIX for a C++ program is ___                        |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.a.exe                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.a                                                                                         | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.a.out                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.out.a                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														thi=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(thi=='c'||thi=='C')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														markss=markss+2;	
														}else if (thi=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is C ");}



														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is C ");}





														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 4 . Class function which is called automatically as soon as the object is created is called as|");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.Constructor                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.Destructo                                                                                 | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.Friend function                                                                           | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Inline function                                                                           | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");


														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														four=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(four=='a'||four=='A')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														markss=markss+2;	
														}else if (four=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}



														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
 														      System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}





														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 5 .An array can be passed to the function with call by value mechanism.                       |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.True                                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.False                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.None                                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Run time exception                                                                        | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");


														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														fif=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(fif=='b'||fif=='B')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														markss=markss+2;	
														}else if (fif=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}


														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}


														q2.SetMarks(markss);
														
														
														
														
														
														

														int points2=0;
														int points2loop=0;

														while(points2loop==0)
														{
														try {

														System.out.println("");
														System.out.print("\t\t\t\t\t\t\t\tEnter 1 to show your points : ");
														points2=input.nextInt();
														//points3loop=1;
														break;
//start


														}catch(Exception poi2)
														{
	
														System.out.print("");
														System.out.print("\t\t\t\t\t\t\t\t Wrong Input Enter Integer ");	
														System.out.print("");
														input.nextLine();
	
														}

														} // points2loop end







														if(points2==1)
														{
														q2.showMarks();}






	
														break;	
	
	
	
	
														}//end case 2


														case 3:{
	
	
	
	
	
	
	
	
	                                                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
														int tmarkss=0;
														char fsttt='\0';
														char seccc='\0';
														char thiii='\0';
														char fourrr='\0';
														char fifff='\0';

														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                                                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       5 question total 10 marks                 |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       Answer only option                        |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t|       Example : for option a enter (a)          |");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");
														System.out.println("\t\t\t\t\t\t\t\t\t\t\t--------------------------------------------------");




														System.out.println("");
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 1 .  What is the output for − 'Tutorials Point' [100:200]?                                    |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.Index error                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.' '                                                                                       | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.Tutorials Point                                                                           | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d. Syntax error                                                                             | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														fsttt=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(fsttt=='b'||fsttt=='B')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														tmarkss=tmarkss+2;	
														}else if (fsttt=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}

														else
														{System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
 														      System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}
	   
	   
	   
														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 2 . Which among them is used to create an object?                                             |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.A class                                                                                   | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.A function                                                                                | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.A method                                                                                  | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.A constructor                                                                             | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														seccc=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(seccc=='d'||seccc=='D')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														tmarkss=tmarkss+2;	
														}


														else if (seccc=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}

														else
														{System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
 														      System.out.println("\t\t\t\t\t\t\t\t Correct ans is D ");}
	   
	   


														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 3 . In Python, a variable must be declared before it is assigned a value                      |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.False                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.True                                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.None                                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Error                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");

														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														thiii=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(thiii=='a'||thiii=='A')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														tmarkss=tmarkss+2;	
														}else if (thiii=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}



														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
       														System.out.println("\t\t\t\t\t\t\t\t Correct ans is A ");}





														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 4 . Which of the following statements assigns the value 100 to the variable x in Python:      |");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.x << 100                                                                                  | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.x := 100                                                                                  | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.x = 100                                                                                   | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.x =: 100                                                                                  | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");


														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														fourrr=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(fourrr=='c'||fourrr=='C')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														tmarkss=tmarkss+2;	
														}else if (fourrr=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is C ");}



														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is C ");}





														System.out.println("");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               |");
														System.out.println("\t\t\t\t\t\t\t\t| 5 .In Python, a variable may be assigned a value of one type, and then later                  |");
														System.out.println("\t\t\t\t\t\t\t\t|     assigned a value of a different type:                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   a.False                                                                                     | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   b.True                                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   c.None                                                                                      | ");
														System.out.println("\t\t\t\t\t\t\t\t|                                                                                               | ");
														System.out.println("\t\t\t\t\t\t\t\t|   d.Run time exception                                                                        | ");
														System.out.println("\t\t\t\t\t\t\t\t************************************************************************************************");
														System.out.println("");


														try {
														System.out.print("\t\t\t\t\t\t\t\tEnter your charecter answer   or 1 to skip : ");
														fifff=input.next().charAt(0); 
														}catch(Exception e){
	
														}

														if(fifff=='b'||fifff=='B')
														{
														System.out.println("\t\t\t\t\t\t\t\t  Correct ans ");	
														tmarkss=tmarkss+2;	
														}else if (fifff=='1')

														{System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}


														else {System.out.println("\t\t\t\t\t\t\t\t  Wrong  ans   ");
														       System.out.println("\t\t\t\t\t\t\t\t Correct ans is B ");}


														q3.SetMarks(tmarkss);
														
														
														
														
														
														
														

														int points3=0;
														int points3loop=0;

														while(points3loop==0)
														{
														try {

														System.out.println("");
														System.out.print("\t\t\t\t\t\t\t\tEnter 1 to show your points : ");
														points3=input.nextInt();
														//input.nextLine();

														points3loop=1;
														//break;
														//start


														}catch(Exception poi3)
														{
	
														System.out.print("");
														System.out.print("\t\t\t\t\t\t\t\t Wrong Input Enter Integer ");	
														System.out.print("");
														input.nextLine();
	
														}

														} // points3 loop end





														if(points3==1)
														{
														q3.showMarks();}


	
	
	
	
	
	
	
														break;	
	
	
	
	
	
														}//end case 3





														//case 4:{}









															}//Switch main
	
	




                                                         ann=0;
														while (ann==0)

														{	


	
														try{

	
														    System.out.println("");
														    System.out.print("\t\t\t\t\t\t\t\t\t\t               Enter 0 to continue and 1 to stop : ");
														    quizcon = input.nextInt();
														    ann=1;
    

														}
														catch(Exception e){ System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tWrong Input try again ");
														                     input.nextLine(); }

 
	
														}//end while	
	
	
	
														}//end large  while start 














	
															//Test
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															
															break;}// end main menu ease 6
														
														
														
												        case 7:{
															
															
												int cal=0;
												while(cal==0)
												{           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
															System.out.println("\t\t\t\t\t\t\t\t\t......................................................");
															System.out.println("\t\t\t\t\t\t\t\t\t                      Calculator                      ");
															System.out.println("");
															System.out.println("\t\t\t\t\t\t\t\t\t......................................................");
															
															
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|------------------------|          ");
								            System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                        |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         1.+            |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         2.-            |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         3.X            |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         4.divide       |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         5.Exit         |          ");											
				                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                        |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|------------------------|          ");
											System.out.println("");
											
											int oper=0;
											int operloop=0;
											
											while(operloop==0)
												
												{
											try{
                                            System.out.print("\t\t\t\t\t\t\t\t\t\t\tSelect an operetor from list : ");
                                            oper=input.nextInt();
                                             break; 
											  
											}catch(Exception  calop)
											{
											System.out.println("");	
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t**Wrong Input, enter Integer**");	
											input.nextLine();	
											}
											
                                                }//operloop
											

                                             if(oper==5)
											 {break;}else{	


                                             int f=0;
                                             int firstnloop=0;
                                              while(firstnloop==0)
											  {
                                            try{
										    
											System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter First number           : ");
                                             f=input.nextInt();
											 break;
											}catch(Exception  mcex)
											{
											System.out.println("");	
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t**Wrong Input, enter Integer**");	
											input.nextLine();	
											}
											
											  }//end fstloop
											  
											  
											  
											  
											
											int s=0;
											int secondnloop=0;
											while(secondnloop==0)
											{
											
											try{
											System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter Second number          : ");
                                             s=input.nextInt();
											 break;
											}catch(Exception  scex)
											{
											System.out.println("");	
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t**Wrong Input, enter Integer**");	
											input.nextLine();	
											}
											
											}//secloop Test
											
											
											Calculator myCalculator = new Calculator ();
											     if(oper==1)
												 {System.out.println("");
													System.out.println("\t\t\t\t\t\t\t\t\t\t\tSum of :"+f+" + "+s+" = "+myCalculator.add(f, s)); 
													 System.out.println("");
										 
												 }else if(oper==2){
													 System.out.println("");
													System.out.println("\t\t\t\t\t\t\t\t\t\t\tsubstraction of :"+f+" - "+s+" = "+myCalculator.substract(f, s)); 
													 System.out.println("");
												 }else if(oper==3){
													 System.out.println("");
													System.out.println("\t\t\t\t\t\t\t\t\t\t\tmultiplycation of : "+f+" X "+s+" = "+myCalculator.multiply(f, s));
                                                    System.out.println("");													
												 }
												 else if(oper==4){
													 
													try {
													 System.out.println("");
													System.out.println("\t\t\t\t\t\t\t\t\t\t\tDivition of :"+f+" divide "+s+" = "+myCalculator.divide(f, s));
													System.out.println("");
													}catch(Exception arith)
													{
														System.out.println("");
													System.out.println("\t\t\t\t\t\t\t\t\t\t\tDivition By 0 is not possible ");	
													}
													
													
												 }else{
													 System.out.println("");
													System.out.println("\t\t\t\t\t\t\t\t\t\t\tSelected operator is out of list "); 
													System.out.println("");
												 }
															
											 }//else		
													

                                                      int mnmnmnnnloop=0;												
												while(mnmnmnnnloop==0)
												{
												
												         try{
												
												
												          System.out.println("");
														System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter 0 to continue and 1 for stop: ");
		                                                                cal=input.nextInt();
		                                                                
                                                                      break;																		
															
												            }catch(Exception  slllexx)
											{
											System.out.print("");	
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t**Wrong Input, enter Integer**");	
											input.nextLine();	
											}
															
															
												}//end while
                                                             
                                                             
															
												    }//loop	Test
															
															
															
															
															
															break;}//case 7

    //Test
	
												        case 8:{
															
											
															
															
															
															int location=0;
															 //bloodfrwd.readFromFile();
															 
															 int mmmm=0;
															 while(mmmm==0)
																 
																 {
																	 
																	 
												new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
															
									        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|------------------------|          ");
									        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|------------------------|          ");
									        System.out.println("\t\t\t\t\t\t\t\t\t\t\t|------------------------|          ");
								            System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                        |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         1.Dhaka        |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         2.Narayongonj  |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|         3.Sylet        |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                        |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                        |          ");											
				                            System.out.println("\t\t\t\t\t\t\t\t\t\t\t|                        |          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|------------------------|          ");
											System.out.println("\t\t\t\t\t\t\t\t\t\t\t|------------------------|          ");
											System.out.println("");
																	 
																	 
																	 
																	 
																	 
																	 
																	 
																	 
																	 
																	 
																	 
																	 
																	 
															 
															 int nnnn=0;
															 while(nnnn==0)
															 {
															 try {
															System.out.print("\t\t\t\t\t\t\t\t\t\t\tSelect your location   : ");
														     location=input.nextInt();
															 break;
															 }catch(Exception blo){
																 
																 System.out.println("\t\t\t\t\t\t\t\t\t\t\tWrong Input Please Enter Integer");
																 input.nextLine();
															   }
															   
														       }//
															   
															   
															 
                                                            if(location==1)
															{
															new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
															
															System.out.println("\t\t\t\t\t\t\t\t\t\t************************************************************************");
															System.out.println("");
															System.out.println("\t\t\t\t\t\t\t\t\t\t                              "+time+"                                  ");
															System.out.println("\t\t\t\t\t\t\t\t\t\t***********************************************************************");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                       Blood Bank Phone number                        |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                Dhake                                 |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      1.Quantum Blood Bank Lab:                       |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                          Mobile: 8801714-010869                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      2. Bangladesh Red Crescent Blood Bank           |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                           Contact No.: +880-02-9116563               |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      3.Alif Blood Bank & Transfusion Center          |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                          Mobile: 01712392923                         |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t*********************************************************************** ");    
															bloodfrwd.readFromFile();
															}else if(location==2)
																
																{
																	
																new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();	
															System.out.println("\t\t\t\t\t\t\t\t\t\t************************************************************************");
															System.out.println("");
															System.out.println("\t\t\t\t\t\t\t\t\t\t                              "+time+"                                  ");
															System.out.println("\t\t\t\t\t\t\t\t\t\t***********************************************************************");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                       Blood Bank Phone number                        |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                            Narayongonj                               |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      1.Bangladesh blood bank and Transfusion Center  |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                          Mobile: 8801977-506042                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      2. City blood bank                              |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                           Contact No.: +8801712867836                |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      3.Mohanagar blood bank                          |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                          Mobile: 01916-58979                         |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t*********************************************************************** "); 	
															bloodfrwd.readFromFile();		
																	
																	
																}//else if 1
																else if(location==3)
																	



																	{
																	

                                                                   new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                                                            System.out.println("\t\t\t\t\t\t\t\t\t\t************************************************************************");
															System.out.println("");
															System.out.println("\t\t\t\t\t\t\t\t\t\t                              "+time+"                                  ");
															System.out.println("\t\t\t\t\t\t\t\t\t\t***********************************************************************");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                       Blood Bank Phone number                        |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                Sylet                                 |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      1.Mujib Jahan Red Crescent Blood Centre         |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                          Contact No: 01611-300900                    |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      2.Crescent Blood Bank                           |");
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                           Contact No: 01937-591604                   |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                      3.Green Life Blood Bank                         |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                          Contact No: 0821-716397                     |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t|                                                                      |");    
															System.out.println("\t\t\t\t\t\t\t\t\t\t*********************************************************************** "); 
                                                             bloodfrwd.readFromFile();









																	
																	}//else if 2
																	
																	
																	
																	else {System.out.println("\t\t\t\t\t\t\t\t\t\t\t Wrong Enput ");}
																	
																	
																	//int mm=0
																	int nnn=0;
															 while(nnn==0)
															 {
															 try {
															System.out.print("\t\t\t\t\t\t\t\t\t\t\t\tEnter 0 to continue and 1 to stop : ");
															mmmm=input.nextInt();
															 break;
															 }catch(Exception blooo){
																 
																 System.out.println("\t\t\t\t\t\t\t\t\t\t\tWrong Input Please Enter Integer");
																 input.nextLine();
															   }
															   
														       }//
																	
																	
																	
																	
																	
																	//Test
																	
																	
																	
														            }//mm loop
															
															
															
															break;}//end case 8
														
														
														
														
												        case 9:{
															
															
															
															//System.out.println(" \t\t\t\t\t\t\t\t\t\t\tupdating ");
													new menu();
															
															break;}
														
														
														
														//Test
														
														
														




														
														
														
														
														
												        case 10:{ int count =1 ;
	                                                                 int a,b,c,d,e,f,g,h,i,j;
	                                                                   String spl;
	
	
	
	                                                                   while(count ==1)
	
	                                                          {
																  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
																  System.out.println ("\t\t\t\t\t\t\t\t\t\t\t   ===>>.........................<<=== ");
																  System.out.println ("\t\t\t\t\t\t\t\t\t\t\t   ===>>                         <<=== ");
																  System.out.println ("\t\t\t\t\t\t\t\t\t\t\t   ===>>         Synonym         <<=== ");
																  System.out.println ("\t\t\t\t\t\t\t\t\t\t\t   ===>>                         <<=== ");
																  System.out.println ("\t\t\t\t\t\t\t\t\t\t\t   ===>>                         <<=== ");
																  System.out.println ("\t\t\t\t\t\t\t\t\t\t\t   ===>>.........................<<=== ");
																  System.out.println ("\t\t\t\t\t\t\t\t\t\t\t   ===>>.........................<<=== ");
																  
																  
																  
																  
																  
	                                                                  input.nextLine ();//for problem
																	  System.out.println ("");
	                                                                  System.out.print ("\t\t\t\t\t\t\t\t\t\t\t\t   Enter the word : ");
	                                                                 spl = input.nextLine ();
																	       

	                                                                 a = spl.indexOf ('0');
	                                                                 b = spl.indexOf ('1');
	                                                                 c = spl.indexOf ('2');
	                                                                 d = spl.indexOf ('3');
	                                                                 e = spl.indexOf ('4');
	                                                                 f = spl.indexOf ('5');
	                                                                 g = spl.indexOf ('6');
	                                                                 h = spl.indexOf ('7');
	                                                                 i = spl.indexOf ('8');
	                                                                 j = spl.indexOf ('9');
	
	                                                   if (a== -1 && b == -1 && c == -1 && d == -1 && e== -1 && f== -1 && g == -1 && h == -1 && i == - 1 && j== -1)
	                                                    {
		                                                                String synm = spl.toLowerCase ();
		                                                                   switch (synm)
																		{
			
			                                                                case "round" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of round is >>> circle <<<");
			                                                                break;
			
			                                                                case "absurd" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of absurd is >>> rediculous <<<");
			                                                                break;
			
			                                                                case "watch" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of watch is >>> clock <<< ");
			                                                                break;
			
			                                                                case "beautiful" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of beautiful is >>> attractive <<<");
			                                                                break;
			
			                                                                case "happy" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of happy is >>> content <<< ");
			                                                                break;
			
			                                                                case "different" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of different is >>> unlike <<<");
			                                                                break;
			
			                                                                case "problem" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of problem is >>> issue <<<");
			                                                                break;
			
			                                                                case "good" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of good is >>> fine <<<");
			                                                                break;
			
			                                                                case "long" :
			                                                                System.out.println ("\t\t\t\t\t\t\t\t\t\t\tSynonym of long is >>> extended <<<");
			                                                                break;
			
			                                                                case "excited" :
			                                                                System.out.println("\t\t\t\t\t\t\t\t\t\t\tSynonym of excited is >>> thrill <<<");
			                                                                break;
			
			                                                                default :
			                                                                System.out.println ("\t\t\t\t\t\t\t\t\t\t\tNo match");
		                                                                }//switch
	                                                    }//if
	
			                                            else  
			                                              {System.out.println("");
		                                                    System.out.println (" \t\t\t\t\t\t\t\t\t\t\tOnly letters are accepted " );
			                                              }//else
			                                                        int amnamn=0;
																    while(amnamn==0)
																	{
		     
		                                                                try{
																			System.out.println("");
		                                                                System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter Enter 1 to continue and 2 for stop: ");
		                                                                count=input.nextInt();
		                                                                //input.nextLine();
																		break;
																		}catch(Exception innnnnnn)
																		{System.out.println("");
																			System.out.println("\t\t\t\t\t\t\t\t\t\t\tWrong Input Please Enter Integer");
																 
																             input.nextLine();
																		


																		
																		}
																	}//amnamnloop
                                                                    
																	
	                                                            }//loop Test
																
																
																break;
																
																
	                                                            }//case 10
																
																
														case 11:{
															    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
																System.out.println("\t\t\t\t\t\t\t\t\t\t\t.....................................");
																System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t\t\t         Sign Out Completed"  );
			                                                    System.out.println("");
																System.out.println("\t\t\t\t\t\t\t\t\t\t\t.....................................");
																
																loginloop=2;
																
													
			                                                     }//case 11
			                                             
			
			
			



			
			
			
			
											         }//switch 3
                                                    if(loginloop==0)
													{
														
													int goploop=0;
													
													while(goploop==0)

													{														
													
                                                    try
													{
													System.out.println("");
                                                    System.out.print("\t\t\t\t\t\t\t\t\t\tEnter 0 go back to Profile and 1 to main menu option : ");
													loginloop=input.nextInt();
													break;
													}catch(Exception gobackex)
													{
													System.out.println("");	
													System.out.println("\t\t\t\t\t\t\t\t\t\t\t..Wrong Input Please enter Integer..");
													input.nextLine();
													}
													
													}//eng goploop
													
													
													if(loginloop!=0)
													{break;}
													}
												
											                         
															  
											//Test
													 
												}//loop loginloop
												






			
			
			          //end of login pat
			        
			        }else{System.out.println("\t\t\t\t\t\t\t\t\t\t\t..Incorrect password !!!! try again later..");
					}
					
			 //ho=1;    
			 for(int o=0;o<=100;o++){ 
			 
			             
			             int llll=0;
						 while(llll==0)
						 {
							 
							 try{
			             System.out.print("\t\t\t\t\t\t\t\t\t\t\tEnter 0 go back to main menu  : " );
						 ho=input.nextInt();
						 break;
							 }catch(Exception nmnm)
							 {
								System.out.println("");	
								System.out.println("\t\t\t\t\t\t\t\t\t\t\t..Wrong Input Please enter Integer..");
								input.nextLine();  
								 
							 }
						 }
						 
						 
						 if(ho!=0){System.out.print("\t\t\t\t\t\t\t\t\t\t\twrong keyword ");
			              }
						  else{break;}}
			//break;
			         


		         
												  }//switch 3
		 


			

//Test
				
				//Yes
	       
			
			
			//catch{System.out.println("rong");}
	
			}//case 3
	 
	}//switch 2
	 
	//System.out.println(user[0].getPassword());
	if(ch==1)
	{break;}		
	 
	 }//while loop 1





	 
		}//if
else{System.out.println("");
	System.out.println(" \t\t\t\t\t\t\t\t\t\t\t\t\t ===>>> Thank you for using <<<===   ");
	System.out.println("");}		
	 
}//main
}//class//Test