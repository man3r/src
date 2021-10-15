package com.greatlearning.main.tree;

import java.util.List;
import java.util.ArrayList;

public class LeastCommonAncestor {
	Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int value) {
			data = value;
			left = right = null;
		}
	}

	public int findLCA(int node1, int node2) {
		List path1 = new ArrayList();
		if (!findPath(root, node1, path1)) {
			System.out.println("node1 is not present");
			return -1;
		}

		List path2 = new ArrayList();
		if (!findPath(root, node2, path2)) {
			System.out.println("node2 is not present");
			return -1;
		}

		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {
			if (!path1.get(i).equals(path2.get(i))) {
				break;
			}
		}

		return (int) path1.get(i - 1);
	}

	private boolean findPath(Node root, int n, List path) {
		if (root == null) { // dead end
			return false;
		}

		// assume the current root is on the path to n - we add it
		path.add(root.data);

		if (root.data == n) {
			return true;
		}

		if (findPath(root.left, n, path)) {
			return true;
		}

		if (findPath(root.right, n, path)) {
			return true;
		}

		path.remove(path.size() - 1);

		return false;
	}
}
