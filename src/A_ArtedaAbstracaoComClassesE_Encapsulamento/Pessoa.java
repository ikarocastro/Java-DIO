package A_ArtedaAbstracaoComClassesE_Encapsulamento;

public class Pessoa {

    // A gente garante que todos os objetos criados a partir de "Pessoa" vão ter o mesmo formato que as classes abaixo

    public static String test(){
        return "test";
    }


    /*ESSES SÃO NOSSOS ATRIBUTOS (ESTADO DO OBJETO)*/

    // criamos nosso objeto nome
    private String nome;
    // criamos noso objeto age
    private int age;


    /* O metodo Getter se usa para que (Métodos que retornam o valor de um atributo. Convenção: get + NomeDoAtributo.)*/
    public String getNome(){
        return nome;
    }

    public int getAge() {
        return age;
    }

    /*CONSTRUTOR (INICIALIZA O OBJETO)*/

    // String/ parametro name
    public void setName(String name){
        this.nome = name;
    }// Se fizessemos (name = name) teriamos problemas de conflito com o nome que estaria atribuindo a ele mesmo e nao nossa instancia
    // Para resolver isso usamos uma keyworld chamada "this"

    public void setAge(int age){
        this.age = age;
    }

    private static String test2;

    public static void setTest2(String testParam){
        test2 = testParam;
    }

    public static String getTest2(){
        return test2;
    }

}

//Não é legal a gente dar acesso direto a nossas propriedades!
// A gente tem que proteger o acesso das nossas propriedades atraves de metodos get set
//outra coisa é retirar o acesso publico das nossas propriedades e colocando privadas
// Criamos o metodo