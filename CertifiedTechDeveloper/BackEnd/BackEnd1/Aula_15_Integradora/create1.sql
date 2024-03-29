CREATE TABLE IF NOT EXISTS clinica(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    sobrenome VARCHAR(100),
    rg VARCHAR(100),
    dataCadastro VARCHAR(100),
    idEndereco INT FOREIGN KEY REFERENCES endereco(id));

CREATE TABLE IF NOT EXISTS endereco(id INT AUTO_INCREMENT PRIMARY KEY, rua VARCHAR(255), numero INT, cidade VARCHAR(255), bairro VARCHAR(255));