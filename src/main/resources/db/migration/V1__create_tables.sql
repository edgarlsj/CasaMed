-- Criação da tabela residente
CREATE TABLE residente (
                           id_residente IDENTITY PRIMARY KEY,
                           nome VARCHAR(255) NOT NULL,
                           data_nascimento DATE NOT NULL,
                           descricao_enfermidade VARCHAR(255) NOT NULL,
                           peso INT NOT NULL,
                           convenio VARCHAR(255) NOT NULL,
                           sexo CHAR(1) NOT NULL,
                           alergias VARCHAR(255)
);

-- Criação da tabela medicamento
CREATE TABLE medicamento (
                             id_medicamento IDENTITY PRIMARY KEY,
                             nome_medicamento VARCHAR(255) NOT NULL
);

-- Criação da tabela prescricao
CREATE TABLE prescricao (
                            id_prescricao IDENTITY PRIMARY KEY,
                            data_prescricao DATE NOT NULL,
                            dose VARCHAR(255) NOT NULL,
                            periodo_dia VARCHAR(255),
                            via VARCHAR(255) NOT NULL,
                            horario_adm TIME,
                            id_residente INT NOT NULL,
                            etiqueta BOOLEAN,
                            observacao VARCHAR(255) NOT NULL,
                            FOREIGN KEY (id_residente) REFERENCES residente(id_residente)
);

-- Criação da tabela prescricao_medicamento
CREATE TABLE prescricao_medicamento (
                                        id_prescricao INT NOT NULL,
                                        id_medicamento INT NOT NULL,
                                        PRIMARY KEY (id_prescricao, id_medicamento),
                                        FOREIGN KEY (id_prescricao) REFERENCES prescricao(id_prescricao),
                                        FOREIGN KEY (id_medicamento) REFERENCES medicamento(id_medicamento)
);