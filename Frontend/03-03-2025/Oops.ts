class Employee{
    name: string;
    age: number;
    constructor(name: string, age: number){
        this.name = name;
        this.age = age;
    }
    display(){
        console.log(`Name: ${this.name}, Age: ${this.age}`);
    }    
}

class Clerk extends Employee{
    salary: number;
    designation: string;
    constructor(name: string, age: number, salary: number, designation: string){
        super(name, age);
        this.salary = salary;
        this.designation = designation;
    }
}

var e1 = new Employee("John Doe", 30);
var e2 = new Employee("Shoyab", 22);
e1.display();

interface Car{
    speed:number;
    accelerate(): void;
    brake(): void;
}

class Toyota implements Car{
    speed: number = 0;
    accelerate(): void {
        this.speed += 5;
        console.log(`Toyota is accelerating at speed ${this.speed}`);
    }
    brake(): void {
        this.speed -= 5;
        console.log(`Toyota is braking at speed ${this.speed}`);
    }
}