package sample;

public class HuffmanNode {
    HuffmanNode(String tag,int probability,String code){
        this.tag = tag;
        this.code = code;
        this.probability = probability;
        this.left=null;
        this.right=null;
    }
    private String tag;
    private int probability;
    private String code;
    private HuffmanNode right;
    private HuffmanNode left;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public int getProbability() {
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public HuffmanNode getRight() {
        return right;
    }

    public void setRight(HuffmanNode right) {
        this.right = right;
    }

    public HuffmanNode getLeft() {
        return left;
    }

    public void setLeft(HuffmanNode left) {
        this.left = left;
    }
}
