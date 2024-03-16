public class SwepFun {
     public static void main(String[] args){
        int x=23;
        int y=34;
        swep(x, y);
     }
     public static void swep(int a ,int b){
      System.out.println("Before sweping a = "+ a +" b = "+b); 
      // Methods of Sweping:
      // first method: 
          b=(a+b)-(a=b);
      // 2. int c=a;
      //        a=b;
      //        b=c;
   
      //3. a=a+b;
      //   b=a-b;
      //   a=a-b;
      
   
      //4. a=a*b;
      //   b=a/b;
      //   a=a/b;
     
      //5. a=a^b;
      //  b=a^b;
      //  a=a^b;
      
         System.out.println("After sweping a = "+ a +" b = " +b); 
        }
   }
         
   
      
      
      