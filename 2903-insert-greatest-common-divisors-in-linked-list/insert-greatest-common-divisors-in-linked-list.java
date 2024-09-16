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

    public int  calcgcd(int a,int b){
        if(b==0){
            return a;
        }
        else{
            return  calcgcd(b,a%b);
        }

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head.next;
        ListNode prev=head;

        if(head.next==null){
            return head;
        }



        while(temp!=null){
            int a=prev.val;
            int b=temp.val;
            int data=calcgcd(b,a%b);
            ListNode newnode=new ListNode(data);
            newnode.next=temp;
            prev.next=newnode;

            prev=temp;
            temp=temp.next;

        }
        return head;
        
    }
}