import java.util.*;
public class PigLatin{
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if ((s.charAt(0) == 'a') || (s.charAt(0) == 'e') || (s.charAt(0) == 'i') || (s.charAt(0) == 'o') || (s.charAt(0) == 'u')){
      return (s + "hay");
    }
    return (s.substring(1) + s.charAt(0) + "ay");
  }
  public static String pigLatin(String s){
    s = s.toLowerCase();
    String[] listOfDigraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    if (s.length() <= 2){
      return pigLatinSimple(s);
    }
    String twoCheck = s.substring(0, 2);
    for(int i = 0; i < listOfDigraphs.length; i++){
      if(twoCheck.equals(listOfDigraphs[i])){
        return(s.substring(2) + twoCheck + "ay");
      }
    }
    return pigLatinSimple(s);
  }
  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if ((s.charAt(0) > 'z') || (s.charAt(0) < 'a')){
      return s;
    }
    //if punctuation case
    else if ((s.charAt(s.length() - 1) > 'z') || (s.charAt(s.length() - 1) < 'a')){
      return (pigLatin(s.substring(0, s.length() -1)) + s.substring(s.length() -1));
    }
    else{
      return pigLatin(s);
    }
  }

  public static void main(String[] args){
    Scanner line = new Scanner(System.in);
    while(line.hasNextLine()){
      Scanner words = new Scanner(line.nextLine());
      while(words.hasNext()){
        System.out.print(pigLatinBest(words.next()));
        if(words.hasNext()){
          System.out.print(" ");
        }
      }
      if(line.hasNextLine()){
        System.out.println();
      }
    }
    /*
    System.out.println(pigLatin("the"));
    System.out.println(pigLatin("check"));
    System.out.println(pigLatin("skee"));
    System.out.println(pigLatin("emu"));
    System.out.println(pigLatin("grade"));
    */
  }



}
