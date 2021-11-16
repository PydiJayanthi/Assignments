export class Employee{
    empId:number=123;
    empName:string="jayanthi";
    empSal:number=345.67;

    constructor(eid:number,ename:string,esal:number){
        this.empId=eid;
        this.empName=ename;
        this.empSal=esal;
    }

    display(){
        console.log(this.empId);
        console.log(this.empName);
        console.log(this.empSal);
    }

}
var e1=new Employee(234,"kutti",459);
e1.display();