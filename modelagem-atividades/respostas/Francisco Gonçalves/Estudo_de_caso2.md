## Estudo de Caso 2 — PetCare

### 1. Elicitação e Stakeholders

* **Mapeamento de Stakeholders e Necessidades:**
* **Tutores dos animais:** Necessitam de praticidade para agendar consultas pelo dispositivo móvel e acompanhar os prazos de vacinação do pet por meio de alertas.
* **Veterinários:** Exigem rápido acesso ao histórico clínico do paciente (consultas anteriores, exames, vacinas e tratamentos) e um canal eficiente para registrar diagnósticos e prescrições.
* **Equipe de Recepção:** Precisa de visão centralizada da agenda clínica para gerenciar horários disponíveis, realizar confirmações e remarcações sem conflito de agenda.
* **Gerência / Proprietários:** Necessitam de visibilidade sobre métricas de atendimento e relatórios operacionais para tomada de decisão financeira e estratégica.


* **Técnicas de Elicitação:**
1. **Observação Direta (Job Shadowing):**
* *Justificativa:* Acompanhar o fluxo diário de trabalho da recepção e dos veterinários no ambiente real da clínica permite identificar gargalos na transição das fichas em papel que não seriam verbalizados em reuniões.


2. **Workshops de Requisitos / Brainstorming Dirigido:**
* *Justificativa:* Reunir gerência, recepcionistas e veterinários para definir os processos essenciais de atendimento, alinhar expectativas sobre o prazo limite de 4 meses e arbitrar conflitos de escopo.

---

### 2. Análise e Especificação de Requisitos

#### Requisitos Funcionais (RF)

* **RF01 (Agendamento Online):** O sistema deve permitir que os tutores escolham serviços, veterinários e horários disponíveis para efetuar agendamentos via dispositivo móvel.
* **RF02 (Gestão de Prontuário Eletrônico):** O sistema deve permitir que os veterinários registrem e consultem prontuários com diagnósticos, prescrições de medicamentos e históricos de vacinas.
* **RF03 (Controle de Agenda pela Recepção):** O sistema deve disponibilizar um painel administrativo para a recepção aprovar, remarcar ou cancelar solicitações de agendamento.
* **RF04 (Envio de Lembretes Automáticos):** O sistema deve enviar notificações prévias (SMS, e-mail ou push) aos tutores alertando sobre datas de consultas e vacinas a vencer.
* **RF05 (Relatórios de Atendimento):** O sistema deve gerar relatórios gerenciais consolidados contendo métricas sobre quantidade de atendimentos por período e perfil de serviços prestados.

#### Requisitos Não Funcionais (RNF)

* **RNF01 (Disponibilidade Operacional):** O sistema deve manter índice de disponibilidade de 99,5% do tempo no período comercial (das 07:00 às 19:00).
* **RNF02 (Integridade dos Dados Médicos):** O registro de atendimento assinado pelo veterinário não deve permitir alteração retroativa de dados sem registro explícito de log de auditoria.
* **RNF03 (Desempenho de Busca):** A consulta de histórico clínico de um animal por parte do veterinário deve retornar em tempo inferior a 1,5 segundo.

---

### 3. Negociação com MoSCoW

* **Must have (Indispensável):**
* *RF01 (Agendamento online), RF02 (Prontuário eletrônico), RF03 (Controle de agenda), RF04 (Lembretes de vacina), RNF01 e RNF03.*
* **Justificativa:** Formam a espinha dorsal do sistema para resolver a ineficiência do uso de papel e agendamentos telefônicos, viabilizando o lançamento dentro do prazo limite de 4 meses.


* **Should have (Importante, mas não indispensável):**
* *RF05 (Relatórios gerenciais completos).*
* **Justificativa:** Essencial para a tomada de decisão da gerência, porém um painel simplificado ou exportação simples de dados atende no primeiro momento sem comprometer a operação.


* **Could have (Desejável):**
* *Pagamento direto pelo aplicativo.*
* **Justificativa:** A integração com gateways de pagamento adiciona complexidade técnica de segurança (PCI-DSS) e homologação financeira, devendo ficar para uma fase posterior.


* **Won't have (Não implementado nesta versão):**
* *Chat em tempo real com veterinários e Galeria/Rede social de fotos dos animais.*
* **Justificativa:** O chat aumenta a responsabilidade operacional dos veterinários fora do horário de atendimento. A área de fotos não agrega valor ao processo clínico. Ambas comprometeriam o prazo estrito de 4 meses.

---

### 4. Especificação de Requisitos Não Funcionais

| Identificador | Requisito Não Funcional | Critério Objetivo de Avaliação | Forma de Teste / Verificação |
| --- | --- | --- | --- |
| **RNF-PET-01** | **Desempenho do Sistema** | O tempo de carregamento de qualquer tela da aplicação móvel não deve ultrapassar 2,0 segundos sob conexões 4G ou Wi-Fi. | Monitoramento via ferramentas de APM (Application Performance Monitoring) simulando conexões móveis limitadas. |
| **RNF-PET-02** | **Segurança e Privacidade (LGPD)** | Os dados pessoais dos tutores e os registros clínicos devem utilizar criptografia em repouso (AES-256) e em trânsito (TLS 1.3). | Auditoria de segurança de dados com scanners de vulnerabilidades e testes automatizados de tráfego de rede. |
| **RNF-PET-03** | **Facilidade de Uso (Usabilidade)** | A conclusão de um agendamento por parte do tutor deve ser realizada em no máximo 4 etapas/telas distintas a partir da autenticação. | Teste de usabilidade com usuários reais medindo a taxa de conclusão de tarefas sem assistência prévia. |

---

### 5. Validação dos Requisitos

* **Técnicas de Validação Recomendadas:**
1. **Matriz de Rastreabilidade de Requisitos:**
* *Aplicação:* Mapeamento de cada funcionalidade levantada de volta à sua fonte (qual stakeholder solicitou). Isso garante que nenhuma necessidade da recepção, veterinários ou tutores tenha ficado sem atendimento ou sido adulterada no processo.


2. **Sessões de Validação com Protótipos Navegáveis:**
* *Aplicação:* Realizar sessões com os veterinários e secretárias testando o protótipo do prontuário e da agenda antes de codificar. Permite identificar lacunas de campos essenciais de atendimento e ajustar a interface com base no feedback real.

---

### 6. Desafio — Priorização da Primeira Versão (MVP)

#### As 5 Funcionalidades Selecionadas

1. **RF01 — Agendamento de Consultas via Celular (Tutor)**
* *Necessidade atendida:* Autonomia para marcar horários sem necessidade de chamadas telefônicas ou mensagens manuais.
* *Beneficiados:* Tutores e equipe da recepção.
* *Justificativa de inclusão:* É a porta de entrada da solução e elimina a sobrecarga da equipe administrativa no atendimento inicial.


2. **RF02 — Prontuário Eletrônico do Animal (Veterinário)**
* *Necessidade atendida:* Centralização de diagnósticos, prescrições e histórico clínico em formato digital.
* *Beneficiados:* Veterinários e tutores.
* *Justificativa de inclusão:* Resolve o maior problema operacional da clínica (perda de informações contidas em fichas de papel).


3. **RF03 — Gestão Integrada de Agenda (Recepção)**
* *Necessidade atendida:* Controle de horários vagos, confirmações e cancelamentos de consultas sem sobreposição de horários.
* *Beneficiados:* Recepção e veterinários.
* *Justificativa de inclusão:* Sem o módulo da recepção, o agendamento dos tutores gera conflitos de agenda e inconsistência operacional.


4. **RF04 — Notificações e Lembretes de Vacinação (Automação)**
* *Necessidade atendida:* Envio automático de alertas sobre retornos e vacinas pendentes.
* *Beneficiados:* Tutores e gestão da clínica.
* *Justificativa de inclusão:* Aumenta a fidelização de clientes e reduz a taxa de absenteísmo em consultas com custo zero de operação manual.


5. **RNF01 — Autenticação e Gestão de Perfis de Acesso (Segurança Básica)**
* *Necessidade atendida:* Garantia de privacidade e restrição de visualização dos dados dos pets e de tutores apenas por pessoas autorizadas.
* *Beneficiados:* Todos os envolvidos e a clínica juridicamente.
* *Justificativa de inclusão:* Requisito estrutural indispensável para garantir conformidade legal com dados de clientes.

#### Impactos e Riscos do Aditamento das Demais Funcionalidades

* **Pagamentos pelo aplicativo:** Adiar esta função mantém o processo financeiro nos terminais físicos existentes da clínica, sem prejudicar a execução das consultas nem comprometer o prazo de 4 meses do projeto.
* **Chat e Fotos:** Adiar o chat evita sobrecarregar os veterinários em momento de transição de processos, enquanto a ausência da área de fotos não impede nenhuma atividade clínica ou comercial essencial.