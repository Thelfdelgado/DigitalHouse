import Container from "./Container"

const itens = [
    {
        id:1,
        name:'Coca cola'
    },
    {
        id:2,
        name:'Coxinha'
    },
    {
        id:3,
        name:'Pizza'
    },
    {
        id:4,
        name:'Bolacha'
    },
    {
        id:5,
        name:'Melancia'
    }
]

function ListaCompras(){
    return (
        <ul>
          {
            itens.map((item)=><li key={item.id}> {item.id} - {item.name}</li>)
          }
        </ul>
    )
}

export default ListaCompras