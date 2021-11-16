var proArry=[
    { price:"100", product:"mobile"},
    { price:"245", product:"tab"},
    { price:"654", product:"laptop"},
    { price:"564", product:"mic"},

];

var newPro=proArry.map(function(value){
    return value.price;
})

console.log(newPro);
//with arrow function
var newPro1=proArry.map(value=>value.price);
console.log(newPro1);

//filter example
var filterEx=proArry.filter(function(value){
    if(value.price < 300){
        return true;
    }
})
console.log(filterEx);

//with arrow function
const arrowValue=proArry.filter(value=>value.price>300);
console.log(arrowValue);

//sort exapmle
const sortProduct=proArry.sort((a,b)=>(a.product>b.product?1:-1));
console.log(sortProduct);