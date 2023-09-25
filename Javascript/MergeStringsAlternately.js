

console.log(mergeAlternately('abc', 'dfghhh'))


function mergeAlternately(a, b) {

    let merged = ""
    let i = 0
    while (true) {
        // ab cd 
        merged += a[i] + b[i];
        if (i >= a.length - 1) {
            merged += b.substring(i + 1, b.length);
            break;
        }
        if (i >= b.length - 1) {
            merged += a.substring(i + 1, a.length);
            break;
        }
        i++;

    }

    return merged;

}