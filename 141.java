public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> map=new HashSet<ListNode>();
        ListNode cur=head;
        while(cur!=null){
            if(map.contains(cur)){
                return true;
            }
            map.add(cur);
            cur=cur.next;
        }
        return false;
    }
}

//Brute Force Solution .
