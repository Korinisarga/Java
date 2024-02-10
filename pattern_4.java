*
* *
* * *
* * * *
* * *
* *
*
public class pattern_4{

    public static void main(String[] args) {
        patter(5);
        
    }
    static void  patter(int n){
     for(int r=1;r<n;r++)
     {
     for(int j=1;j<=r;j++){
       System.out.print("*");

     }
     System.out.println( " ");
        }
    for(int r=1;r<n;r++)
     {
     for(int j=1;j<=n-r+1;j++){
       System.out.print("*");

     }
     System.out.println( " ");
        }


    }
        
            
        }
