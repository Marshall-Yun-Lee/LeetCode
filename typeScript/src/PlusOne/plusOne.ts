/**
 * @param {number[]} digits
 * @return {number[]}
 */
export const plusOne = (digits: number[]): number[] => {
    for (let i: number = digits.length - 1; i >= 0; i--) {
        if(digits[i] === 9) {
            digits[i] = 0;
        } else {
            digits[i]++;
            return digits;
        }
    }
    return [1, ...digits];  // not returned => all elems are 0. adding 1 in front
}
