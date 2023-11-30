# Doomb Procedural Programming Language

Nesse projeto, decidimos criar a linguagem "doomb, a linguagem que é 'dumb'", ela é capaz de criar funções, avaliar expressões matemáticas corretamente, tem comparações entre múltiplos valores, laços for e while, tipos **string**, **boolean**, **int**, **double** e **number**. A sintaxe foi inspirada em 3 outras linguagens: Haskell, Java e PL/SQL.

A ideia da linguagem além de tudo, foi tentar recriar algo próximo do Kotlin e Scala, em que ambas as linguagens são executadas na própria JVM (Java Virtual Machine).

| O arquivo `grammar (.g4)` se encontra dentro de `src\main\java\org\Grammar`

## Execução

Para executar o compilador, basta ter um arquivo `.doomb` e executar:
```sh
java -cp ./DoombCompiler.jar org.Compiler.Doomb [< DOOMB FILE >][-o < OUTPUT-FOLDER >][--show]

DOOMB FILE  Arquivo que será compilado
--output -o Saída do arquivo compilado
            É um comando opcional, caso omitido, o arquivo
            será compilado na mesma pasta que está o compilador (.jar)
--show      Coloca a saída do código transpilado
            em java na saída padrão (terminal)
```

Após essa etapa, será gerado um arquivo `Out.class`, basta executá-lo com a seguinte linha de comando:

```sh
java < FILE PATH >/Out
```

| Obs.: A aplicação foi criada utilizando a versão 21 do [java](https://www.oracle.com/br/java/technologies/downloads/#jdk21-windows)

## Integrantes

| Integrantes        | RA           |
| ------------------ | ------------ |
| Ashlley Assis      | 125111357458 |
| Gustavo Aciem      | 125111361436 |
| Lucas Mello        | 125111358721 |
| Riley Ramalho      | 125111369125 |
| Victor Hugo        | 125111369125 |