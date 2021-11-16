function getArray12(items) {
    return new Array().concat(items);
}
var myNumArr12 = getArray12([100, 200, 300]);
var myStrArr12 = getArray12(["hello", "world"]);
myNumArr12.push(400); //ok
myStrArr12.push("hello typescript"); //ok
myNumArr12.push("hi"); //compile error
myStrArr12.push(400); //compile error
console.log(myNumArr12);
console.log(myStrArr12);
