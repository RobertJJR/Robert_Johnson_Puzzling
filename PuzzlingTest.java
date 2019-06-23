public class PuzzlingTest {

    public static void main(String[] args) {
      Puzzling puzz = new Puzzling();
//---------------------------------------------------------------------------------------------------------------------------------------------------------
      System.out.println("----------Method1-----------");
      System.out.println(" ");

      int [] a = {3,5,1,2,7,9,8,13,25,32};
      System.out.println(puzz.printSumList(a));

      System.out.println(" ");
//---------------------------------------------------------------------------------------------------------------------------------------------------------
      System.out.println("----------Method2-----------");
      System.out.println(" ");
      String[] names = {"Nancy","Jinichi","Fujibayashi","Momochi","Ishikawa"};
      System.out.println(puzz.greaterThanFive(names)); 
      System.out.println(" ");
//---------------------------------------------------------------------------------------------------------------------------------------------------------
      System.out.println("----------Method3-----------");
      System.out.println(" ");
      puzz.Alpha();
      System.out.println(" ");
//---------------------------------------------------------------------------------------------------------------------------------------------------------
      System.out.println("----------Method4-----------");
      System.out.println(" ");
      
      puzz.ReturnRandomNums();

      System.out.println(" ");
//---------------------------------------------------------------------------------------------------------------------------------------------------------
      System.out.println("----------Method5-----------");
      System.out.println(" ");
      
      puzz.ReturnRandomNumsSorted();
      System.out.println(" ");
 //---------------------------------------------------------------------------------------------------------------------------------------------------------     
      System.out.println("----------Method6-----------");
      System.out.println(" ");
      
      puzz.generateRandomString("abcdefghijklmnopqrstuvwxyz0123456789", 5);

      System.out.println(" ");
//---------------------------------------------------------------------------------------------------------------------------------------------------------
      System.out.println("----------Method7-----------");
      System.out.println(" ");
      
      puzz.generateRandomStringsArray("abcdefghijklmnopqrstuvwxyz0123456789", 5);
      System.out.println(" ");
    }
}