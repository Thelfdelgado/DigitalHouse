import { useEffect } from "react";

const Box = () => {

    useEffect(() =>

        () => console.log("O COMPONENTE ACABOU DE SER DESMONTADO"),
        [])

    return (
        <div>
            <h1>Essa box esta sendo mostrada</h1>
        </div>
    );
};

export default Box;