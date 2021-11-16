var Product = /** @class */ (function () {
    function Product(id, name, price) {
        this.ProID = id;
        this.ProName = name;
        this.ProPrice = price;
    }
    Product.prototype.display = function () {
        console.log(this.ProID);
        console.log(this.ProName);
        console.log(this.ProPrice);
    };
    return Product;
}());
var p1 = new Product(2334, "phone", 243545 + 680);
p1.display();
