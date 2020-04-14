import { removeDupsFromSortedList } from "../src/RemoveDupsFromSortedList/RemoveDupsFromSortedList"
import { expect } from "chai"

let actual: number[];
let expected: number[];

describe ("testing remove dups from sorted list", () => {
	it ("1, 2, 3, 3", () => {
		actual = removeDupsFromSortedList([1, 2, 3, 3]);
		expected = [1, 2, 3]
	});
})