📦 Encomendas Condomínio
<br/>

Sistema de registro e gestão de encomendas para portarias de condomínios, criado para otimizar o fluxo de recebimento e entrega de pacotes.

🚀 Sobre o Projeto
A aplicação consiste em uma plataforma onde porteiros podem registrar novas encomendas e os moradores são notificados via WhatsApp para que possam retirá-las. O sistema gera um código PIN para a retirada, assegurando que o pacote seja entregue à pessoa correta, e mantém um histórico completo de todas as movimentações.

Este projeto está em fase inicial de desenvolvimento, focado na estrutura principal do backend e na modelagem do banco de dados.

🛠️ Tecnologias Utilizadas
Categoria	Tecnologia
Backend	Java com Spring Boot
Frontend	JavaScript ou TypeScript
Banco de Dados	SQL (modelo relacional)
Comunicação	API RESTful
Testes	JUnit e Mockito (a definir)

✨ Funcionalidades Principais
🔒 Login de Porteiros: Cada porteiro tem seu login e senha, com acesso compartilhado aos dados após o login.

✍️ Registro de Encomendas: Cadastro de pacotes com nome do morador, bloco, apartamento e tipo de encomenda (caixa, pacote, envelope - opcional).

📱 Notificação via WhatsApp: Envio automático de mensagens ao morador com um código PIN para retirada.

🔑 Confirmação de Entrega (PIN): O porteiro atualiza o status para "Entregue" após o morador informar o código PIN.

📊 Histórico Completo: Rastreamento de todas as movimentações, incluindo horário, data e o responsável pela entrega e recebimento.

🚧 Status e Próximos Passos
Status	Descrição: Em Construção	

Próximos passos planejados:

[x] Implementar as entidades (Morador, Porteiro, Encomenda).

[ ] Desenvolver os endpoints de cadastro e login.

[ ] Integrar com a API de notificações.

[ ] Iniciar o desenvolvimento do frontend.


⚙️ Instalação e Execução
Como o projeto está em fase inicial, as instruções a seguir serão atualizadas com o avanço do desenvolvimento.

Clone o repositório:

Bash

git clone https://github.com/seu-usuario/encomendas-condominio.git
Configuração do Banco de Dados:

Crie um banco de dados conforme o schema que será definido.

As credenciais de acesso devem ser configuradas no arquivo .env para segurança.

Execução do Backend:

Abra o projeto em sua IDE (IntelliJ IDEA, por exemplo).

Execute a classe principal da aplicação Spring Boot.

A API será iniciada em http://localhost:8080.

