-- Criação da tabela Pacientes
CREATE TABLE pacientes (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_nascimento DATE NOT NULL
);

-- Criação da tabela Medicos
CREATE TABLE medicos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cpf VARCHAR(11) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    crm VARCHAR(20) NOT NULL,
    especialidade VARCHAR(50) -- Enum armazenado como string
);

-- Criação da tabela Consultas
CREATE TABLE consultas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    medico_id BIGINT,
    descricao VARCHAR(255),
    data DATE,
    FOREIGN KEY (medico_id) REFERENCES medicos(id)
);

-- Criação da tabela Prontuarios
CREATE TABLE prontuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(255),
    paciente_cpf VARCHAR(11),
    medico_id BIGINT,
    FOREIGN KEY (paciente_cpf) REFERENCES pacientes(cpf),
    FOREIGN KEY (medico_id) REFERENCES medicos(id)
);
