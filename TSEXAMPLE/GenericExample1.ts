function getArray12<T>(items : T[]) : T[]{
    return new Array<T>().concat(items);

}

let myNumArr12=getArray12<number>([100,200,300]);
let myStrArr12=getArray12<string>(["hello","world"]);

myNumArr12.push(400);//ok
myStrArr12.push("hello typescript");//ok

myNumArr12.push("hi");//compile error
myStrArr12.push(400);//compile error

console.log(myNumArr12);
console.log(myStrArr12);