CREATE TABLE treino (
    id UUID UNIQUE PRIMARY KEY,
    nome VARCHAR(100),
    serie INTEGER,
    repeticoes INTEGER,
    categoria CHAR
);

CREATE TABLE Pessoa (
    id UUID PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf BIGINT UNIQUE NOT NULL,
    rg BIGINT UNIQUE NOT NULL,
    dataNasc TIMESTAMP NOT NULL,
    celular BIGINT,
    endereco VARCHAR(255)
);

CREATE TABLE Professor (
    id UUID PRIMARY KEY,
    cargo VARCHAR(100),
    salario DOUBLE PRECISION,
    ingresso TIMESTAMP,
    FOREIGN KEY (id) REFERENCES Pessoa(id)
);

CREATE TABLE Aluno (
    id UUID PRIMARY KEY,
    plano VARCHAR(100),
    dataPag INTEGER,
    statusPag VARCHAR(50),
    obs TEXT,
    ingresso TIMESTAMP,
    ficha_id UUID,
    professor_id UUID,
    FOREIGN KEY (ficha_id) REFERENCES Treino(id),
    FOREIGN KEY (id) REFERENCES Pessoa(id),
    FOREIGN KEY (professor_id) REFERENCES Professor(id)
);

CREATE TABLE Associacao (
    id UUID PRIMARY KEY,
    aluno_id UUID REFERENCES Aluno(id),
    professor_id UUID REFERENCES Professor(id),
    statusAssoc VARCHAR(50),
    dataAssoc TIMESTAMP
);

