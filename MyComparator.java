package sample;

import java.util.Comparator;

public class MyComparator implements Comparator<HuffmanNode> {
    @Override
    public int compare(HuffmanNode x, HuffmanNode y)
    {

        return x.getProbability() - y.getProbability();
    }
}
