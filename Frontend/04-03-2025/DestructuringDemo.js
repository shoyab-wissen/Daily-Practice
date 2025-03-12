let emp1 = {
    name: "John Doe",
    age: 30,
    salary: 5000,
    designation: "Software Engineer"
}

let emp2 = ["Shoyab", 22, 4500, "Senior Software Engineer"]

let { name, age, salary, designation } = emp1

console.log(`Name: ${name}, Age: ${age}, Salary: ${salary}, Designation: ${designation}`)

let [name2, age2, salary2, designation2] = emp2

console.log(`Name: ${name2}, Age: ${age2}, Salary: ${salary2}, Designation: ${designation2}`)

// Deconstructing with default values

let { name: n, age: a, salary: s, designation: d = "Software Engineer" } = emp1

console.log(`Name: ${n}, Age: ${a}, Salary: ${s}, Designation: ${d}`)

let [n2 = "John Doe", a2 = 30, s2 = 5000, d2 = "Software Engineer"] = emp2