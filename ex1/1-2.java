import java.util.Scanner;
  
class Main {
  public String solution(String str){
    String answer="";
    for(char i : str.toCharArray()){
      if(Character.isLowerCase(i))
        answer+=Character.toUpperCase(i);
      else 
        answer+=Character.toLowerCase(i);
    }
    return answer;
  }
  

  public static void main(String[] args){
    Main T = new Main();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    System.out.print(T.solution(str));

  }
}
