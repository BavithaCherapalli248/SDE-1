import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int hcf=findHcf(n,m);
        int lcm=findLCM(n,m);
        System.out.println(hcf);
        System.out.println(lcm);
    }
    
    public static int findHcf(int n,int m){
        int hcf=0;
        for(int i=1; i<=Math.min(n,m);i++){
            if(n % i ==0 && m % i == 0){
                hcf= i;
            }
        }
        return hcf;
    }
    
    public static int findLCM(int n,int m){
        int lcm=0;
        int l=Math.max(n,m);
        for(int i=Math.max(n,m); i<= n*m ;i=i+l){
            if((i%m==0) && (i%n == 0)  ){
                lcm=i;
                break;
            }
        }
        return lcm;
    }
    
}
