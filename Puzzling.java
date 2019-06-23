import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;

public class Puzzling {
//1.)Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)
    // This is a public array, looking to get an Interger back. The name of the method will be printSumList(Askign for int[array] and whatever arr(Array) is)
      public ArrayList<Integer> printSumList(int[] a){
      // The array interger list is Output. Then the input will be the new. What the application is givinmg back.
      ArrayList<Integer> list = new ArrayList<Integer>();
      // Setting a variable for sum. 
      int sum = 0;
      //Run through the whole array, and add each index to create the sum.
      for (int i = 0; i < a.length; i++) {
            sum += a[i];
      //Now, if the index on the position of i is greater than 10, create a new list.
      if (a[i]>10){
            list.add(a[i]);
            }            
      }
      System.out.println(sum);
      return list;
}
//====================================================================================================================
//2.)Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.    
      public ArrayList<String> greaterThanFive(String[] names){
            ArrayList<String> name = new ArrayList<String>();
            
            Random shuff = new Random();
            String temp = "";
            //Allowing my array to shuffle as many time as i want.
            for (int i = 0; i < 10; i++) {
                  //nextInt gives me a range of 0 - whatever is in the (); To the number you set. So in this example, the length of names. So it's going to give you a number between 0 and 5.
                  int shuffleA = shuff.nextInt(names.length);
                  int shuffleB = shuff.nextInt(names.length);
                  //Now our temp value is = whatever is is in names[shuffleA] but temp is a string "" so it will turn it back into a string.
                        temp = names[shuffleA];
                        names[shuffleA] = names[shuffleB];
                        names[shuffleB] = temp;
                  }
                           // names.length = 5
            for (int i = 0; i < names.length; i++) {
                  //Every time this runs, it will print out the position 1 - 5 followed by a : and then whatever string is on names[i].
                  System.out.println((i+1) + ": " + names[i]);
            //if the position of names[i]' total length is more than 5, then we'll add it to it's own array.     
            if (names[i].length() > 5){
                  name.add(names[i]);
            }            
      }
      return name;
}
//=================================================================================================================== 
//3.) Create an array that contains all 26 letters of the alphabet (this array must have 26 values). Shuffle the array and, after shuffling, display the last letter from the array. Have it also display the first letter of the array. If the first letter in the array is a vowel, have it display a message.  
      public static void Alpha(){
            //Creating am array of char equivelant to 26.
            char[] alpha = new char[26];
                  //This for loop will run through 26 because there are 26 letters in the alphabet. The reason I don't use 27 is because i'm going to us k as an execution to add to char value.
                  for(int i = 0; i < 26; i++){
                        //So here. Array alpha[i] us going to equal ASCII (char(97)) = a . SO what i can do is do 
                        //(char(97 + (i)) is actualy 97 + 1 = 98 aka b.
                        //You can also do (char(65)) for the capitalization.
                        //While this is running, alpha[i] is being stored.
                        alpha[i] = (char)(65 + (i));
                  //if alpha[i] is equal to a OR equal to o Or...
                        //print Vowel:
                  if (alpha[i]=='a' || alpha[i]=='o' || alpha[i]=='e' || alpha[i]=='i' || alpha[i]=='u'){
                        System.out.println("Vowel: " +i);
                  }     
      } 
      System.out.println(alpha);
      System.out.println(alpha[0]);
      System.out.println(alpha[25]);    
}
//===================================================================================================================
//4.) Generate and return an array with 10 random numbers between 55-100.
    
      public static void ReturnRandomNums(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        //i needs to be < 10 because there will only be 10 numbers in the array.
        for(int i = 0; i < 10; i++) {
              //newArray is the new array. Math.random will choose a random number between 0 and whatever the max for the type is (int, double, byte). By multiplying by 100 means it will do 0 - 100. The +55 is implying to start from 55 instead of
            newArray.add((int)(Math.random()*100 + 55));
        }
        System.out.println(newArray);
    }
//===================================================================================================================
//5.)Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array. Next, display the minimum value in the array as well as the maximum value.
    public static void ReturnRandomNumsSorted(){
        ArrayList<Integer> newArray2 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            newArray2.add((int)(Math.random()*100 + 55));
        }
        //Using sort, i can sort my newly made array. And print.
        Collections.sort(newArray2);
        System.out.println(newArray2);
        //Find the min of the array.
        Integer min = Collections.min(newArray2);
        Integer max = Collections.max(newArray2);
        System.out.println(min);
        System.out.println(max);
    }
//===================================================================================================================
//6.) Create a random string that is 5 characters long.
    public static void generateRandomString(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        //I named int length and had it input'd by the application with a 5.
        for (int i = 0; i < length; i++) {
              //I'm trying out append. It's similar to add. 
              //And then theres charAt that referenced the charact at the index listed.
              //Next int gives a rang of 0 to 26 (That's the length input by the application)
              //So this reads
                  //String Builder Appends (character at(random 0 to(26())))
            sb.append(candidateChars.charAt(random.nextInt(candidateChars
                    .length())));
        }
        //toString is basically bringing the string all together. sb has been building due to append, now toString brings it together.
        System.out.println(sb.toString());
    }
//===================================================================================================================
//7.) Generate an array with 10 random strings that are each 5 characters long
       public static void generateRandomStringsArray(String candidateChars, int length){
        ArrayList<String> list = new ArrayList<String>();
        //Creating a for loop to run everything from before 5 times.
        for(int index = 0; index < 10; index++) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < length; i++) {
                sb.append(candidateChars.charAt(random.nextInt(candidateChars
                        .length())));
            }
            //now that that's run 5 times, we'll add it to "list"
            list.add(sb.toString());
        }
        System.out.println(list);
    }
    
}

