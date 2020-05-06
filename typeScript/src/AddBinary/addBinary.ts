export function addBinary(first: string, second: string): string {
    let out: string = "";
    let i: number = first.length - 1;
    let j: number = second.length - 1;
    let extra: number = 0;
    while (i >= 0 || j >= 0 || extra > 0) {
        // add up as if regular integers
        extra += i >= 0 ? parseInt(first.charAt(i--)) : 0;
        extra += j >= 0 ? parseInt(second.charAt(j--)) : 0;

        // convert extras to binary
        out = String(extra % 2) + out;
        extra = Math.floor(extra / 2); // TypeScript does not have integer type -- only number!! -- so flooring any decimal places (in case that extra === 1)
    }
    return out;
}
