import { useState } from 'react';
import Card from './Card'

function App() {
  const [formData, setFormData] = useState({ veiculo: '', placa: '' });
  const [carros, setCarros] = useState([]);

  const handleSubmit = (event) => {
    event.preventDefault();
    // const newMulta = Boolean(Math.round(Math.random() < 0.5));

    // function valiMulta() {
    //   if (newMulta === true) {
    //     return "Possui Multa!";
    //   } else {
    //     return "Não Possui Multa!";
    //   }
    // };

    // var resMulta = valiMulta();
    // console.log(valiMulta());

    const valiPlaca = new RegExp('^(?=.*[a-z])(?=.*?[0-9]).{6,}$');
    var newVeiculo = formData.veiculo.trim();

    if (formData.veiculo === '' || formData.placa === '') {
      alert('Preencha todos os campos');
    } else if (formData.veiculo.length < 3) {
      alert('Username com menos de 3 caracteres');
    } else if (!valiPlaca.test(formData.placa)) {
      alert('Insira a placa corretamente')
    } else {
      setCarros([...carros, {
        // multa: resMulta,
        veiculo: newVeiculo,
        placa: formData.placa
      }]);
    }
  };

  return (
    <div>
      <h1>Consulta Placa</h1>
      <form onSubmit={handleSubmit}>
        <label>Veiculo
          <input value={formData.veiculo}
            onChange={(event) => setFormData({ ...formData, veiculo: event.target.value })}
            placeholder={'Ex.: Kadett'} />
        </label>

        <label>Placa
          <input value={formData.placa}
            onChange={(event) => setFormData({ ...formData, placa: event.target.value })}
            placeholder={'Ex.: abc1234'} />
        </label>

        <button type='submit' onClick={handleSubmit}>Consultar</button>
      </form>

      {/* <div>{JSON.stringify(carros)}</div> */}

      {
        carros.map((carro) => {
          return (
            <Card carro={carro} />
          )
        })
      }
    </div>
  )
}

export default App;