package Models;

import java.util.ArrayList;

public class TribblesInLabs {
    public ArrayList<Tribble> tribbles;
    public ArrayList<TribbleLabs> labs;

    public TribblesInLabs(ArrayList<Tribble> tribbles, ArrayList<TribbleLabs> labs) {
        this.tribbles = tribbles;
        this.labs = labs;
    }

    @Override
    public String toString() {
        return "TribblesInLabs{" +
                "tribbles=" + tribbles.toString() +
                ", labs=" + labs.toString() +
                '}';
    }
}
