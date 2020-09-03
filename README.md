# Projeto Sprint01 em Springboot

- Projeto Sprint 1 em SpringBoot
- 1 classe abstrata: Pessoa
- 2 classes filhas: Usuario e Funcionario
- Usuário contem uma classe filha UsuarioVIP

Já implementei a classe Jogo que será adicionada à uma lista biblioteca em qualquer objeto do tipo Pessoa (ainda não funcional, apenas criei a classe com atributos)

# Descontos base:
Descontos que já vem por padrão (presente por usar nossa plataforma)
- Usuario Comum: 3% de desconto base
- Usuario VIP: 8% de desconto base
- Funcionario: 10% de desconto base

# Descontos à vista
Aqui é onde chamamos a função calcPreco
- Usuario Comum: +7% de desconto
- Usuario VIP: +10% de desconto
- Funcionario: +12% de desconto
