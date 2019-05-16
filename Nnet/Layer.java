/**
 *
 * @author José Robles Bastidas
 */
package Nnet;
import AlphaDeployment.*;
import BetaDeployment.*;
public class Layer {

    public Neuron[] dense;
    public int numbrCon;
    public String type;

    public Layer(Neuron[] dense, int numbrCon, String type) {
        this.dense = dense; // those are every needed weight
        this.numbrCon = numbrCon;
        this.type = type;
    }

    public double[] forward(double[] feed) {
        double[] answer = new double[this.dense.length];
        for (int i = 0; i < this.dense.length; i++) {
            answer[i] = this.dense[i].forward(feed);
        }
        return answer;
    }    
    
    public double[] forward(double[] feed, boolean debug) {
        double[] answer = new double[this.dense.length];
        if (this.type.equals("i") && debug) {
            System.out.println("Output of the input layer");
        } else if (this.type.equals("h") && debug) {
            System.out.println("Output of the hidden layer");
        } else if (this.type.equals("o") && debug) {
            System.out.println("Output of the output layer");
        }
        for (int i = 0; i < this.dense.length; i++) {
            answer[i] = this.dense[i].forward(feed);
            if (debug) {
                System.out.println("\t" + answer[i]);
            }
        }
        if (debug) {
            System.out.println("");
        }
        return answer;
    }

    /**
     * @param input An array of one dimension made by Double types
     * @return array which its dimension is the number of neurons it has
     */
    //public double[] response(double[] input) {
    //    double[] response = new double[weight.length];
    //    double sum = 0;
    //    for (int neuron = 0; neuron < weight.length; neuron++) {
    //        for (int indexConn = 0; indexConn < input.length; indexConn++) {
    //            sum += input[indexConn] * weight[neuron][indexConn];
    //        }
    //        sum += bias[neuron];
    //        response[neuron] = function.get(sum);
    //    }
    //    return response;
    //}
}
