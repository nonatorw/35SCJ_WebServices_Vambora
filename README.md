# 35SCJ_WebServices_Vambora

1. **Nome Aplicação:** Vambora!

1. **Principais Funcionalidades:**
     * Cadastro de Usuario
     * Cadastro de Veiculos
     * Chamada de Veiculos
     * Transito de Veiculos
     * Historico de Viagem
     * Controle de viagem

1. **Tecnologias:**
    * Spring-Boot
    * Spring-REST
    * Swagger
    * React

1. **Principais Serviços da API:**
    * Usuários (CRUD e operações)
    * Veículos (CRUD e operações)
    * Localização (CRUD e operações)
    * Viagem (CRUD e operações)
        * Solicitar viagem (Id do Cliente, Origem, Destino)
            * Buscar carro disponível
            * Registrar viagem:
                * Cadastrar Localização Origem
                * Cadastrar Localização Destino
            * Direcionar carro para origem:
                * Alterar status do carro: indisponível
                * Alterar status do viagem: Carro a caminho

        * Busca status da Viagem

        * Iniciar viagem (Id Viagem)
            * Embarque do cliente:
                * ALterar status da viagem: Passageiro embarcou
            * Direcionar veículo para destino:
                * Alterar status da viagem: Viagem em andamento

        * Finalizar viagem  (Id Viagem)
            * Desembarque do cliente:
                * Alterar status da viagem: Passageiro desembarcou
                * Alterar status do carro: disponível

1. **Possíveis Telas do Front-End:**
    1. Usuário:
        * Cadastro
        * Solicitação de Viagem
        * Controle de Créditos
    1. Viagem
        * Monitoramento de Viagem