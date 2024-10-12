import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    int q=sc.nextInt();

    int hash[26]={0};
    for(int i=0;i<s.length();i++){
      hash[s.charAt(i)-'a'] += 1;
    }

    
    while(q--){
      Char c = sc.next().charAt(0);

    System.out.println(hash[c -'a']);
    }
  }
}