CREATE TABLE residente (
                           id_residente IDENTITY PRIMARY KEY,
                           nome VARCHAR(255) NOT NULL,
                           data_nascimento DATE NOT NULL,
                           descricao_enfermidade VARCHAR(255) NOT NULL,
                           peso INT NOT NULL,
                           convenio VARCHAR(255) NOT NULL,
                           sexo CHAR(1) NOT NULL,
                           alergias VARCHAR(255),
                           id_medicamento INT
);

CREATE TABLE medicamento (
                             id_medicamento IDENTITY PRIMARY KEY,
                             nome_medicamento VARCHAR(255) NOT NULL
);