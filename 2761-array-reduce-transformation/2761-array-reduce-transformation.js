/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let result = init;
    nums.forEach((item,i)=>{
        result = fn(result,nums[i]);
    })
    return result;
};