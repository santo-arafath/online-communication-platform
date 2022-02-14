public class Calculator {
  
    public Calculator ()//constructor
    {}

  
  
  public double add(double a, double b) //method add
      
  
    {
       return a + b; 
    }
  
  public double substract(double a, double b) //method substract
      
  
{
return a - b; 
}
  
public double multiply(double a, double b) //method multiply
      
  
{
return a * b; 
}
  
public double divide(double a, double b) //method divide
      
  
{
  if (b == 0)
  {
    System.out.println("Error! Dividing by zero is not allowed.");
  return 0;
  }
  else
  {
return a / b; 
  }
    
}
  
public int modulo(int a, int b) //method modulo
      
  
{
if (b == 0)
  {
    System.out.println("Error! Dividing by zero is not allowed.");
  return 0;
  }
  else
  {
return a % b; 
  }
 
}
  
  
    
}