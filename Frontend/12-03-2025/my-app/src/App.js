import { Counter } from "./Counter";
import { Greet } from "./Greet";
import { TwoWayBinding } from "./TwoWayBinding";

function App() {
  let a = 10;
  let b = 20;
  return (
  <>
    Hello From App Component
    <h2>Sum of a and b: {a + b}</h2> 
    {a > 10 ? <h3>A is greater than 10</h3> : <h3>A is less than 10</h3>}
    <Greet name="Shoyab" time="Morning"/>
    <Counter />
    <TwoWayBinding />
  </>
  );
}

export default App;
