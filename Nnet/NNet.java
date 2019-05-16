/**
 *
 * @author José Robles Bastidas
 */
package Nnet;
import AlphaDeployment.*;
import BetaDeployment.*;

public class NNet {

    public Layer[] deepness;
    public boolean debug;

    public NNet(Layer[] deepness) {
        this.deepness = deepness;
    }
    public NNet(Layer[] deepness, boolean debuggable) {
        this.deepness = deepness;
        this.debug = debuggable;
    }

    public double[] forward(double[] feed) {
        double[] answer = feed;
        if(this.debug){
            for (Layer layer : deepness) {
                if (layer.type.equals("i")) {
                    answer = layer.forward(feed, true);
                } else {
                    answer = layer.forward(answer, true);
                }
            }
        }else{
            for (Layer layer : deepness) {
                if (layer.type.equals("i")) {
                    answer = layer.forward(feed);
                } else {
                    answer = layer.forward(answer);
                }
            }
        }
        return answer;
    }
}
