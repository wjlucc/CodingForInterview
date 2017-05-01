package code;


// 一个任意链表的节点，一个节点指向后续节点，一个指向兄弟节点。
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}