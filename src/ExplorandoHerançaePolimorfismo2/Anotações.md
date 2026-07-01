# Herança/Polimorfismo em Java ☕
class Animal {  <br>
void emitirSom() { <br>
System.out.println("Som genérico"); <br>
} <br>
}

class Cachorro extends Animal { <br>
@Override <br>
void emitirSom() { // sobrescrita <br>
System.out.println("Au au"); <br>
} <br>
}

# Diferença entre os termos: 📃

- Sobrescrita (Overriding): uma classe filha redefine um método da classe pai. <br>
- Sobrecarga (Overloading): existem vários métodos com o mesmo nome, mas com parâmetros diferentes.

Para provas, trabalhos e documentação técnica, prefira sobrescrita.

# Se quisermos chamar nossos atributos privados? 🤔

- Até o momento só temos acesso aos metodos get e set, e não aos atributos em si por que eles são privados!
- então como resolvemos isso ?
- Nós não podemos defini-los como "Public" por que se não quebraremos nosso encapsulamento!
- Nesse momento usamos um novo modificador de acesso chamado "Protected".
- Enquanto Public você tem acesso em qualquer parte do código. 
- E private você só tem acesso dentro da classe.

O "Protected" é um pouco mais restritivo que o public, mas, é um pouco mais acessivel que o private!
- Ele não permite acesso de fora da sua classe a menos que a classe que esteja querendo fazer acesso a esse código esteja herdando dessa classe, é uma condição

Ex: ao invez de usarmos o "super."<br>

@Override <br>
public String getCode4() { <br>
return "SL" +  super.getCode4(); <br>
} <br>

Utilizamos o "this.:

@Override <br>
public String getCode4(){ <br>
return "MN" + this.code4; <br>
} <br>

OBS: Com o protected você consegue acessar as propriedades que estão no mesmo packege!.

Para exemplificar criamos o package Domain e tranferimos todos as class menos a main!


# Criando propriedade de calculo de salário! 💵
- Agora queremos que nossas classes tenham uma propriedade que calculem todo o salário delas!
- Mas queremos que elas sejam obrigadas a implementar e não opcional como foi quando sobrescrevemos!
- Como nós não queremos que nossa classe seja abstrata por que é uma das opções, a gente quer implementar um método!
- Mesmo implementando os métodos, cabe a gente como bons programadores 

- Criamos o método getFullSalary para poder fazer todos os cálculos para obtermos o resultado final de salário!

# Sobrecarga de Métodos ⚡

- Vamos supor que você queira passar um extra pro seu manager!

- Basicamente em Java é uma funcionalidade que permite criar múltiplos métodos com o mesmo nome dentro de uma mesma classe

Ex:

    @Override
    public double getFullSalary() {
        return this.salary4 + this.commission4;
    }

    public double getFullSlary(double extra){
        return getFullSalary() + extra;
    }

- Ela serve para reaproveitar o mesmo nome de método para realizar operações semelhantes, tornando o código mais limpo, legível e flexível.

### Regras Principais 📌

- Para sobrecarregar um método, você deve mudar a sua assinatura. A assinatura do método é definida pelo seu nome + parâmetros

- Permitido: Alterar a quantidade de parâmetros.
- Permitido: Alterar os tipos dos parâmetros.
- Proibido: Mudar apenas o tipo de retorno do método. Se os parâmetros forem idênticos, o compilador acusará um erro de duplicidade, mesmo que um retorne int e outro String.