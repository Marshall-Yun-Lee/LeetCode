import unittest
import MergeSortedLists
import sys


class MyTestCase(unittest.TestCase):
    def test_merge(self):
        l1 = MergeSortedLists.ListNode(1, MergeSortedLists.ListNode(2, MergeSortedLists.ListNode(4)))
        l2 = MergeSortedLists.ListNode(1, MergeSortedLists.ListNode(2, MergeSortedLists.ListNode(3)))
        expected = MergeSortedLists.ListNode(1, MergeSortedLists.ListNode(1, MergeSortedLists.ListNode(2,
                                                                                                       MergeSortedLists.ListNode(
                                                                                                           2,
                                                                                                           MergeSortedLists.ListNode(
                                                                                                               3,
                                                                                                               MergeSortedLists.ListNode(
                                                                                                                   4))))))
        actual = MergeSortedLists.merge(l1, l2)

        out1 = "actual  : "
        out2 = "expected: "
        initial = True
        isFail = False
        while actual is not None and expected is not None:
            if initial:
                out1 += str(actual.val)
                out2 += str(expected.val)
                initial = False
            else:
                out1 += " -> " + str(actual.val)
                out2 += " -> " + str(expected.val)

            try:
                self.assertEqual(actual.val, expected.val)
            except AssertionError:
                print(str(actual.val) + " != " + str(expected.val))
                out1 += '!'
                out2 += '!'
                isFail = True

            actual = actual.next
            expected = expected.next

        print(out1)
        print(out2)
        if isFail:
            raise AssertionError()

if __name__ == '__main__':
    unittest.main()
