import java.lang.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    double startTemp = 20;
    double endTemp = 90;
    double range = endTemp - startTemp;
    int length = 30;
    double[] temps = new double[length];

    Random rd = new Random();

    for (int i = 0; i < length; i++){
      temps[i] = rd.nextDouble()*range + startTemp;
    }


    Scanner scan = new Scanner(System.in);
    System.out.print("Last Temp : ");
    temps[length-1] = scan.nextDouble();
    scan.close();
    double average = average(temps);
    int aboveAverage = 0;

    for (int i = 0; i < length; i++){
      if (temps[i] > average){
        aboveAverage++;
      }
    }


    System.out.println("The Average is " + average);
    System.out.println("The Amount Above Average is " + aboveAverage);
  }




  public static double average(double[] temps){
    double average = 0;
    for (int i = 0; i < temps.length; i++){
      average+=temps[i];
    }
    average /= temps.length;
    return average;
  }
}