# Questão 1

CREATE VIEW vw_clientes_caixa AS (
    SELECT
		cpf,
        nome
	FROM clientes
);

SELECT * FROM vw_clientes_caixa;


# Questão 2

CREATE VIEW vw_funcionarios_telefones AS (
	SELECT
		f.nome,
        t.tel
	FROM funcionarios f
		INNER JOIN telefones t ON
			F.cpf_func = t.cpf_func
	ORDER BY f.nome ASC
);

SELECT * FROM vw_funcionarios_telefones;


# Questão 3

CREATE VIEW vw_medicamentos_laboratorios AS (
	SELECT
		m.nome,
        m.tipo,
        l.razao_social,
        l.pais
	FROM medicamentos m
		INNER JOIN fornecimentos f ON
			m.codigo = f.codigo
            
            INNER JOIN laboratorios l ON
					f.cnpj = l.cnpj
);

SELECT * FROM vw_medicamentos_laboratorios;


# Questão 4

CREATE VIEW vw_dependentes_criancas AS(
	SELECT
		d.cpf_depe,
        d.nome,
        d.data_nasc
	FROM dependentes d
		WHERE d.data_nasc >= 2018
);

SELECT * FROM vw_dependentes_criancas;


# Questão 5

CREATE VIEW vw_resumo_vendas AS (
	SELECT
		v.codi_venda,
        v.data_venda,
        m.nome
	FROM vendas v
		INNER JOIN medicamentos m ON
			v.codi_medicamento = m.codigo
);

SELECT * FROM vw_resumo_vendas;


	# 2ª Parte - Questão 5
    
CREATE OR REPLACE VIEW vw_resumo_vendas AS (
	SELECT
		v.codi_venda,
		v.data_venda,
		m.nome AS medicamento,
		f.nome AS funcionario
	FROM vendas v
		INNER JOIN medicamentos m ON
			v.codi_medicamento = m.codigo
		INNER JOIN funcionarios f ON
			v.cpf_func =  f.cpf_func
);

SELECT * FROM vw_resumo_vendas;


# Questão 6

CREATE OR REPLACE VIEW vw_clientes_caixa AS (
    SELECT
		cpf,
        nome,
        cidade
	FROM clientes
);

SELECT * FROM vw_clientes_caixa;


# Questão 7

CREATE OR REPLACE VIEW vw_funcionarios_telefones AS (
	SELECT
		f.nome,
        t.tel,
        f.salario
	FROM funcionarios f
		INNER JOIN telefones t ON
			F.cpf_func = t.cpf_func
	ORDER BY f.nome ASC
);

SELECT * FROM vw_funcionarios_telefones;


# Questão 8

CREATE OR REPLACE VIEW vw_medicamentos_laboratorios AS (
	SELECT
		m.nome,
        m.tipo,
        l.razao_social,
        l.pais
	FROM medicamentos m
		INNER JOIN fornecimentos f ON
			m.codigo = f.codigo
            
            INNER JOIN laboratorios l ON
					f.cnpj = l.cnpj
		WHERE l.pais != 'Brasil'
);

SELECT * FROM vw_medicamentos_laboratorios;


# Questão 9

CREATE OR REPLACE VIEW vw_dependentes_criancas AS(
	SELECT
		d.cpf_depe,
        d.nome AS nome_dependente,
        f.nome AS nome_funcionario,
        d.data_nasc
	FROM dependentes d
		INNER JOIN funcionarios f ON
			d.cpf_func = f.cpf_func	
);

SELECT * FROM vw_dependentes_criancas;


# Questão 10

CREATE OR REPLACE VIEW vw_resumo_vendas AS (
	SELECT
		c.nome AS nome_cliente,
        f.nome AS nome_funcionario,
        m.preco
	FROM vendas v
		INNER JOIN medicamentos m ON
			v.codi_medicamento = m.codigo
		INNER JOIN funcionarios f ON
			v.cpf_func =  f.cpf_func
		INNER JOIN clientes c ON
			v.cpf_clie = c.cpf
);

SELECT * FROM vw_resumo_vendas;

