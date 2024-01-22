package application;

public class ClassPart1 {
    /*
        Para criar uma classe em Java é bem simples.
        Toda classe segue a regra de camelCase e ela deve ser iniciada com a primeira letra em maiusculo
        Está convensão permite uma maior facilidade para identidicar o que é classe e o que é atributo ou método.

        A criação de classes pode ser feita dentro do diretorio src. E para melhor organização, é preciso criar
        pacotes onde você vai organizar as classes de modo que faça sentido em sua hierarquia de projeto.
        Caso não espcifique um pacote (package) especifico, a classe será colocada no pacote padrão (default)

     */
    public static void main(String[] args) {
        Car car = new Car();
        // car.make(); Tentar chamar um atributo privado diretamente, ocorrerá um erro
        // car.getMake();  Ao usar o get, o chamada é possivel.
        car.setMake("Walksvagem");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        car.describeCar();
    }

}
