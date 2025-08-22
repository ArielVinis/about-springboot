# Sobre o Springboot

Criei esse projeto apresentando os conceitos sobre o Spring Boot através de exemplos práticos e progressivos.

## 📚 Projetos e Conceitos Exercitados

### 1. **Spring Primeiros Passos** (`1-spring-primeiros-passos/`)
**Conceitos:** Inicialização básica do Spring Boot, anotações fundamentais
- **@SpringBootApplication**: Anotação principal que configura auto-configuração
- **@Component**: Marca uma classe como componente gerenciado pelo Spring
- **SpringApplication.run()**: Método para inicializar a aplicação
- **Estrutura básica**: Demonstra como criar uma aplicação Spring Boot simples

### 2. **Spring IoC, DI, Beans e Autowired** (`2-spring-ioc-di-beans-autowired/`)
**Conceitos:** Inversão de Controle, Injeção de Dependência, configuração de beans
- **@Configuration**: Marca uma classe como fonte de definições de beans
- **@Bean**: Define um bean customizado no contexto do Spring
- **@Autowired**: Injeção automática de dependências
- **Injeção de Dependência**: Demonstra como o Spring gerencia dependências automaticamente

### 3. **Spring Scopes - Singleton e Prototype** (`3-spring-scopes-singleton-prototype/`)
**Conceitos:** Escopos de beans, gerenciamento de ciclo de vida
- **@Scope("singleton")**: Padrão - uma única instância por contexto (padrão)
- **@Scope("prototype")**: Nova instância criada a cada requisição
- **Ciclo de vida dos beans**: Controle sobre quando e como os objetos são criados
- **Gerenciamento de estado**: Diferenças entre escopos para objetos com estado

### 4. **Spring Properties com @Value** (`4-spring-properties-value/`)
**Conceitos:** Configuração externa, propriedades de aplicação
- **@Value**: Injeção de valores de propriedades externas
- **application.properties**: Arquivo de configuração padrão
- **Valores padrão**: Definição de valores fallback
- **Configuração flexível**: Separação entre código e configuração

### 5. **Spring Configuration Properties** (`5-spring-configuration-properties/`)
**Conceitos:** Configuração tipada, agrupamento de propriedades
- **@ConfigurationProperties**: Mapeamento de propriedades para objetos Java
- **Configuração tipada**: Validação e conversão automática de tipos
- **Agrupamento**: Organização lógica de configurações relacionadas
- **Validação**: Verificação automática de valores de configuração

### 6. **Spring Data JPA com Hibernate** (`6-spring-data-jpa-hibernate/`)
**Conceitos:** Persistência de dados, mapeamento objeto-relacional básico
- **Modelo de dados**: Criação de entidades simples
- **Mapeamento básico**: Estrutura de classes para persistência
- **Integração Hibernate**: Configuração básica do ORM
- **Preparação para JPA**: Base para implementações mais avançadas

### 7. **Spring Data JPA** (`7-spring-data-jpa/`)
**Conceitos:** Repositórios JPA, operações CRUD automáticas
- **@Entity**: Marcação de entidades JPA
- **@Table, @Column**: Mapeamento detalhado para banco de dados
- **JpaRepository**: Interface com métodos CRUD pré-implementados
- **Query Methods**: Criação de consultas através de nomes de métodos
- **@Query**: Consultas JPQL customizadas

### 8. **Spring Data JPA Repository** (`8-spring-data-jpa-repository/`)
**Conceitos:** Repositórios customizados, operações específicas
- **Repository Pattern**: Implementação do padrão repositório
- **Operações customizadas**: Métodos específicos para regras de negócio
- **Separação de responsabilidades**: Lógica de acesso a dados isolada
- **Reutilização**: Componentes reutilizáveis para persistência

### 9. **Spring Boot Web com Swagger** (`9-springboot-web-swagger/`)
**Conceitos:** APIs REST, documentação automática, controladores web
- **@RestController**: Criação de APIs REST
- **@GetMapping, @PostMapping, etc.**: Mapeamento de endpoints HTTP
- **Swagger/OpenAPI**: Documentação automática da API
- **CRUD completo**: Operações Create, Read, Update, Delete
- **Integração web**: Aplicação web funcional

### 10. **Spring Data JPA com Exception Handler** (`10-spring-data-jpa-exception-handler/`)
**Conceitos:** Tratamento global de exceções, tratamento de erros
- **@RestControllerAdvice**: Tratamento global de exceções
- **@ExceptionHandler**: Mapeamento de exceções para respostas HTTP
- **BusinessException**: Exceções de negócio customizadas
- **ResponseError**: Padrão de resposta de erro consistente
- **Tratamento centralizado**: Gerenciamento unificado de erros

### 11. **Spring Web Security com Configure Adapter** (`11-spring-web-security-configure-adapter/`)
**Conceitos:** Segurança web básica, autenticação em memória
- **@EnableWebSecurity**: Habilita segurança web
- **WebSecurityConfigurerAdapter**: Configuração de segurança (deprecated)
- **Autenticação em memória**: Usuários hardcoded para desenvolvimento
- **Controle de acesso**: Restrições baseadas em roles
- **Formulário de login**: Interface de autenticação padrão

### 12. **Spring Web Security com Database** (`12-spring-web-security-database/`)
**Conceitos:** Segurança com banco de dados, usuários persistentes
- **UserDetailsService**: Implementação customizada para autenticação
- **Usuários persistentes**: Autenticação contra banco de dados
- **Integração JPA**: Segurança com dados reais
- **Configuração avançada**: Segurança mais robusta e flexível

### 13. **Spring Security com JWT** (`13-spring-security-jwt/`)
**Conceitos:** Autenticação stateless, tokens JWT, segurança moderna
- **JWT (JSON Web Tokens)**: Autenticação sem estado
- **Stateless authentication**: Não requer sessões no servidor
- **Filtros de segurança**: Interceptação e validação de requests
- **Tokens seguros**: Criptografia e assinatura digital
- **Autorização baseada em claims**: Controle de acesso via payload do token

## 🚀 Como Executar

Cada projeto pode ser executado independentemente:

```bash
# Navegar para o projeto desejado
cd [nome-do-projeto]

# Executar com Maven
mvn spring-boot:run

# Ou compilar e executar
mvn clean compile
mvn spring-boot:run
```

## 📖 Aprendizado Progressivo

Esta sequência de projetos foi projetada para:
1. **Começar com o básico** - conceitos fundamentais do Spring
2. **Progressão gradual** - cada projeto constrói sobre o anterior
3. **Conceitos práticos** - exemplos funcionais e executáveis
4. **Cobertura completa** - desde IoC básico até JWT avançado

## 🛠️ Tecnologias Utilizadas

- **Spring Boot** - Framework principal
- **Spring Data JPA** - Persistência de dados
- **Spring Security** - Segurança e autenticação
- **Hibernate** - ORM
- **Swagger/OpenAPI** - Documentação de APIs
- **JWT** - Autenticação stateless
- **Maven** - Gerenciamento de dependências

## 📝 Notas

- Todos os projetos são independentes e podem ser executados separadamente
- Cada projeto demonstra conceitos específicos do ecossistema Spring
- Ideal para aprendizado progressivo e prática de conceitos
- Configurações podem ser adaptadas para diferentes ambientes

## 👤 Autor

Desenvolvido por **Ariel França**.

## 🤝 Contribuição

Sinta-se à vontade para contribuir com este projeto! Sugestões, melhorias e pull requests são muito bem-vindos. Basta abrir uma issue ou enviar um PR para colaborar.