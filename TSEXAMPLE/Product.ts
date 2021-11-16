class Product {
	
	ProID:number;
    ProName:string;
	ProPrice:number;
	constructor(id:number,name:string,price:number)
	{
		this.ProID=id;
		this.ProName=name;
		this.ProPrice=price;
	}
	display() {
		
	console.log(this.ProID);
    console.log(this.ProName);
    console.log(this.ProPrice);
	}
}
		var p1=new Product(2334,"phone",243545+680);
		p1.display();
