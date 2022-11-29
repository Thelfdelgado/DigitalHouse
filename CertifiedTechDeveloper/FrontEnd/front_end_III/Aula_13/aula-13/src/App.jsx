import { useState, useEffect } from 'react'
import Box from './Box';

const pizzasBack = [{
  id: 1,
  nome: 'Portuguesa',
  preco: 49.9
},
{
  id: 2,
  nome: 'Frango',
  preco: 45.9
}];

function App() {
  const [pizzas, setPizzas] = useState([]);
  const [update, setUpdate] = useState(true)
  const [visibleList, setVisibleList] = useState(true);

  // useEffect(() => {
  //   setCount(count + 1);
  //   console.log("EXECUTEI APOS A MONTAGEM DO SEU COMPONENTE");
  // }, []);

  // useEffect(() => console.log("EXECUTIO O TESTE DO ARRAY DO USEEFFECT"), [visibleBox])

  useEffect(() => {
    setTimeout(() => {
      setPizzas(pizzasBack);
      setUpdate(false);
    }, 2000)
  }, [update]);

  function clearStorage(){
    localStorage.clear();
    alert('APAGOU OS DADOS DO USUARIO');
  }

  useEffect(()=> clearStorage(), visibleList)

  function updateList() {
    setUpdate(true)
  }

  return (
    <>
      {update ? <p>Carregando...</p> : null}

      <ul>
        {visibleList ? pizzas.map((pizza) => (
          <li>
            <p>{pizza.nome}</p>
            <p>{pizza.preco}</p>
            <br />
          </li>
        )) : null}
      </ul>
      <button onClick={updateList}>Atualizar Lista</button>
      <button onClick={() => setVisibleList(false)}>Destruir lista</button>
    </>
  )
}

export default App
