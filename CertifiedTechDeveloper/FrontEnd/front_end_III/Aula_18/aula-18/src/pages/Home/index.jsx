import { useState, useEffect } from "react";
import api from "../../services/api";

import "./styles.css";

const Home = () => {
    const [products, setProducts] = useState([]);
    const [formData, setFormData] = useState({
        name: "",
        description: "",
        price: "",
        manufacturer: "",
        image: "",
    });

    useEffect(() => {
        getProducts();
    }, []);

    async function getProducts() {
        const response = await api.get('/products');

        setProducts(response.data);
    }

    return (
        <div className="container">
            <form>
                <h2>Cadastrar Produto</h2>
                <input
                    placeholder="Nome"
                    value={formData.name}
                    onChange={(event) =>
                        setFormData({ ...formData, name: event.target.value })
                    }
                />
                <input
                    placeholder="Preço"
                    value={formData.price}
                    onChange={(event) =>
                        setFormData({ ...formData, price: event.target.value })
                    }
                />
                <input
                    placeholder="Fabricante"
                    value={formData.manufacturer}
                    onChange={(event) =>
                        setFormData({ ...formData, manufacturer: event.target.value })
                    }
                />
                <input
                    placeholder="Image"
                    value={formData.image}
                    onChange={(event) =>
                        setFormData({ ...formData, birthDate: event.target.value })
                    }
                />
                <textarea
                    placeholder="Descrição"
                    value={formData.description}
                    onChange={(event) =>
                        setFormData({ ...formData, description: event.target.value })
                    }
                />
                <button type="button" onClick={() => { }}>
                    Salvar
                </button>
            </form>

            <div className="products">
                <h1>Produtos</h1>

                <div className="content">
                    {products.map((product) => (
                        <div className="container-item">
                            <img src={product.image} />
                            <p>{product.price}</p>
                            <p>{product.name}</p>
                        </div>
                    ))}
                </div>
            </div>
        </div>
    );
}

export default Home;