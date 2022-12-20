package trie;

import java.util.HashMap;

public class trie {

	private class Node{
		char data;
		HashMap<Character, Node>children =new HashMap<>();
	}
	
	private Node root;
	public trie() {
		Node nn =new Node();
		nn.data='*';
		this.root =nn;
		
	}

}
