"use strict";
exports.__esModule = true;
exports.Bank = void 0;
var Bank = /** @class */ (function () {
    function Bank(ano, aname, abal) {
        this.accNo = 123;
        this.accName = "jayanthi";
        this.accBal = 34568.67;
        this.accNo = ano;
        this.accName = aname;
        this.accBal = abal;
    }
    Bank.prototype.deposit = function (b) {
        this.accBal = this.accBal + b;
    };
    Bank.prototype.withdraw = function (c) {
        this.accBal = this.accBal - c;
    };
    Bank.prototype.display = function () {
        console.log(this.accNo);
        console.log(this.accName);
        console.log(this.accBal);
    };
    return Bank;
}());
exports.Bank = Bank;
var b1 = new Bank(2334, "kutti", 45967);
b1.display();
