     *
    * *
  *  *  *
*  *   *   *
 *   *   *
   *   *
     *
     public class pattern_5{

  public static void main(String[] args) {
     patter(5);
  }
  static void patter(int n){
 for(int row=0;row<2*n;row++){
    int totalnorow =row >n ? 2*n -row :row;
   for(int space=0;space<n-totalnorow;space++){
    System.out.print("  ");
   }
    for(int col=0;col<=totalnorow;col++)
    {
      System.out.print("  *  ");
    }
    System.out.println( );
  }    
  }}
