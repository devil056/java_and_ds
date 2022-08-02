class ListNode{
    int val;
    ListNode(int x){
        val=x;
    }

    public static ListNode merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val>=l2.val){
            l2.next=merge(l1,l2.next);
        }
    }
}