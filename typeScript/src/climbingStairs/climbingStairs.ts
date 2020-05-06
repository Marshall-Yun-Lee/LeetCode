export const climbingStairs = (input: number): number => {
    if (input === 1) {
        return 1;
    }
    if (input === 2) {
        return 2;
    }

    let one: number = 1;
    let two: number = 2;
    for (let i: number = 3; i <= input; i--) {
        let temp: number = two;
        two = one + two;
        one = temp;
    }
    return two;
    // let memorize: number[] = [];
    // const counter = (remains: number, saved: number[]) => {
    //     if (remains < 0 || remains === null) {
    //         return 0;
    //     } else if (remains === 0) {
    //         return 1;
    //     }

    //     if (saved[remains]) {
    //         return saved[remains];
    //     }
    //     saved[remains] =
    //         counter(remains - 1, saved) + counter(remains - 2, saved);

    //     return saved[remains];
    // };
    // return counter(input, memorize);
};
