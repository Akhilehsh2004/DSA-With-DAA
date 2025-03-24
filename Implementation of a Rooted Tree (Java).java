import java.util.*;

class TreeNode {
    String data;
    List<TreeNode> children;

    TreeNode(String data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    void addChild(TreeNode child) {
        children.add(child);
    }
}

public class RootedTreeExample {
    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        TreeNode nodeD = new TreeNode("D");

        root.addChild(nodeB);
        root.addChild(nodeC);
        root.addChild(nodeD);

        nodeB.addChild(new TreeNode("E"));
        nodeB.addChild(new TreeNode("F"));
        nodeC.addChild(new TreeNode("G"));
        nodeC.addChild(new TreeNode("H"));
        nodeD.addChild(new TreeNode("I"));
        nodeD.addChild(new TreeNode("J"));

        System.out.println("Rooted Tree Created Successfully!");
    }
}
