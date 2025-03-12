function add(a: number = 0, b: number = 0) {
    console.log("Adding two numbers:", a + b);
}

add(5, 3); // Outputs: Adding two numbers: 8

add(); // Outputs: Adding two numbers: 0

add(7); // Outputs: Adding two numbers: 7

class Person{
    name: string;

    constructor(name: string){
        console.log("Start of constructor");
        
        this.name = name;
        // setTimeout(function(){
        //     console.log("Hello, my name is", this.name);
        // }, 1000);

        setTimeout(() => {
            console.log("Hello, my name is", this.name);
        }, 1000);
        
        console.log("End of constructor");
    }
}

const person = new Person("Shoyab Siddique");
console.log("This statement is not waiting for anyone");
