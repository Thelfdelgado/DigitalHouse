import { useState } from 'react'

function App(){

  const [count, setCount] = useState(0);

  console.log("Executei a inicializacao");

  

  return (
    <div>
      {console.log("EXECUTEI A INICIALIZACAO DENTRO DO COMPONENTE")}
      <h1>{count}</h1>
    </div>
  )
}

export default App
