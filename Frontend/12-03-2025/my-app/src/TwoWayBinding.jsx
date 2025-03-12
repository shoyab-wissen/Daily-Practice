import { useEffect, useRef, useState } from "react"

export function TwoWayBinding(){
    const [name, setName] = useState("")
    const refElement = useRef("")
    function clearFeild(){
        refElement.current.value = ""
        refElement.current.focus()
    }
    useEffect(()=>{
        refElement.current.focus()
    })
    return (
        <>
            <input ref={refElement} type="text" placeholder="Enter your name" value={name} onChange={(e) => setName(e.target.value)}/>
            <h2>Welcome to the world of React Mr./Ms. {name}</h2>
            <button onClick={clearFeild}>Clear Field</button>
        </>
    )
} 