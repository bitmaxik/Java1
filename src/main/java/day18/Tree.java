package day18;

public class Tree {

    private Node rootNode;

    public Tree(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public void addNode(int newNodeInt, Node rootNode) {
        Node newNode = new Node(newNodeInt);
        Node currentNode = rootNode;   // начинаем с корневого узла
        Node parentNode;

        while (true) {
            parentNode = currentNode;                          // родитель равен текущему значению (в первом шаге цикла корню)
            if (newNodeInt == currentNode.getValue())          // если такой элемент уже есть, то не сохраняем
                return;                                        // и выходим из цикла
            else if (newNodeInt > currentNode.getValue()) {    // если новое значение больше текущего узла,
                currentNode = currentNode.getRightChild();     // то назначаем текущей нодой правого потомка (родительская нода parentNode осталась по иерархии выше)
                if (currentNode == null) {                     // если значение правого потомка (текущего узла) не определено,
                    parentNode.setRightChild(newNode);         // устанавливаем через родительский узел правого потомка с новым значением
                    return;                                    // и выходим из цикла
                }
            } else {
                if (newNodeInt < currentNode.getValue()) {     // если новое значение меньше текущего узла
                    currentNode = currentNode.getLeftChild();  // то назначаем текущей нодой левого потомка (родительская нода parentNode осталась по иерархии выше)
                    if (currentNode == null) {                 // если значение левого потомка не определено,
                        parentNode.setLeftChild(newNode);      // устанавливаем там через родительский узел левого потомка с новым значением
                        return;                                // и выходим из цикла
                    }
                }
            }
        }
    }

    public void dfs(Node rootNode){
        if(rootNode != null){
            dfs(rootNode.getLeftChild());
            System.out.print(rootNode.getValue() + " ");
            dfs(rootNode.getRightChild());
        }
    }
}
