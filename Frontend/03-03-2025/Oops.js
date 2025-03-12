var Employee = /** @class */ (function () {
    function Employee(name, age) {
        this.name = name;
        this.age = age;
    }
    Employee.prototype.display = function () {
        console.log("Name: ".concat(this.name, ", Age: ").concat(this.age));
    };
    return Employee;
}());
var e1 = new Employee("John Doe", 30);
var e2 = new Employee(22, "Shoyab");
e1.display();
