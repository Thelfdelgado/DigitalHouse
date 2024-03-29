import { useState } from "react";
import "./styles.css";

function App() {
  function handleSubmit(event) {
    event.preventDefault();
  }

  const [formData, setFormData] = useState({aluno: 0, media: 0})

  const Aluno = () => {
    setFormData(formData.aluno + 1);
  };

  return (
    <div className="container">
      <h1>Média de Alunos por Disciplina</h1>
      <form className="form" onSubmit={handleSubmit}>
        <div className="container_input">
          <select>
            <option selected disabled>
              Selecione uma disciplina
            </option>
            <option value="database">Banco de Dados</option>
            <option value="backend">Desenvolvimento Backend</option>
            <option value="frontend">Desenvolvimento Frontend</option>
            <option value="devops">Devops</option>
          </select>
          <input />
        </div>
        <input onClick={Aluno} type="submit" value="Salvar" />
      </form>

      <div className="container">
        <table border="1" className="line_title">
          <thead>
            <tr>
              <th>Disciplina</th>
              <th>Quantidade de Alunos</th>
              <th>Média das notas dos alunos</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>Banco de Dados</td>
              <td>{formData.aluno}</td>
              <td>0</td>
            </tr>

            <tr>
              <td>Desenvolvimento Frontend</td>
              <td>{formData.aluno}</td>
              <td>0</td>
            </tr>

            <tr>
              <td>Desenolvimento Backend</td>
              <td>{formData.aluno}</td>
              <td>0</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default App