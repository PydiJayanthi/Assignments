"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
var Bank_1 = require("./Bank");
var SavingAcc = /** @class */ (function (_super) {
    __extends(SavingAcc, _super);
    function SavingAcc() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    return SavingAcc;
}(Bank_1.Bank));
var m = new SavingAcc(123, "dfdf", 23434);
m.display();
