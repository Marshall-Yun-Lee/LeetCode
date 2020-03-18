import { sqrt } from "../src/Sqrt/sqrt";
import { expect } from "chai";

let actual: number = 0;
let expected: number = 0;

describe ("validate sqrt functionalities", () => {
    it ("sqrt(4) = 2", () => {
        actual = sqrt(4);
        expected = 2;
        expect(actual).to.eql(expected);
    });

    it ("sqrt(2) = 1", () => {
        actual = sqrt(2);
        expected = 1;
        expect(actual).to.eql(expected);
    });

    it ("sqrt(10000) = 100", () => {
        actual = sqrt(10000);
        expected = 100;
        expect(actual).to.eql(expected);
    });

    it ("sqrt(8) = 2", () => {
        actual = sqrt(8);
        expected = 2;
        expect(actual).to.eql(expected);
    });

    it ("sqrt(0) = 0", () => {
        actual = sqrt(0);
        expected = 0;
        expect(actual).to.eql(expected);
    });
});