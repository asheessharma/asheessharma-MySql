/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let res = [];
    arr.forEach((item,i)=>{
        if(fn(item,i)){
            res.push(item);
        }
    })
    return res;
};