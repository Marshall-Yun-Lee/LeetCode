import { addBinary } from "../src/AddBinary/addBinary"
import { expect } from "chai"

let actual: string = "";
let expected: string = "";

describe("validate addBinary() functionality", () => {
    it ("1 + 1 = 10", () => {
        actual = addBinary("1", "1");
        expected = "10";
        expect(actual).to.deep.equal(expected);
    });

    it ("10 + 1 = 11", () => {
        actual = addBinary("10", "1");
        expected = "11";
        expect(actual).to.equal(expected);
    });

    it ("11 + 1 = 100", () => {
        actual = addBinary("11", "1");
        expected = "100";
        expect(actual).to.eql(expected);
    });

    it ("1 + 11 = 100", () => {
        actual = addBinary("1", "11");
        expected = "100";
        expect(actual).to.eql(expected);
    });
    
    it ("1010 + 1011 = 10101", () => {
        actual = addBinary("1010", "1011");
        expected = "10101";
        expect(actual).to.eql(expected);
    });
});
