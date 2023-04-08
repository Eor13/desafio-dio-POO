import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso javascript");
        curso2.setDescricao("descrição curso javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcampFull =  new Bootcamp();
        bootcampFull.setNome("Bootcamp Fullstack");
        bootcampFull.setDescricao("Descrição sobre o Bootcamp Fullstack");
        bootcampFull.getConteudos().add(curso1);
        bootcampFull.getConteudos().add(curso2);
        bootcampFull.getConteudos().add(mentoria);

        Bootcamp bootcampJs =  new Bootcamp();
        bootcampJs.setNome("Bootcamp javascript Developer");
        bootcampJs.setDescricao("Descrição sobre o Bootcamp Javascript Developer");
        bootcampJs.getConteudos().add(curso2);

        Bootcamp bootcampJava =  new Bootcamp();
        bootcampJava.setNome("Bootcamp java Developer");
        bootcampJava.setDescricao("Descrição sobre o Bootcamp java Developer");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(mentoria);

        System.out.println("---------------------------------------------");
        Dev devEverson  = new Dev();
        devEverson.setNome("Everson");
        devEverson.inscrevendoBootcamp(bootcampFull);
        System.out.println("Conteúdos inscritos Everson " + devEverson.getConteudosInscritos());
        devEverson.progredir();
        System.out.println("/////////////////////////");
        System.out.println("Conteúdos inscritos Everson " + devEverson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Everson " + devEverson.getConteudosConcluidos());
        System.out.println("XP: "+ devEverson.calcularXpTotal());

        System.out.println("---------------------------------------------");
        Dev devMarcela = new Dev();
        devMarcela.setNome("Marcela");
        devMarcela.inscrevendoBootcamp(bootcampJava);
        System.out.println("Conteúdos inscritos Marcela " + devMarcela.getConteudosInscritos());
        devMarcela.progredir();
        System.out.println("/////////////////////////");
        System.out.println("Conteúdos inscritos Marcela " + devMarcela.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcela " + devMarcela.getConteudosConcluidos());
        System.out.println("XP: "+ devMarcela.calcularXpTotal());

        System.out.println("---------------------------------------------");
        Dev devTheo = new Dev();
        devTheo.setNome("Théo");
        devTheo.inscrevendoBootcamp(bootcampJs);
        System.out.println("Conteúdos inscritos Théo " + devTheo.getConteudosInscritos());
        devTheo.progredir();
        System.out.println("/////////////////////////");
        System.out.println("Conteúdos inscritos Théo " + devTheo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Théo " + devTheo.getConteudosConcluidos());
        System.out.println("XP: "+ devTheo.calcularXpTotal());

    }
}
