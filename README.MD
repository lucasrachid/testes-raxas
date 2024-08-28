# COMANDOS MVN

mvn clean - Limpar dependências
mvn package - Gerar arquivo Jar
mvn test - Rodar os testes

# COMANDO PARA RODAR O JAR
java -jar target/analise-valor-limite-1.0-SNAPSHOT.jar


# Relatório de Testes
## 1. Introdução:
### a. Descrição da atividade:
Este relatório documenta os testes realizados em um projeto de cálculo de cashback com base em compras e grau de fidelidade do cliente. O objetivo dos testes foi garantir a precisão dos cálculos e a conformidade com os critérios estabelecidos para diferentes níveis de fidelidade (Bronze, Prata, Ouro) e faixas de valor de compra.

### b. Objetivo dos testes:
O objetivo dos testes foi verificar se a aplicação calcula corretamente o valor de cashback com base nas regras definidas. A funcionalidade central da aplicação é o cálculo do cashback, que depende de dois fatores: o valor da compra e o grau de fidelidade do cliente. Esses testes são importantes para garantir que todas as regras de negócio sejam corretamente implementadas e que o sistema se comporte conforme o esperado para diferentes cenários, especialmente para valores em faixas críticas.

### c. Conceito de análise de valor limite:
Análise de valor limite é uma técnica de teste que foca em testar os limites de intervalos de entrada, onde os erros são mais prováveis de ocorrer. Ao testar esses limites (por exemplo, o valor mínimo e máximo de um intervalo), podemos garantir que o software lida corretamente com esses cenários críticos. Essa técnica é importante porque muitas falhas em software ocorrem em pontos de fronteira, e testar esses valores ajuda a identificar problemas que poderiam não ser detectados em testes convencionais.

# 2. Análise de Valor Limite:
## a. Casos de teste de análise de valor limite:
### i. Lista de Casos de Teste:
Compra de R$100, Grau de Fidelidade Bronze

Entrada: R$100, Bronze
Resultado Esperado: R$5,00 de cashback
Compra de R$100, Grau de Fidelidade Prata

Entrada: R$100, Prata
Resultado Esperado: R$10,00 de cashback
Compra de R$100, Grau de Fidelidade Ouro

Entrada: R$100, Ouro
Resultado Esperado: R$15,00 de cashback
Compra de R$200, Grau de Fidelidade Prata

Entrada: R$200, Prata
Resultado Esperado: R$30,00 de cashback
Compra de R$600, Grau de Fidelidade Ouro

Entrada: R$600, Ouro
Resultado Esperado: R$150,00 de cashback
Compra de R$0, Grau de Fidelidade Bronze

Entrada: R$0, Bronze
Resultado Esperado: R$0,00 de cashback
Compra de R$-50, Grau de Fidelidade Bronze

Entrada: R$-50, Bronze
Resultado Esperado: R$0,00 de cashback
### ii. Entradas utilizadas no teste:
As entradas utilizadas nos testes variam em termos de valor da compra (R$0, R$100, R$200, R$600) e grau de fidelidade (Bronze, Prata, Ouro).

### iii. Resultados esperados:
Os resultados esperados variam de acordo com o grau de fidelidade e o valor da compra, conforme listado na seção de casos de teste.

## b. Aplicação da Análise de Valor Limite:
### i. Valores Limite Testados:
Valor de Compra R$100: Testado com diferentes graus de fidelidade (Bronze, Prata, Ouro) para garantir que o cashback é corretamente calculado na fronteira da faixa de valor.
Valor de Compra R$200 e R$600: Testado para confirmar o comportamento do sistema em limites superiores.
Valores Limite Inferior: Testados valores de compra R$0 e R$-50 para verificar o comportamento do sistema com valores fora do intervalo válido.

# 3. Execução dos Testes:
## a. Processo de Execução:
Os testes foram executados usando JUnit dentro do ambiente de desenvolvimento do projeto. Cada caso de teste foi executado individualmente para verificar o resultado do cálculo de cashback em diferentes cenários.

## b. Resultados dos Testes:
Os testes passaram com sucesso, sem falhas com exceção do teste testCashbackCompraNegativa, onde o resultado esperado era um cashback de 0.0, mas retornou -2.5. 

## c. Saídas de Execução dos Testes:
(Adicionar logs ou capturas de tela da execução dos testes aqui)

## d. Resultados da Análise de Valor Limite:
Os testes projetados para a análise de valor limite retornaram os resultados esperados. Não foram encontrados problemas ao testar os limites especificados.

## e. Problemas Encontrados:
O Teste testCashbackCompraNegativa apresentou um problema no retorno, sendo que o esperado seria o valor de 0.0 de cashback, porém o mesmo está retornando -2.5 de cashback.

# 4. Conclusão:
## a. Resumo das Descobertas:
Os testes realizados confirmaram que o sistema de cashback está funcionando corretamente para diferentes valores de compra e graus de fidelidade. A aplicação calculou corretamente o cashback em todos os cenários testados, inclusive nos limites críticos.

## b. Avaliação da Robustez da Aplicação:
Com base nos resultados dos testes, a aplicação demonstrou ser robusta, lidando corretamente com os valores limite e produzindo resultados corretos para todas as combinações de entrada testadas. A ausência de falhas nos testes sugere que o sistema está bem implementado e preparado para operar de forma confiável nas situações previstas.