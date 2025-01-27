-- Criação da tabela perguntas
CREATE TABLE questions (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           question VARCHAR(255) NOT NULL
);

-- Inserção das perguntas iniciais
INSERT INTO questions (question) VALUES
                                  ('Qual seu nome completo?'),
                                  ('Qual seu email de contato?'),
                                  ('Qual sua idade?'),
                                  ('Qual sua altura?');
