import { useRef, useState } from "react";

const App = () => {

  // const inputRef = useRef(null);

  const [nomes, setNomes] = useState([]);

  const [valueInput, setInputValue] = useState("");

  const [errorInput, setErrorInput] = useState("");

  const [isChecked, setIsChecked] = useState(false);

  function handleSubmit(event) {

    if (valueInput.trim()) {
      setNomes([...nomes, valueInput]);
      setErrorInput("");
      setInputValue("")
    } else {
      setErrorInput("Digite um nome no campo");
    }
    event.preventDefault();
    // alert(inputRef.current.value);
  }

  return (
    <div style={isChecked ? { background: "green" } : {}}>
      <h1>{isChecked.toString()}</h1>
      <ul>
        {nomes.map((item)=><li>{item}</li>)}
      </ul>
      <form onSubmit={handleSubmit}>
        {/* <input ref={inputRef}/> */}
        <input value={valueInput} onChange={(event) => setInputValue(event.target.value)} />
        <label> Pressionado
          <input value={isChecked} type="checkbox" onChange={(event) => setIsChecked(event.target.checked)} />
        </label>
        <p>{errorInput}</p>
        {isChecked ? <input type="submit" /> : null}
      </form>
    </div>
  )
}

export default App
