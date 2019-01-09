/**
 * 
 * @author José Robles Bastidas
 */
package NNet;
import Lambda.Lambda;
import MyMathematics.MyMathematics;
import NNet.Layer;
import java.util.ArrayList;
public class NNet{
    public ArrayList<Layer> NeuralNet;
    public NNet(int[] topology, String[] actFunctions) {
        this.NeuralNet = new ArrayList<Layer>();
        for(int i = 0; i < topology.length; i++) {
            if(i == 0){
                NeuralNet.add(new Layer(topology[i], actFunctions[i], topology[i]));
            }else{
                NeuralNet.add(new Layer(topology[i], actFunctions[i], topology[(i-1)]));
            }
        }
    }
    public double[] run(){
        return new double[0];
    }
}