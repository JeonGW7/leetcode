# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        tmp = ListNode()
        tmp.next = head
        
        now = head
        prev = tmp
        
        while now != None:
            #중복이 있을때
            if now.next != None and now.val == now.next.val:
                tmp2 = now.next
                #중복이 여러개일 경우
                while tmp2 != None and tmp2.val == now.val:
                    tmp2 = tmp2.next
                prev.next = tmp2
                now = tmp2
            #중복이 없을때 - 한칸씩 땡김
            else:
                prev = now
                now = now.next
        return tmp.next