import { useState } from 'react';

const App = () => {

  const [numero, setNumero] = useState(0);

  const [nomes, setNomes] = useState(["Maria", "Ana"]);

  const handleButton = () => {
    setNumero(numero + 1)
  };

  const addPessoa = () => {
    const temp = [...nomes];

    temp.push("Isabela");
    temp.unshift("Marta");

    setNomes(temp);
  }

  return (
    <div>
      <h1>{numero}</h1>
      <ul>
        {
          nomes.map((nome) => (
            <li>{nome}</li>
          ))
        }
      </ul>
      <button onClick={handleButton}>Aperte</button>
      <button onClick={addPessoa}>Pressione</button>
    </div>
  )
};

export default App
