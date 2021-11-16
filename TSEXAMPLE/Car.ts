export class Car {

    speed:number;
    regularPrice:number;
    color:string; 

constructor(sp:number,rprice:number,col:string){
   this.speed=sp;
   this.regularPrice=rprice;
   this.color=col;
   
}
getSalePrice()
{
   console.log(this.regularPrice);
}
display()
{
   
   console.log(this.speed);
   console.log(this.regularPrice);
   console.log(this.color);
}

}


