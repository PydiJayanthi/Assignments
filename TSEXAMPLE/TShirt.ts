class TShirt {

	Color:string;
	Material:string;
	Design:string;
	constructor(color:string,material:string,design:string)
	{
		this.Color=color;
		this.Material=material;
		this.Design=design;
	}
	display() {
		
	console.log(this.Color);
    console.log(this.Material);
    console.log(this.Design);
	}
	
}
		var t1=new TShirt("blue","small","chudi");
		t1.display();
		var t2=new TShirt("green","large","longfrock");
		t2.display();
		var t3=new TShirt("red","Xtra-large","top");
		t3.display();
