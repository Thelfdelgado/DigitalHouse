const Card = (props) => {


    function valiMulta() {
        const newMulta = Boolean(Math.round(Math.random() < 0.5));
        if (newMulta === true) {
            return "Possui Multa!";
        } else {
            return "Não Possui Multa!";
        }
    };

    console.log(valiMulta());

    return (
        <div className="Card">
            <h2>Multa: {valiMulta()}</h2>
            <h3>Veiculo: {props.carro.veiculo}</h3>
            <h3>Placa: {props.carro.placa}</h3>
        </div>
    )
}

export default Card;