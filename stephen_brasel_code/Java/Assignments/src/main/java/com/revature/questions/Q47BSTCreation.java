package com.revature.questions;

class Node {
	int value;
	Node left = null;
	Node right = null;

	Node(int value){
		this.value = value;
	}
}
class BinaryTree {

	private Node root;
	private int maxDepth;
	private int size;

	public int maxDepth(){return maxDepth;}
	public int size(){return size;}

	private Node addRecursive(Node current, int value, int depth){
		if(current == null){
			if(depth>maxDepth)maxDepth=depth;
			size++;
			return new Node(value);
		}

		if(value < current.value){
			current.left = addRecursive(current.left, value, depth+1);
		} else if(value > current.value){
			current.right = addRecursive(current.right, value, depth+1);
		} else {
			// value already exists, store only unique elements
			return current;
		}

		return current;
	}

	public void add(int value){
		root = addRecursive(root,value, 0);
	}

	private String inOrderString(Node current, String ret){
		if(current == null) return "";
		ret += inOrderString(current.left, ret);
		ret += Integer.toString(current.value) + ", ";
		return ret + inOrderString(current.right, "");
	}

	@Override
	public String toString() {
		String elems = inOrderString(root,"");
		return "BinaryTree{" +
				elems.substring(0, Math.max(elems.length()-2, 0)) +
				'}';
	}
}

public class Q47BSTCreation {
	public BinaryTree bt = new BinaryTree();

	public BinaryTree createBinaryTree(int[] ar){
		bt = new BinaryTree();
		binaryTreeCreator(ar, 0, ar.length-1);
		return bt;
	}

	public void binaryTreeCreator(int[] ar, int min, int max){
		if(min > max || max < 0 || min < 0 || max >= ar.length || min >= ar.length) return;
		int mid = min + (max - min)/2;
		bt.add(ar[mid]);
		if(max-min > 1) {
			binaryTreeCreator(ar, min, mid - 1);
			binaryTreeCreator(ar, mid + 1, max);
		}
	}
}
