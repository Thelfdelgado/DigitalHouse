import Card from './Card';

function App() {
  return (
    <div className='App'>
      <h1>Cadastre-se</h1>
      <form>
        <label>
          Nome:
          <input type="text" />
        </label>
      </form>
      <Card />
    </div>
  );
};

export default App;