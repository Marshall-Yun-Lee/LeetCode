import { climbingStairs } from "../src/climbingStairs/climbingStairs"
import { expect } from "chai"

let actual: number;
let expected: number;

describe("test climbingStairs", () => {
    it("0", () => {
        actual = climbingStairs(0);
        expected = 0;
        expect(actual).to.eql(expected);
        // n/a
    });

    it("1", () => {
        actual = climbingStairs(1);
        expected = 1;
        expect(actual).to.eql(expect);
        // 1
    });

    it("2", () => {
        actual = climbingStairs(2);
        expected = 2;
        expect(actual).to.eql(expect);
        // 1 + 1 or 2
    });

    it ("3", () => {
        actual = climbingStairs(3);
        expected = 3;
        expect(actual).to.eql(expect);
        // 1 + 1 + 1 or 1 + 2 or 2 + 1
    });

    it ("4", () => {
        actual = climbingStairs(4);
        expected = 3;
        expect(actual).to.eql(expect);
        // 1 + 1 + 1 + 1 or 1 + 1 + 2 or 2 + 2
    });
});