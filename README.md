# 35SCJ_WebServices_Vambora

1. **Nome Aplicação:** Vambora!

1. **Principais Funcionalidades:**
     * Cadastro de Cliente
     * Cadastro de Carro
     * Chamada de Carro
     * Status de Viagem

1. **Tecnologias:**
    * Spring-Boot
    * Spring-REST
    * Swagger
    * Angular
    * Banco de dados H2

1. **Principais Serviços da API:**
    * Clientes - CRUD 
    * Carros - CRUD e buscar carro disponível
    * Localização (CRUD e operações)
    * Viagem (CRUD e operações)
        * Solicitar viagem (Id do Cliente)
            * Buscar carro disponível
            * Registrar viagem:
                * Cadastrar Localização Origem
                * Cadastrar Localização Destino
            * Direcionar carro para origem:
                * Alterar status do carro: indisponível
                * Alterar status do viagem: Carro a caminho

        * Iniciar viagem (Id Viagem)

        * Finalizar viagem  (Id Viagem)
