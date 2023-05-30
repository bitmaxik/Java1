package day18;

public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value){
        this.value = value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public void setLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                "}";
    }
}
