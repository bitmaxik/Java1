package day18;

public class Task3 {
    public static void main(String[] args) {
        Node rootNode = new Node(20);
        Tree tree = new Tree(rootNode);

        tree.addNode(14, rootNode);
        tree.addNode(11, rootNode);
        tree.addNode(5, rootNode);
        tree.addNode(8, rootNode);
        tree.addNode(16, rootNode);
        tree.addNode(15, rootNode);
        tree.addNode(18, rootNode);
        tree.addNode(23, rootNode);
        tree.addNode(22, rootNode);
        tree.addNode(24, rootNode);
        tree.addNode(27, rootNode);
        tree.addNode(150, rootNode);

        tree.dfs(rootNode);
    }
}