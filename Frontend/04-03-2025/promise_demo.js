let s1 = "wissen";
let s2 = "Technology";

let promise = new Promise(function(resolve, reject){
    if(s1+s2 == "wissenTechnology"){
        resolve();
    }else{
        reject();
    }
})

promise.then(() => console.log("Both strings are equal")).catch(() => console.log("Strings are not equal"));