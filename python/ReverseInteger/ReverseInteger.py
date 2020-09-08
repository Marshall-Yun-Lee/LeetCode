"""
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120 Output: 21 Note: Assume we are dealing with an environment which could only store integers within the
32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0
when the reversed integer overflows.
"""
from math import floor


def reverse(x: int) -> int:
    isNeg: bool = False
    out: int = 0
    temp: int = x
    if temp < 0:
        isNeg = True
        temp *= -1

    while temp > 0:
        out *= 10
        out += temp % 10
        temp = floor(temp / 10)

    if out > 2 ** 31 - 1 or out < -2 ** 31:
        return 0

    return out * -1 if isNeg else out
