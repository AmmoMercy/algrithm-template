/**
 * @program: algrithm-template
 * @description: A basic Trie class, only lowercase is considered in this application.
 * @author: Kiki
 * @create: 2022-07-07 11:15
 * @location: Fuzhou University
 **/
public class Trie {
    Node head;

    Trie() {
        head = new Node();
    }

    private class Node {
        // is the end of Trie
        boolean isLeaf = true;
        //next of current node
        Node[] nexts = new Node[26];


    }

    Node longestPrefix(String s) {
        Node p = head;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (p.nexts[c - 'a'] == null) {
                break;
            }
            p = p.nexts[c - 'a'];
        }
        return p;
    }

    void addWord(String s) {
        Node p = head;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (p.nexts[c - 'a'] == null) {
                p.isLeaf = false;
                p.nexts[c - 'a'] = new Node();

            }
            p = p.nexts[c - 'a'];
        }

    }

}
