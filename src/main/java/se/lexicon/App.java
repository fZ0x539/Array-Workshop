package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        /*int size = NameRepository.getSize();
        System.out.println(size);
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(NameRepository.getSize());
        // call more methods as needed
        NameRepository.clear();
        System.out.println(NameRepository.getSize());
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.find("erik svensson"));
        System.out.println(NameRepository.getSize());
        System.out.println(NameRepository.add("Daniel Karlsson"));
        System.out.println(NameRepository.getSize());
        System.out.println(NameRepository.find("daniel karlsson"));
        System.out.println(NameRepository.add("Daniel Karlsson"));
        System.out.println(Arrays.toString(NameRepository.findByFirstName("erik")));
        System.out.println(Arrays.toString(NameRepository.findByLastName("sVEnsson")));*/

        NameRepository.setNames(new String[]{"Erik Svensson", "erik svensson", "Erik Svenson", "Mehrdad Javan" });
        System.out.println(NameRepository.update("Erik Svensson", "Erik Svenneman"));
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.update("Erik Svensso", "Erik Svenneman"));
        System.out.println(Arrays.toString(NameRepository.findAll()));

    }
}
