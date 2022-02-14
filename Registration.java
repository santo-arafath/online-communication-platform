import java.io.*;
public class Registration
 {
     private String firstName;	
     private String lastName;	
     private String userName;	
     private String email;	
     private String password;
     private String university;	 
     private String bloodGroup;	 
	 
	 
	    public Registration(){}
		
	    public Registration(String firstName,String lastName,String userName,String email,String password,String university,String bloodGroup)
		     {
			    this.firstName=firstName;	
                this.lastName=lastName;	
                this.userName=userName;	
                this.email=email;	
                this.password=password;	
                this.university=university;	
                this.bloodGroup=bloodGroup;	
			
		     }
			 
	    // public void setPassword(char[] pass){password=pass[];}
	 
	     public String getFirstName(){return firstName;}
	     public String getLastName(){return lastName;}	
         public String getUserName(){return userName;}	
         public String getEmail() {return email;}	
         public String getPassword(){return password;}
         public String getUniversity(){return university;}
         public String getBloodGroup(){return bloodGroup;}
		 
		 
		 
		 /*
		 
		 public void saveInfo()throws Exception{
		 InputStreamReader isr = new InputStreamReader(System.in);
	     BufferedReader bfr    = new BufferedReader(isr); 
		 
		 File f1=new File("Info.txt");
	     f1.createNewFile();
		 FileWriter writer =new FileWriter(f1);
		 
		 writer.write(this.firstName);//write
	     writer.flush();//save
	     writer.close();//
		 
		 writer.write(this.lastName);//write
	     writer.flush();//save
	     writer.close();
		 
		 writer.write(this.userName);//write
	     writer.flush();//save
	     writer.close();
		 
		 writer.write(this.email);//write
	     writer.flush();//save
	     writer.close();
		 
		 writer.write(this.password);//write
	     writer.flush();//save
	     writer.close();
		 }*/
		 
		 
		 
		 
		 
		 
		 
		 
		 
		  public void showDetails()
		 {   System.out.println();
		     System.out.println("\t\t\t\t\t\t\t\t\t\t...............................................");
			 System.out.println("\t\t\t\t\t\t\t\t\t\t|                                             |s");
		     System.out.println("\t\t\t\t\t\t\t\t\t\t        First name is          : "+firstName);	
             System.out.println("\t\t\t\t\t\t\t\t\t\t        Last name is           : "+lastName);	
             System.out.println("\t\t\t\t\t\t\t\t\t\t        University name is     : "+lastName);	
             System.out.println("\t\t\t\t\t\t\t\t\t\t        University name is     : "+bloodGroup);	
             System.out.println("\t\t\t\t\t\t\t\t\t\t        Use name is            : "+userName);	
             System.out.println("\t\t\t\t\t\t\t\t\t\t        Email  is              : "+email);	
             System.out.println("\t\t\t\t\t\t\t\t\t\t        password is            : "+password);
             System.out.println("\t\t\t\t\t\t\t\t\t\t                                                 ");
			 System.out.println("\t\t\t\t\t\t\t\t\t\t|                                              |");
			 System.out.println("\t\t\t\t\t\t\t\t\t\t................................................");
			 System.out.println();
		 }   
	 
	 
	     
	 
	 
	 
		
 }

