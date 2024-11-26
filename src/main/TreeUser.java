package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
    	bt.find(Relative.Root);
    	
  //      throw new UnsupportedOperationException("Not supported yet.");
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.java
        return countLeavesHelper(bt);
    }
    
    
    public static <T> int countLeavesHelper(BT<T> bt) {
       
        if (bt.isLeaf()) {
            return 1;
        }
        int count = 0;

        if (bt.find(Relative.LeftChild)) {
        	count += countLeavesHelper(bt);
            bt.find(Relative.Parent); 
        }

        if (bt.find(Relative.RightChild)) {
        	count += countLeavesHelper(bt); 
            bt.find(Relative.Parent); 
        }
        return count;
    }
    	
    
    
}