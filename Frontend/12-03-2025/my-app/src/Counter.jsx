import { useState } from "react";

export function Counter(){
    const [count, setCount] = useState(0);
    return (
        <>
            <h2>Counter Value: {count}</h2>
            <button onClick={() => setCount(count + 1)}>Increase</button>
            <button onClick={() => setCount(count - 1)}>Decrease</button>
        </>
    )
}