Create table CONTA(
                      friendlyName VARCHAR (60) ,
                      accountType VARCHAR  (60) ,
                      currencyCode VARCHAR  (60) ,
                      referenceAccountNumber VARCHAR  (60) ,
                      id uuid PRIMARY KEY NOT NULL,
                      accountNumber VARCHAR (60) ,
                      actualBalance_value INT ,
                      actualBalance_currency VARCHAR (60) ,
                      actualBalance_displayCurrencyCode VARCHAR (60) ,
                      actualBalance_displayText VARCHAR (60) ,
                      availableBalance_value INT ,
                      availableBalance_currency VARCHAR (60) ,
                      availableBalance_displayCurrencyCode VARCHAR (60) ,
                      availableBalance_displayText VARCHAR (60) ,
                      accountHolderId uuid ,
                      oldAccountNumber VARCHAR (60) ,
                      accountStatus VARCHAR (60) ,
                      createdDateTime VARCHAR (60) ,
                      externalReference VARCHAR (60) );

Create TABLE usuario (
                         id SERIAL PRIMARY KEY,
                         login VARCHAR (60),
                         senha VARCHAR (60)
);

insert into usuario(id, login, senha)
values(1, 'teste', '$2a$10$tgFGGzsv1ydy./QM6VI.oudcOghv7XABazxuK6KKqtX3DWu3saseC');

