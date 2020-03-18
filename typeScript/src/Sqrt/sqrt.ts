
/**
 * returns a square root of the input number (integer -> integer)
 */
export function sqrt(input: number): number {
    let out: number = 0;
    if (input <= 0) {
        return out;
    }

    // let out: number = Math.sqrt(input);
    // return Math.floor(out);
    
    while (out*out <= input) {
        out++;
    }
    return out - 1;
}