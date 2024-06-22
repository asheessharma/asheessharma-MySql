/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let arr1 = [];
    arr.forEach((item,i)=>{
        arr1.push(fn(item,i));
    })
    return arr1;
};