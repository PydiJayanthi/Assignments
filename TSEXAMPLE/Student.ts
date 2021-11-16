class Student
{
	StdId:number;
	StdName:string;
	StdCls:number;
	constructor(id:number,name:string,cls:number)
	{
		this.StdId=id;
		this.StdName=name;
		this.StdCls=cls;
	}
display()
{
	console.log(this.StdId);
    console.log(this.StdName);
    console.log(this.StdCls);
	}
}
	
var e1=new Student(234,"kutti",459);
var e2=new Student(22,"jayanthi",097);
e1.display();
e2.display();
