# language: pt
Funcionalidade: Listar usuários
  Como um cliente da API
  Quero obter uma lista de usuários
  Para visualizar todos os usuários cadastrados no sistema
Cenário: Listar todos os usuários com sucesso
  Dado que existem usuários cadastrados no sistema:
    | nome  | idade | email       | senha | cpf
    | vitor | 29    | vitor@gmail | 1234  | 70179626384
  Quando faço uma requisição GET para administradores
  Então o status code da resposta deve ser 200

