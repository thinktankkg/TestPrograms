import java.util.Arrays;

public class Calculator7 {
    public static double calcAreaOfSquare(double length){
        return length*length;

    }

    public static double calcResistanceInSeries(double r1, double r2){
        return r1+r2;
    }

    public static double calcAreaOfRectangle(double length, double width){
        return length*width;
    }

    public static double calcMilesPerHour(double distance, double time){
        return distance/time;
    }

    public static double getProfit(double revenueTotal, double expensesTotal){
        return revenueTotal-expensesTotal;
    }

    public static void main(String args[])
    {
        for (String s : Arrays.asList("calcAreaOfSquare: " + Calculator7.calcAreaOfSquare(2.0), "calcResistanceInSeries: " + Calculator7.calcResistanceInSeries(2.0, 1.5), "calcAreaOfRectangle: " + Calculator7.calcAreaOfRectangle(2.0, 1.5), "calcMilesPerHour: " + Calculator7.calcMilesPerHour(2.0, 4.0), "getProfit: " + Calculator7.getProfit(2.0, 3.0))) {
            System.out.println(s);
        }

    }
}
