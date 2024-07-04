INSERT INTO medicamento (nome_medicamento)
VALUES
    ('ACETILCISTEINA 200MG'),
    ('ACICLOVIR 200MG'),
    ('ACIDO VALPRÓICO 300 M'),
    ('ALENDRONATO DE SODIO'),
    ('ALLEGRA 180 MG'),
    ('Loratadina 10MG'),
    ('Metformina 100MG'),
    ('Dipirona 100MG'),
    ('ATENOLOL 25MG'),
    ('BENFOTIAMINA 150 MG');


INSERT INTO residente (nome, data_nascimento, descricao_enfermidade, peso, convenio, sexo, alergias, id_medicamento)
VALUES
    ('Residente 1', '1930-01-01', 'Hipertensão', 70, 'Convênio 1', 'M', 'Nenhuma', 1),
    ('Residente 2', '1935-02-02', 'Diabetes', 80, 'Convênio 2', 'F', 'Glúten', 2),
    ('Residente 3', '1940-03-03', 'Artrite', 75, 'Convênio 3', 'M', 'Amendoim', 3),
    ('Residente 4', '1945-04-04', 'Osteoporose', 65, 'Convênio 4', 'F', 'Lactose', 4),
    ('Residente 5', '1950-05-05', 'Doença Cardíaca', 85, 'Convênio 5', 'M', 'Nenhuma', 5),
    ('Residente 6', '1955-06-06', 'Alzheimer', 70, 'Convênio 6', 'F', 'Frutos do mar', 6),
    ('Residente 7', '1960-07-07', 'Parkinson', 80, 'Convênio 7', 'M', 'Soja', 7),
    ('Residente 8', '1965-08-08', 'Câncer', 75, 'Convênio 8', 'F', 'Ovos', 8),
    ('Residente 9', '1970-09-09', 'Asma', 65, 'Convênio 9', 'M', 'Trigo', 9),
    ('Residente 10', '1975-10-10', 'Epilepsia', 85, 'Convênio 10', 'F', 'Nenhuma', 10);

