import { useState } from "react"

const App = () => {
  const [formData, setFormData] = useState({nome: "", conteudo: ""});
  const [errorFormData, setErrorFormData] = useState({errorNome: "", errorConteudo: ""})

  function onSubmit(event){
    event.preventDefault();

    if (!formData.nome.trim()){
      setErrorFormData({
        ...errorFormData,
        errorNome: "Campo nao pode ficar vazio"
      });
    }
    setErrorFormData({});
  }

  const [numero, setNumero] = useState(0);

  const Mais = () => {
    setNumero(numero + 1);
  };

  const Menos = () => {
    setNumero(numero - 1);
  };

  return (
    <div>
      <h1>Numero Atual: {numero}</h1>

      <button onClick={Mais}>Mais</button>
      <button onClick={Menos}>Menos</button>

      <h1>Formulario de cadastro</h1>
      {formData.nome ? <h2>Nome: {formData.nome}</h2> : null}
      {formData.conteudo ? (<h2>Conteudo: {formData.conteudo}</h2>) : (<span>Esperando usuario selecionar...</span>)}

      <form onSubmit={onSubmit}
      className={formData.conteudo ? "wrapper-form" : "wrapper-no-content"}
      style={formData.conteudo ? {background: "red"} : {}}>
        <input value={formData.nome}
        onChange={(event) => setFormData({...formData, nome: event.target.value})} />
        <p>{errorFormData.errorNome}</p>

        <select value={formData.conteudo}
        onChange={(event) => setFormData({...formData, conteudo: event.target.value})}>
          <option value="frontend">Front-end</option>
          <option value="backend">Back-end</option>
          <option value="ux-ui">UX/UI</option>
        </select>

        <input type="submit" />
      </form>
    </div>
  )
};
export default App