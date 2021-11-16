import {Employee} from './Employee'

class Manager extends Employee{
    constructor(eid:number,eName:string,esal:number)
    {
        super(eid,eName,esal);
    }
}

var m=new Manager(123,"dfdf",23434);
m.display();