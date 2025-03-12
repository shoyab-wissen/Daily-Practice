function add(a, b) {
    if (a === void 0) { a = 0; }
    if (b === void 0) { b = 0; }
    console.log("Adding two numbers:", a + b);
}
add(5, 3); // Outputs: Adding two numbers: 8
add(); // Outputs: Adding two numbers: 0
add(7); // Outputs: Adding two numbers: 7
var Person = /** @class */ (function () {
    function Person(name) {
        var _this = this;
        console.log("Start of constructor");
        this.name = name;
        // setTimeout(function(){
        //     console.log("Hello, my name is", this.name);
        // }, 1000);
        setTimeout(function () {
            console.log("Hello, my name is", _this.name);
        }, 1000);
        console.log("End of constructor");
    }
    return Person;
}());
var person = new Person("Shoyab Siddique");
console.log("This statement is not waiting for anyone");
