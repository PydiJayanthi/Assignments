var Student = /** @class */ (function () {
    function Student(id, name, cls) {
        this.StdId = id;
        this.StdName = name;
        this.StdCls = cls;
    }
    Student.prototype.display = function () {
        console.log(this.StdId);
        console.log(this.StdName);
        console.log(this.StdCls);
    };
    return Student;
}());
var e1 = new Student(234, "kutti", 459);
var e2 = new Student(22, "jayanthi", 097);
e1.display();
e2.display();
