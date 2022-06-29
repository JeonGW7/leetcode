# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        tmp = head
        cnt = 0
        while tmp:
            tmp=tmp.next
            cnt+=1
        m=cnt//2
        for i in range(m):
            head=head.next
            
        return head