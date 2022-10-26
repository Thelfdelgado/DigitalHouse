import Container from "./Container"
import Text from "./texto"
import ListaCompras from "./ListaCompras"

function App() {
  return (
    <>
      <Text txt="Hello World"/>

      <Container>
        <img width={80} src='https://cdn1.iconfinder.com/data/icons/programing-development-8/24/react_logo-512.png'></img>
        <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Velit qui amet rem minus, quasi doloribus similique veritatis ratione excepturi blanditiis!</p>
      </Container>

      <ListaCompras/>
    </>
  )
}

export default App
