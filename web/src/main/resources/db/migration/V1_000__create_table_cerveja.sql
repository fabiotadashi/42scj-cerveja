create table TB_CERVEJA(
    ID BIGINT auto_increment primary key,
    NOME VARCHAR(100),
    TIPO VARCHAR(15),
    VENCIMENTO DATE,
    DATA_CRIACAO TIMESTAMP not null,
    DATA_ULTIMA_ATUALIZACAO TIMESTAMP
);
