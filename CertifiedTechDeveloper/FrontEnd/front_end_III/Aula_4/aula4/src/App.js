import Pessoa from "./Pessoa";

function App(){
  return (
    <div>
      <Pessoa nome="Luiz" idade={24} peso={75}/>
      <Pessoa nome="Ana" idade={17} peso={71}/>
      <Pessoa nome="Carlos" idade={40} peso={48}/>
      <Pessoa nome="Maria" idade={16} peso={59}/>
    </div>
  )
}

export default App;
