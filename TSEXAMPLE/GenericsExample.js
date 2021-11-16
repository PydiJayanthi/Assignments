function getArray(items) {
    return new Array().concat(items);
}
var myNumArr = getArray([100, 200, 300]);
var myStrArr = getArray(["hello", "world"]);
myNumArr.push(400); //ok
myStrArr.push("hello typescript"); //ok
myNumArr.push("hi"); //ok
myStrArr.push(500); //ok
console.log(myNumArr); //[100,200,300,400,"hi"]
console.log(myStrArr); //["hello","world","hello typescript",500]
