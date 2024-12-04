import java.util.*;

public class knapsackProblem {

    public static int Knapsack(int wt[], int val[], int n, int W) {
        if (n==0 || W==0) {
            return 0;
        }
        else if(wt[n-1]<=W){
            return Math.max(val[n-1]+Knapsack(wt, val, n-1, W-wt[n-1]),Knapsack(wt, val, n-1, W));
        } 
        else{
            return Knapsack(wt, val, n-1, W);
        }
    }
    public static void main(String[] args){
        int waight[]={1, 3, 4, 5};
        int value[]={1, 4, 5, 7};
        int w = 7;
        System.out.println("Maximum values " + Knapsack(waight, value, 4, w));
    }

}
