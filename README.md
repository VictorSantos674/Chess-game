# ♟️ Chess Game - Jogo de Xadrez em Java

![Chess Banner](https://raw.githubusercontent.com/VictorSantos674/ChessGame/main/src/com/xadrez/resources/images/banner_xadrez.jpg)

## 📌 Sobre o Projeto
Este é um jogo de xadrez desenvolvido em **Java**, estruturado com o padrão **MVC** e utilizando os padrões de projeto **Factory Method** e **Observer**. 
A interface gráfica foi implementada em **JavaFX**, e as configurações do tabuleiro são carregadas dinamicamente a partir de um arquivo **JSON**.

## 🚀 Tecnologias Utilizadas
- **Java 17+**
- **JavaFX**
- **JUnit 5** (Testes automatizados)
- **JSON** (Configuração do tabuleiro)
- **Padrões de Projeto**: **MVC**, **Factory Method**, **Observer**

## 📂 Estrutura do Projeto
```
📦 ChessGame
 ┣ 📂 src
 ┃ ┣ 📂 com.chessgame.controller
 ┃ ┣ 📂 com.chessgame.model
 ┃ ┣ 📂 com.chessgame.observer
 ┃ ┣ 📂 com.chessgame.view
 ┣ 📂 resources
 ┃ ┗ 📜 config.json
 ┣ 📂 test
 ┃ ┗ 📜 ChessTests.java
 ┣ 📜 Main.java
 ┣ 📜 README.md
```

## 🛠️ Como Rodar o Projeto
### 1️⃣ Clone o repositório
```sh
git clone https://github.com/VictorSantos674/ChessGame.git
cd ChessGame
```

### 2️⃣ Compile o projeto
Se estiver usando **Java 17+** com JavaFX instalado:
```sh
javac --module-path /caminho/para/javafx/lib --add-modules javafx.controls,javafx.fxml -d bin src/com/chessgame/Main.java
```

### 3️⃣ Execute o jogo
```sh
java --module-path /caminho/para/javafx/lib --add-modules javafx.controls,javafx.fxml -cp bin com.chessgame.Main
```

## ✅ Funcionalidades
✔️ Movimentos das peças conforme as regras oficiais do xadrez  
✔️ Interface gráfica intuitiva com JavaFX  
✔️ Carregamento dinâmico de configurações via JSON  
✔️ Aplicação de padrões de projeto para maior escalabilidade  
✔️ Testes automatizados para validação das regras  

## 🧪 Testes Automatizados
Para rodar os testes unitários com **JUnit 5**, utilize:
```sh
mvn test
```

## 🏗️ Como Contribuir
1. **Fork** o projeto  
2. Crie uma **branch** (`git checkout -b feature-sua-feature`)  
3. **Commit** suas mudanças (`git commit -m "Descrição da melhoria"`)  
4. Faça um **push** para a branch (`git push origin feature-sua-feature`)  
5. Crie um **Pull Request** no GitHub  

## 📜 Licença
Este projeto está sob a licença **MIT**. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE).

---

🚀 Desenvolvido por [Victor Santos](https://github.com/VictorSantos674)  
Se gostou do projeto, deixe uma ⭐ no repositório! 🎉♟️
