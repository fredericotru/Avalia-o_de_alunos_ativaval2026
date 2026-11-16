
# language: pt

Funcionalidade: Controle de estoque

  Cenário: Adicionar produtos
    Dado que tenho 10 unidades no estoque
    Quando adiciono 5 unidades
    Então o estoque deve ter 15 unidades

  Cenário: Retirar produtos
    Dado que tenho 10 unidades no estoque
    Quando retiro 4 unidades
    Então o estoque deve ter 6 unidades

  Cenário: Saldo insuficiente
    Dado que tenho 10 unidades no estoque
    Quando retiro 20 unidades
    Então o estoque deve ter 10 unidades
