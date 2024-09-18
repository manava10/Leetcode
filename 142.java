/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //TorToise HARE method
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp;
        ListNode temp1=head;
        if(head==null){
            return null;
        }
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                temp = fast;
                while(temp!=temp1){
                    temp=temp.next;
                    temp1=temp1.next;
                }
                return temp;
            }
        }
        return null;
        //HashMap<ListNode,Integer> mapLL = new HashMap<>();
        //if(head==null){
        //    return null;
        //}
        //ListNode temp = head;
        //int count = 0;
        //while(temp!=null){
        //    if(mapLL.containsKey(temp)){
        //        return temp;
        //    }
        //   mapLL.put(temp,count);
        //    count = count +1;
        //    temp = temp.next;
        //}
        //return null; 
    }
}
