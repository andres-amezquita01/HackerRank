/**
 * You are given q queries in the form of a, b, and n For each query, print the series corresponding to the given a, b, 
 * and n values as a single line of n space-separated integers.
 * 
 * //Input Format
 * 
 * The first line contains an integer, q denoting the number of queries.
 * Each line i of the q subsequent lines contains three space-separated integers describing 
 * the respective a-th b-th and n-th values for that query.
 * 
 * Constraints
 *  0<= q <= 500
 *  0<= a,b <= 50
 *  1<= n <= 15
 * 
 * //Output Format
 * 
 * For each query, print the corresponding series on a new line. Each series must be printed 
 * in order as a single line of n space-separated integers.
 * 
 * Sample Input
 * 
 * 2
 * 0 2 10
 * 5 3 5
 *
 * Sample Output
 * 
 * 2 6 14 30 62 126 254 510 1022 2046
 * 8 14 26 50 98
 *
 */

import java.util.Scanner;

public class LoopsSeries {

    public static int pow(int n,int i,int a, int b , int result){
        if(i > n){
            return a + result;
        }
        result +=  ((int) Math.pow(2,i) * b);
        return pow(n,i+1,a,b,result);
    }
    public static String serie(int n, int i,int a, int b, String serie){
        if(i >= n){
            return serie;
        }
        serie = serie +pow(i,0,a,b,0) + " ";
        i = i +1;
        return serie( n,  i, a, b, serie);
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(serie(n,0,a,b,""));
        }
//--------TEST DATAS------------        
//        int a = 0;
//        int b = 2;
//        int n = 10;

//        int a = 5;
//        int b = 3;
//        int n = 5;
//        System.out.println(serie(n,0,a,b,""));
        in.close();
    }
}
