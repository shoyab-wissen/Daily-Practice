var increment = function incr(){
    a = 0;
    var plus = function(){
        a++;
        console.log(a);
    }
    return plus;
}()

increment();
increment();
increment();
increment();
increment();