import {Car} from './Car';
class Truck extends Car{

    weight:number;

    constructor(speed:number,regularPrice:number,color:string){
        super(speed,regularPrice,color);
    }

   /* getSalePrice(weight:number){
        if(Math.max(weight,5889)){
            this.SalePrice=this.regularPrice-(10/100*this.regularPrice);
        }

        else{
            this.SalePrice=this.regularPrice-(20/100*this.regularPrice);
        }*/
    }
