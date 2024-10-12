import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s=sc.nextLine();
    int q=sc.nextInt();
    int hash[]=new int[26];
    Arrays.fill(hash,0);  
    for(int i=0;i<s.length();i++){
      hash[s.charAt(i)-'a'] += 1;
    }
    
    while(q>0){
      char c = sc.next().charAt(0);
      System.out.println(hash[c -'a']);
      q--;
    }
  }
}