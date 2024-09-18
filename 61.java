/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ArrayList<Integer> newArray = new ArrayList<>();
        ListNode dummy = head;
        while(dummy!=null){
            newArray.add(dummy.val);
            dummy = dummy.next;
            
        }
        Integer[] tempArray = newArray.toArray(new Integer[0]);
        int[] newtempArray = new int[tempArray.length];
        int n = tempArray.length;
        for(int i=0;i<n;i++){
            newtempArray[(i+k)%n]=tempArray[i];
        }
        ListNode temp = head;
        ListNode ans = head;
        int index = 0;
        while(temp!=null){
            temp.val = newtempArray[index];
            temp = temp.next;
            index = index+1;
        }
        return ans;  
    }
}

// BRUTE FORCE APPROACH>
