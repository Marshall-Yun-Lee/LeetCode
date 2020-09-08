import unittest
import ReverseInteger


class MyTestCase(unittest.TestCase):
    def test_reverse(self):
        self.assertEqual(ReverseInteger.reverse(123), 321)
        self.assertEqual(ReverseInteger.reverse(-123), -321)
        self.assertEqual(ReverseInteger.reverse(0), 0)
        self.assertEqual(ReverseInteger.reverse(12312312311424123123149), 0)
        self.assertEqual(ReverseInteger.reverse(-1231212313123123123149), 0)
        self.assertEqual(ReverseInteger.reverse(1), 1)
        self.assertEqual(ReverseInteger.reverse(100), 1)
        self.assertEqual(ReverseInteger.reverse(-100), -1)
        self.assertEqual(ReverseInteger.reverse(101), 101)
        self.assertEqual(ReverseInteger.reverse(-101), -101)
        self.assertEqual(ReverseInteger.reverse(22), 22)
        self.assertEqual(ReverseInteger.reverse(-22), -22)
        self.assertEqual(ReverseInteger.reverse(-0), 0)


if __name__ == '__main__':
    unittest.main()
