import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("cuso java");
        curso1.setDescricao("descrição cuso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("cuso js");
        curso2.setDescricao("descrição cuso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("Mentoria Java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        out.println("-");
        out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        out.println("XP: " + devCamila.calcularTotalXp());

        out.println("---------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp1);
        out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        out.println("-");
        out.println("Conteudos Inscritos Joao" + devJoao.getConteudosInscritos());
        out.println("Conteudos Concluidos Joao" + devJoao.getConteudosConcluidos());
        out.println("XP: " + devJoao.calcularTotalXp());





    }
}
