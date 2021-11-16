export class Bank{
    accNo:number=123;
    accName:string="jayanthi";
    accBal:number=34568.67;

    constructor(ano:number,aname:string,abal:number){
        this.accNo=ano;
        this.accName=aname;
        this.accBal=abal;
    }

    deposit(b: number){
        this.accBal=this.accBal+b;

    }

    withdraw(c:number){
        this.accBal=this.accBal-c;
    }

    display(){
        console.log(this.accNo);
        console.log(this.accName);
        console.log(this.accBal);
    }

}
var b1=new Bank(2334,"kutti",45967);
b1.display();