class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode(0)
        cur = dummy
        carry = 0
        while l1 or l2:
            num1 = l1.val if l1 else 0
            num2 = l2.val if l2 else 0
            sum = num1 + num2 + carry
            
            carry = sum // 10
            cur.next = ListNode(sum%10)
            cur = cur.next
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        if carry:
            cur.next = ListNode(carry)
        return dummy.next

sol=Solution()
l1 = ListNode(1)
l11 = ListNode(1)
l111 = ListNode(1)
l2 = ListNode(2)
l22 = ListNode(2)

l1.next = l11
l1.next.next = l111
l2.next = l22

result = sol.addTwoNumbers(l1, l2)

while result is not None:
    print(result.val)
    result = result.next
