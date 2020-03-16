import { plusOne } from "../src/PlusOne/plusOne";
import { expect } from "chai";
// if you used the '@types/mocha' method to install mocha type definitions, uncomment the following line
// import 'mocha';

describe("Test Plus One", () => {
    // basic number manipulations
    it ("plusOne([4, 3, 2, 1]) should be [4, 3, 2, 2]", () => {
        const actual:   number[] = plusOne([4, 3, 2, 1]);
        const expected: number[] = [4, 3, 2, 2];
        expect(actual).to.eql(expected);
    });

    it ("plusOne([1, 2, 3]) should be [1, 2, 4]", () => {
        const actual:   number[] = plusOne([1, 2, 3]);
        const expected: number[] = [1, 2, 4];
        expect(actual).to.eql(expected);
    });

    it ("plusOne([1, 1]) should be [1, 2]", () => {
        const actual:   number[] = plusOne([1, 1]);
        const expected: number[] = [1, 2];
        expect(actual).to.eql(expected);
    });

    it ("plusOne([1]) should be [2]", () => {
        const actual:   number[] = plusOne([1]);
        const expected: number[] = [2];
        expect(actual).to.eql(expected);
    });
    
    it ("plusOne([0]) should be [1]", () => {
        const actual:   number[] = plusOne([0]);
        const expected: number[] = [1];
        expect(actual).to.eql(expected);
    });

    // edge cases: adding another place
    it ("plusOne([9]) should be [1, 0]", () => {
        const actual:   number[] = plusOne([9]);
        const expected: number[] = [1, 0];
        expect(actual).to.eql(expected);
    });

    it ("plusOne([1, 9]) should be [2, 0]", () => {
        const actual:   number[] = plusOne([1, 9]);
        const expected: number[] = [2, 0];
        expect(actual).to.eql(expected);
    });

    it ("plusOne([9, 9, 9]) should be [1, 0, 0, 0]", () => {
        const actual:   number[] = plusOne([9, 9, 9]);
        const expected: number[] = [1, 0, 0, 0];
        expect(actual).to.eql(expected);
    });
});