/**
 * 
 * @author José Robles Bastidas
 */
package MyMathematics;
public class MyMathematics{
    public static double random(int max, int min) {
        if(max > min){
            return ((double)(Math.random()*(max-min))+min);
        } else if(min == max){
            return max;
        } else{
            return ((double)(Math.random()*(min-max))+max);
        }
    }
    public double[][] mul(){
        return new double[0][0];
    }
	public static double[] newArray(double n) {
        double[] mainArray = new double[0];
        for(int i = 0; i < n; i++){
            mainArray[i] = (double)random(1, 0);
        }
        return mainArray;
    }
    public static double[][] newArray(int col, int filas) {
        double[][] mainArray = new double[col][filas];
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < col; j++){
                mainArray[j][i] = random(1, 0);
            }
        }
        return mainArray;
    }
}