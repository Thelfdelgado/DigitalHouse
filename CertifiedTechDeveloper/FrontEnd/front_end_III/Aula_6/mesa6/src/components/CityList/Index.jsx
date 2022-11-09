import styles from './styles.module.css';

const ItemList = ({item}) => {
    const {country, city, population, color} = item;

    return (
        <li className={styles.item_list} style={{ background: color}}>
            <h2>{country}</h2>
            <h2>{city}</h2>
            <h2>{population}</h2>
        </li>
    )
}

export default ItemList;