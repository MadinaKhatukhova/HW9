public class Main {
       public static void main(String[] args) {
           int[] arr = new int [3];
           arr [0] = 30;
           double [] weight = {1.57, 7.654, 9.986};
           short [] small = {135, 225, 315};
           System.out.println(arr.length);
           System.out.println(weight.length);
           System.out.println(small.length);

           System.out.println(arr[0] + ", " + arr[1] + ", " + arr[2]);
           System.out.println(weight[0] + ", " + weight[1] + ", " + weight[2]);
           System.out.println(small[0] + ", " + small[1] + ", "+ small[2]);

           System.out.println(arr[2] + ", " + arr[1] + ", " + arr[0]);
           System.out.println(weight[2] + ", " + weight[1] + ", " + weight[0]);
           System.out.println(small[2] + ", " + small[1] + ", "+ small[0]);

           }}