import {cities} from './mock/cities';
import CityList from "./components/CityList";

const App = () => {

  const filterCities = (city) => city.country === 'BRA';

  return (
    <ul>
      {cities.filter(filterCities).map((city) => (
        <CityList key={`list-item-${city.id}`} item={city} />
      ))}
    </ul>
  )
}

export default App
