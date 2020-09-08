"""
Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4
       1->3->4
Output: 1->1->2->3->4->4
"""


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


def merge(l1: ListNode, l2: ListNode) -> ListNode:
    temp = ListNode()
    curr = temp

    while l1 and l2:
        if l1.val < l2.val:
            curr.next = l1
            l1 = l1.next
        else:
            curr.next = l2
            l2 = l2.next
        curr = curr.next

    if l1:
        curr.next = l1
    elif l2:
        curr.next = l2

    return temp.next
