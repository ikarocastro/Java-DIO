# O que são Classes ☕

- Uma classe em Java é um modelo ou "planta" que define a estrutura de um objeto (seus atributos e comportamentos)

**ClassesDefinição**: É a estrutura que cria novos tipos de dados.Composição: Contém atributos (variáveis/dados) e métodos (ações/funções).Exemplo prático: A classe Carro pode ter atributos como cor e modelo, e métodos como acelerar()

- Por exemplo Pet que é nossa class, contem o nome do pet, os atributos (está lavado?, está sujo?, (nome.do.Pet) )

# Principio do Encapsulamento 💊

**EncapsulamentoOcultação de dados**: Os atributos são marcados como private, impedindo que outras partes do código alterem os valores diretamente. **Getters e Setters**: São os métodos públicos que controlam como os dados são lidos (get) ou alterados (set).

- Temos os Getters e Setters que são metodos!

# Principio de Herança 👨‍👩‍👧‍👦

- Herança parte do ponto onde temos uma classe pai, e as classes filhos herdam seus atributos.
- para isso nós utilizamos algumas keywords para fazer essa herança acontecer!.

**Primeiro tópico**: Antes de fazerem outras classes herdarem precisamos impedir que alguem mexa no nosso código e tente abalar no hierarquia,
utilizamos a keyword "sealed" para selar nossa classe e outras classes não herdarem nada dela!

Ex: Public sealed class "Class-Pai" essa classe é nossa classe Pai
    
**Segundo tópico**: para classes filhos poderem herdar atributos da classe pai precisamos fazer duas coisas importantes!.
A primeira é precisamos que a classe Pai permita que as classes filhos possam herdar seus atributos e para isso usamos a keyword "Permits", além de que nas classes filhos precisamos da keyword "extends" que serve para extender uma classe.

Ex:(Classe Pai) Public sealed class Name-class "permits" nome-filho, nome-filho2 <br>
Ex:(Classe Fiho) public non-sealed class Class-filho extends Class-Pai

Precismos também que as classes filhos para que possam fazer parte da hierarquia tenham a keyword "non-sealed" para que possam herdar e não dar erro no compilador

Ex: public "non-sealed" class Manager4 extends Class-Pai

**Resumindo**: Herança em Java é um mecanismo que permite que uma classe (filha) herde atributos e métodos de outra classe (pai), promovendo o reuso de código e a organização hierárquica.

# Polimorfismo 🎭

- Polimorfismo (do grego: "muitas formas") é um princípio da Orientação a Objetos que permite que uma mesma ação ou método se comporte de maneiras diferentes, dependendo do objeto que o está executando.

Basicamente ocorre quando uma classe filha (subclasse) herda de uma classe pai e decide reescrever um método existente para ter um comportamento próprio. A decisão de qual método executar é feita durante a execução do programa.

Ex: class Animal { <br>
public void fazerSom() { <br>
System.out.println("O animal faz um som"); <br>
} <br>
}

class Cachorro extends Animal { <br>
@Override <br>
public void fazerSom() { <br>
System.out.println("Au au!"); <br>
    } <br>
}

class Gato extends Animal { <br>
@Override <br>
public void fazerSom() { <br>
System.out.println("Miau!"); <br>
} <br>
}

- Se você chamar a ação fazerSom(), o Java identifica automaticamente se o animal é um Cachorro ou um Gato e executa o som correto.

