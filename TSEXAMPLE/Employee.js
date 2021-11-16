"use strict";
exports.__esModule = true;
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(eid, ename, esal) {
        this.empId = 123;
        this.empName = "jayanthi";
        this.empSal = 345.67;
        this.empId = eid;
        this.empName = ename;
        this.empSal = esal;
    }
    Employee.prototype.display = function () {
        console.log(this.empId);
        console.log(this.empName);
        console.log(this.empSal);
    };
    return Employee;
}());
exports.Employee = Employee;
var e1 = new Employee(234, "kutti", 459);
e1.display();
