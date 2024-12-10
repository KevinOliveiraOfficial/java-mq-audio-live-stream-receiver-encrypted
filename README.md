# Audio Stream APP via RabbitMQ

## Pré-requisitos

Certifique-se de que os seguintes itens estejam instalados e configurados no seu ambiente:

1. **RabbitMQ**
    - Baixe e instale o RabbitMQ a partir do [site oficial](https://www.rabbitmq.com/docs/download).
    - A fins de teste, não configure senhas no RabbitMQ e deixe a porta padrão.

2. **Java 21**
    - Baixe e instale o JDK 21 a partir do [site oficial da Oracle](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) ou distribuições alternativas como OpenJDK.
    - Verifique se o Java está configurado corretamente:
    ```bash
    java -version
    ```
    A saída deve indicar a versão 21.

3. **Apache Maven 3.9.6**
- Instale o Maven a partir do [site oficial](https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip)
- Verifique a instalação:
    ```bash
    mvn -version
    ```
## Comandos para executar o progama:

1. **Iniciar Servidor RabbitMQ**
    - Certifique-se de que o servidor RabbitMQ esteja em execução em sua máquina.
2. **Compilando e Empacotando o Projeto**
    - Para compilar o projeto, vá até a pasta raíz do projeto e utilize o seguinte comando:
    ```bash
    mvn clean package
    ```

3. **Executando o Aplicativo**
    - Se o projeto gerar um arquivo .jar executável, você pode executá-lo com o comando:
    ```bash
    java -jar target/<NOME_DO_ARQUIVO>.jar
    ```
    - Selecione as opções disponíveis no menu.