package datastructure.part01;

public class sty03 {
    static int max(int a, int b, int c, int d){
        int max = 0;
        max = a;

        if(max < b) max = b;
        if(max < c) max = c;
        if(max < d) max = d;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(3,2,1,8) = " + max(3, 2, 1, 8));
    }
}
