CREATE TABLE Treino (
    id UUID UNIQUE PRIMARY KEY,
    nome VARCHAR(100),
    serie INTEGER,
    repeticoes INTEGER,
    categoria CHAR
);

CREATE TABLE Pessoa (
    id UUID PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf INTEGER UNIQUE NOT NULL,
    rg INTEGER UNIQUE NOT NULL,
    dataNasc TIMESTAMP NOT NULL,
    celular INTEGER,
    endereco VARCHAR(255)
);

CREATE TABLE Aluno (
    pessoa_id UUID PRIMARY KEY,
    plano VARCHAR(100),
    dataPag TIMESTAMP,
    statusPag VARCHAR(50),
    bs TEXT,
    ingresso TIMESTAMP,
    ficha_id UUID,
    FOREIGN KEY (ficha_id) REFERENCES Treino(id),
    FOREIGN KEY (pessoa_id) REFERENCES Pessoa(id)
);

CREATE TABLE Professor (
    pessoa_id UUID PRIMARY KEY,
    cargo VARCHAR(100),
    salario DOUBLE PRECISION,
    ingresso TIMESTAMP,
    FOREIGN KEY (pessoa_id) REFERENCES Pessoa(id)
);

CREATE TABLE Associacao (
    id UUID PRIMARY KEY,
    aluno_id UUID REFERENCES Aluno(pessoa_id),
    professor_id UUID REFERENCES Professor(pessoa_id),
    statusAssoc VARCHAR(50),
    dataAssoc TIMESTAMP
);

