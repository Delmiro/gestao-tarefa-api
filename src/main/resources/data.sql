INSERT INTO PROJETO (NOME) VALUES ('Projeto Gestão de Pessoas');
INSERT INTO PROJETO (NOME) VALUES ('Projeto Sistema Financeiro');

INSERT INTO TAREFA (TITULO, DESCRICAO, STATUS, DATA_CRIACAO, ID_PROJETO) VALUES
('Cadastrar Funcionário', 'Implementar endpoint de cadastro', 'Aberta', CURRENT_TIMESTAMP, 1),
('Listar Funcionários', 'Criar consulta com paginação', 'Concluída', CURRENT_TIMESTAMP, 1),
('Excluir Funcionário', 'Implementar exclusão lógica', 'Aberta', CURRENT_TIMESTAMP, 1),
('Editar Funcionário', 'Permitir atualização parcial', 'Em Andamento', CURRENT_TIMESTAMP, 1),
('Relatório RH', 'Gerar relatório em PDF', 'Aberta', CURRENT_TIMESTAMP, 1),
('Controle de Acesso', 'Implementar autenticação JWT', 'Aberta', CURRENT_TIMESTAMP, 1),
('Dashboard Pessoas', 'Exibir métricas de funcionários', 'Concluída', CURRENT_TIMESTAMP, 1),
('Exportar Dados', 'Exportar CSV de funcionários', 'Aberta', CURRENT_TIMESTAMP, 1);

INSERT INTO TAREFA (TITULO, DESCRICAO, STATUS, DATA_CRIACAO, ID_PROJETO) VALUES
('Cadastrar Transação', 'Criar endpoint de inclusão de transação', 'Aberta', CURRENT_TIMESTAMP, 2),
('Listar Transações', 'Consulta paginada de transações', 'Em Andamento', CURRENT_TIMESTAMP, 2),
('Excluir Transação', 'Implementar soft delete', 'Aberta', CURRENT_TIMESTAMP, 2),
('Gerar Extrato', 'Implementar consulta agrupada por período', 'Concluída', CURRENT_TIMESTAMP, 2),
('Validação de Campos', 'Adicionar validações de entrada', 'Aberta', CURRENT_TIMESTAMP, 2),
('Relatório Financeiro', 'Gerar relatório mensal', 'Aberta', CURRENT_TIMESTAMP, 2),
('Integração Bancária', 'Sincronizar dados via API externa', 'Em Andamento', CURRENT_TIMESTAMP, 2);
