import styles from './styles.module.css';
import ItemList from "./components/ItemList";
import { carros } from "./mock/carros";

const App = () => {
  return (
    <ul styles={styles.item_list}>
      {carros.map((carro) => (
        <ItemList key={`list-item-${carro.id}`} item={carro} />
      ))}
    </ul>
  )
}

export default App
