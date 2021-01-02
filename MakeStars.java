import java.util.*;
public class MakeStars{
  public static void main(String[] args){
    Scanner lineParse = new Scanner(System.in);
    while(lineParse.hasNextLine()){
      Scanner wordParse = new Scanner(lineParse.nextLine());
      while(wordParse.hasNext()){
        String wordStar = wordParse.next();
        for(int i = 0; i < wordStar.length(); i++){
          System.out.print("*");
        }
        if(wordParse.hasNext()){
          System.out.print(" ");
        }
      }
      if(lineParse.hasNextLine()){
        System.out.println();
      }
    }
  }
}
