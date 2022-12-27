public class BinaryTREE {

    Node temp;

    public BinaryTREE()
    {

    }
    public Node newNode(int data)
    {
        Node temp=new Node();
        temp.key=data;
        temp.left=temp.right=null;
        return temp;
    }
    public void inOrder(Node root)
    {
        if (root!=null)
        {
            inOrder(root.left);
            System.out.println(root.key+" ");
            inOrder(root.right);
        }
    }
    public Node ekle(Node node,int key)
    {
        if (node==null)
        {
            return newNode(key);
        }
        if (key< node.key)
            node.left=ekle(node.left,key);
        else
            node.right=ekle(node.right,key);
        return node;
    }
    public Node silme(Node root, int k)
    {
        if (root==null)
            return root;
        if (root.key>k)
        {
            root.left=silme(root.left,k);
            return root;
        }
        else if (root.key<k)
        {
            root.right=silme(root.right,k);
            return root;
        }
        if (root.left==null)
        {
            Node temp=root.right;
            return temp;
        }
        else if (root.right==null)
        {
            Node temp=root.left;
            return temp;
        }
        else
        {
            Node parent=root;
            Node succ=root.right;
            while (succ.left!=null)
            {
                parent=succ;
                succ=succ.left;
            }
            if (parent!=root)
            {
                parent.left=succ.right;
            }
            else
                parent.right=parent.right;
            root.key= succ.key;
            return root;
        }
    }
}
