/**
 * 
 * @author José Robles Bastidas
 */
package NNet;
import Lambda.Lambda;
import MyMathematics.MyMathematics;
public class Layer{
    public double[][] weight;
    public Lambda function;
    public int numbrCon;
    public double[] bias;
    public Layer(int numbrNeur, String actFunction,int numbrCon){
        this.weight = MyMathematics.newArray(numbrNeur, numbrCon); // those are every needed weight
        this.function = new Lambda(actFunction);
        this.bias = MyMathematics.newArray(numbrNeur);
        this.numbrCon = numbrCon;
    }
    /**
    * @param input An array of one dimension made by Double type
    * @return array which its dimension is the number of neurons it has
    */
    public double[] response (double[] input){
        double[] response = new double[weight.length];
        double sum = 0;
        for(int neuron = 0;neuron < weight.length; neuron++) {
           for(int indexConn = 0;indexConn < input.length; indexConn++){
               sum += input[indexConn] * weight[neuron][indexConn];
           }
           sum += bias[neuron];
           response[neuron] = function.get(sum);
        }
        return response;
    }
}