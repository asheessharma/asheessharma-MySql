/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
   const cache = {};

    return function(...args) {
        const key = JSON.stringify(args);

        if (cache[key] !== undefined) {
            return cache[key];
        }

        const result = fn(...args);
        cache[key] = result;
        return result;
    };
}
function sum(a, b) {
    return a + b;
}

function fib(n) {
    if (n <= 1) return 1;
    return fib(n - 1) + fib(n - 2);
}
function factorial(n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}
const memoizedSum = memoize(sum);
const memoizedFib = memoize(fib);
const memoizedFactorial = memoize(factorial);

/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */