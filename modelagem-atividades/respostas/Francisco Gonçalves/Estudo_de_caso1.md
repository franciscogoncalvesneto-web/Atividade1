# Atividade 1 — Engenharia de Requisitos

--

## Estudo de Caso 1 — Conecta Campus

### 1. Concepção

* **Problema a resolver:** Centralizar os serviços acadêmicos da universidade em uma única plataforma, eliminando a lentidão, a complexidade de uso do sistema legado e a fragmentação dos canais de comunicação entre alunos, professores e coordenação.
* **Objetivo principal:** Desenvolver o *Conecta Campus*, uma solução digital integrada, segura e intuitiva para otimizar o acesso a informações acadêmicas (notas, horários e avisos), melhorar o fluxo de comunicados e a distribuição de materiais didáticos.

---

### 2. Elicitação

* **Principais Stakeholders:**
* **Alunos:** Usuários finais que consultam notas, horários e avisos gerais.
* **Professores:** Usuários operacionais que publicam materiais didáticos, notas e avisos de disciplinas.
* **Coordenação Acadêmica:** Gestores responsáveis pela divulgação de eventos e informes institucionais.
* **Equipe de TI / Desenvolvimento:** Responsável pela manutenção, infraestrutura e viabilidade técnica do sistema.


* **Técnicas de Elicitação Recomendadas:**
1. **Questionários/Enquetes:**
* *Aplicação:* Envio de formulários estruturados com perguntas objetivas e escalas de satisfação para a base de alunos e professores. Permite coletar dados quantitativos sobre os principais pontos de dor do sistema atual e priorizar necessidades de usabilidade.


2. **Entrevistas Semiestruturadas:**
* *Aplicação:* Realização de reuniões individuais com representantes da coordenação e professores chave para mapear fluxos de trabalho específicos (ex.: publicação de avisos e uploads de materiais) e levantar restrições operacionais.


---

### 3. Análise e Modelagem

#### Requisitos Funcionais (RF)

* **RF01 (Autenticação):** O sistema deve permitir o login seguro de alunos, professores e coordenação por meio de credenciais únicas (matrícula/e-mail institucional e senha).
* **RF02 (Consulta de Desempenho e Horários):** O sistema deve permitir que os alunos visualizem suas notas, frequências e a grade horária das disciplinas matriculadas.
* **RF03 (Publicação de Materiais Didáticos):** O sistema deve permitir que os professores realizem o upload e gerenciamento de materiais das disciplinas em formatos como PDF e apresentação de slides.
* **RF04 (Emissão de Comunicados das Disciplinas):** O sistema deve permitir que os professores enviem avisos diretamente para as turmas vinculadas.
* **RF05 (Divulgação de Eventos Institucionais):** O sistema deve permitir que a coordenação cadastre e publique eventos, calendários e avisos gerais para toda a comunidade acadêmica.

#### Requisitos Não Funcionais (RNF)

* **RNF01 (Segurança e Controle de Acesso):** As informações acadêmicas e os conteúdos restritos devem ser acessíveis exclusivamente por usuários autenticados e autorizados conforme seu perfil.
* **RNF02 (Desempenho/Tempo de Resposta):** O sistema deve carregar as telas principais (como consulta de notas e horários) em no máximo 2 segundos em conexões padrão de internet.
* **RNF03 (Usabilidade):** A interface deve seguir diretrizes de acessibilidade e design responsivo, permitindo navegação fluida em dispositivos móveis e computadores de mesa.

---

### 4. Negociação (Matriz MoSCoW)

* **Must have (Indispensável):**
* *RF01 (Autenticação), RF02 (Consulta de notas/horários), RF03 (Publicação de materiais), RF04 (Comunicados dos professores), RNF01 (Segurança).*
* **Justificativa:** Garantem a entrega da proposta central do sistema e resolvem as necessidades imediatas de acesso a informações acadêmicas sob um ambiente seguro.


* **Should have (Importante, mas não indispensável):**
* *RF05 (Divulgação de eventos da coordenação).*
* **Justificativa:** Adiciona valor relevante à centralização da comunicação acadêmica, porém sua ausência na primeira semana de lançamento não impede as atividades de ensino das turmas.


* **Could have (Desejável):**
* *Notificações Push via aplicativo para avisos e atualizações.*
* **Justificativa:** Melhora a experiência do usuário, mas pode ser substituída temporariamente por alertas via e-mail ou dentro do próprio painel do sistema.


* **Won't have (Não implementado nesta versão):**
* *Chat em tempo real entre alunos e professores.*
* **Justificativa:** Conforme avaliado pela equipe, o desenvolvimento de um canal sincronizado demanda alto esforço de infraestrutura e moderação, podendo atrasar a entrega do Produto Mínimo Viável (MVP).

---

### 5. Especificação de Requisitos Não Funcionais

| Identificador | Requisito Não Funcional | Critério Objetivo de Avaliação | Forma de Teste / Verificação |
| --- | --- | --- | --- |
| **RNF-MED-01** | **Desempenho de Carga** | 95% das requisições de consulta de notas e horários devem responder em tempo inferior a 2,0 segundos sob carga normal de até 1.000 usuários concorrentes. | Testes automatizados de carga e estresse utilizando ferramentas como Apache JMeter ou K6. |
| **RNF-MED-02** | **Segurança de Autenticação** | O sistema deve bloquear o acesso direto às rotas protegidas sem token de sessão válido (JWT) e exigir criptografia TLS/HTTPS (porta 443) em todas as requisições. | Testes de penetração (pen-test) e análise estática de segurança com validação de tentativas de bypass de autenticação. |
| **RNF-MED-03** | **Facilidade de Uso (Usabilidade)** | Um aluno sem treinamento prévio deve conseguir localizar e visualizar suas notas em até 3 cliques a partir da tela inicial. | Testes de usabilidade com amostragem de usuários (método System Usability Scale - SUS com nota mínima 80/100). |

---

### 6. Validação

* **Técnicas de Validação Recomendadas:**
1. **Prototipagem de Alta/Média Fidelidade:**
* *Aplicação:* Apresentação de telas interativas do sistema (utilizando Figma ou Adobe XD) para alunos, professores e coordenadores antes da codificação. Permite validar visualmente se os fluxos de navegação atendem às expectativas dos usuários.


2. **Revisões Formais (Walkthroughs de Requisitos):**
* *Aplicação:* Realização de reuniões de validação com os representantes de cada grupo de leitores (coordenação e docentes) para leitura conjunta da especificação de requisitos, verificando ambiguidades, inconsistências ou omissões.
